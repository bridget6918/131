package exercises2;

import cse131.ArgsProcessor;

public class Heads {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor (args);
		int trials = ap.nextInt("How many trials to run?");
		int sumFlips = 0;

		//beginning of the for loop
		for (int number = 0; number < trials; number = number + 1) {

			// what are the concepts?
			int numHeads = 0;
			int numFlips = 0;

			// now flip a coin until we see 10 heads
			while (numHeads != 10) {
				boolean isHeads = Math.random() < 0.5;
				if (isHeads) {
					numHeads = numHeads + 1;
				}
				numFlips = numFlips + 1;

			}
			// here, numHeads should be 10
			sumFlips = sumFlips + numFlips;
			System.out.println("Number of flips was " + numFlips);

			// end of the for loop
		}
		double avg = (double) sumFlips / trials;
		System.out.println("Average number of coin flips to get 10 heads is " + avg);
	}

}
