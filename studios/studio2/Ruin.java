package studio2;

import cse131.ArgsProcessor;

public class Ruin {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);

		// Prompt the user for inputs
		int startAmount = ap.nextInt("The amount of money your start with:");
		double winChance = ap.nextDouble("The probability that you win a gamble:");
		int winAmount = ap.nextInt("If you reach this amount of money, you won");
		int totalPlays = ap.nextInt("The number of times you simulate the problem:");
		
		double lossChance = 1 - winChance;
		double ruin = 0;

		if (lossChance != winChance) {
			ruin = (Math.pow((lossChance/winChance), startAmount) 
					- Math.pow((lossChance/winChance), winAmount)) / (1 - Math.pow((lossChance/winChance), winAmount));
		}
		else {
			ruin = 1 - startAmount / winAmount;
		}
		
		int numLoss = 0;

		// beginning of the loop
		for (int numSim = 1; numSim <= totalPlays; numSim++) {
			
			int prize = startAmount;
			int numRounds = 1;
			
			while (prize < winAmount && prize > 0) {
				if (Math.random() < winChance) {
					prize++;
				}
				else {
					prize--;
				}
				numRounds++;
			}
			
			if (prize == 0) {
				numLoss++;
				System.out.println("Simulation " + numSim + "\t" + numRounds + "\t" + "LOSE");
			}
			else {
				System.out.println("Simulation " + numSim + "\t" + numRounds + "\t" + "WIN");
			}
		}
		
		double ruinActual = (double) numLoss*1.0 / totalPlays;
		
		System.out.println("Losses: " + numLoss + "\t" + "Simulations " + totalPlays);
		System.out.println("Actual Ruin Rate: " + ruinActual + "\t" + "Expected Ruin Rate: " + ruin);
	}
}

