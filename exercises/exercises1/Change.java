package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int initialPennies = ap.nextInt("Number of Pennies?");
		
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
				
		int dollars = initialPennies/100;
		int penniesAfterDollars = initialPennies%100;
		int quarters = penniesAfterDollars/25;
		int penniesAfterQuarters = penniesAfterDollars%25;
		int dimes = penniesAfterQuarters/10;
		int penniesAfterDimes = penniesAfterQuarters%10;
		int nickels = penniesAfterDimes/5;
		int penniesAfterNickels = penniesAfterDimes%5;
		int penniesLeft = initialPennies - (dollars*100 + quarters*25 + dimes*10 + nickels*5);
		
		System.out.println("For X amount of pennies: ");
		System.out.println(dollars + " dollars");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(penniesLeft + " pennies");
	}

}
