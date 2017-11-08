package blackjack;

import cse131.ArgsProcessor;

public class BlackJack {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor (args);

		int p = ap.nextInt("How many autonomous palyers?");
		int game = ap.nextInt("How many games to play?");

		int [] score = new int [p+2];
		int [] card = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		boolean bust = false;
		boolean win = false;
		int dealer = 0;
		boolean [] won = new boolean [p+1];
		int humanWin = 0;

		System.out.println("You chose to play " + game + " games" 
				+ "\n" + "There are " + p + " autonomous players playing");
		System.out.println("Player 0 is you, and Player " + (p+1) + " is the dealer");

		// assume score[0] is the human player, and [p+1] is the dealer
		// loop for each game
		for (int i=1; i < game+1; ++i) {
			System.out.println("Game " + i);
			System.out.println("The dealer's face-up card has the value of " + dealer);
			System.out.println("The players' scores are: ");
			int value = 0;
			// loop for each player
			for (int j=0; j < (p+2); ++j) {
				int ini = 0;
				// initial deal of two cards
				for (int m=0; m < 2; ++m) {
					int draw = (int) (Math.random()*100.0*(1.0/13.0));
					ini = ini + card[draw];
				}
				value = ini;
				score[j] = value;
				System.out.print(score[j] + " ");
				System.out.println();
			}

			System.out.println("The dealer's face-up carad has the value of "
					+ card[(int) (Math.random()*100.0*(1.0/13.0))] 
							+ ". And your current count is "
							+ score[0]);

			// human player's decision
			while (score[0] < 21) {
				boolean hit = ap.nextBoolean("Hit (true) or Stand(false)");
				if (hit) { // pick another card
					System.out.println("You hit!");
					score[0] = score[0] + card[(int) (Math.random()*100.0*(1.0/13.0))];
					System.out.println("The dealer's face-up card has the value of "
							+ card[(int) (Math.random()*100.0*(1.0/13.0))] 
									+ ". And your current count is "
									+ score[0]);
				}
				else {
					System.out.println("You chose to stand");
					System.out.println("Player " + 0 + " got " + score[0]);
					break;
				}
			}
			if (score[0] == 21) { // Blackjack!
				won[0] = true;
				humanWin++;
				System.out.println("Player " + 0 + " got Blackjack!"
						+ "\n" + "Player " + 0 + " beats the dealer!");
			}
			else if (score[0] > 21) { // Bust
				won[0] = false;
				System.out.println("Player " + 0 + " Busts! " + score[0]);	
			}

			// autonomous' decision - same rule
			for (int m=1; m < p+1; ++m) {
				while (score[m] < 17) {
					score[m] = score[m] + card[(int) (Math.random()*100.0*(1.0/13.0))];
				}
				if (score[m] == 21) {
					won[m] = true;
					System.out.println("Player " + (m) + " got Blackjack!");
				}
				else if (score[m] > 21) {
					won[m] = false;
					System.out.println("Player " + (m) + " Busts! " + score[m]);
				}
				else {
					System.out.println("Player " + (m) + " got " + score[m]);
				}
			}

			// dealer's decision 
			//	hit until 17 or higher
			while (score[p+1] < 17) {
				score[p+1] = score[p+1] + card[(int) (Math.random()*100.0*(1.0/13.0))];
			}
			if (score[p+1] == 21) {
				System.out.println("Player " + (p+1) + " got Blackjack!");
			}
			else if (score[p+1] > 21) {
				System.out.println("Player " + (p+1) + " Busts! " + score[p+1]);
			}
			else {
				System.out.println("Player " + (p+1) + " got " + score[p+1]);
			} // end of the player loop
			
		// who wins? Did anyone pushed?
		for (int m=0; m < p+1; ++m) {
			if (score[p+1] == score[m]) {
				System.out.println("	Player " + m + " pushed with " + score[m]);
			}
			
			// when did the human player win
			if (score[0] < 21 && score[0] >= score[m]) {
				humanWin++;
			}
		}
		System.out.println();
		} // end of the game loop
		System.out.println("The fraction of human wins was " + (humanWin*1.0/game));
	}
}
