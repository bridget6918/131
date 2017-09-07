package exercises2;

import cse131.ArgsProcessor;

public class Heads {

	public static void main(String[] args) {

		//beginning of the for loop
		for (int number = 0; number < 100; number = number + 1) {

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

			System.out.println("Number of flips was " + numFlips);

			// end of the for loop
		}
	}

}
