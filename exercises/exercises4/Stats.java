package exercises4;

import sedgewick.StdIn;
import cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run
		ArgsProcessor.useStdInput("datafiles/average");

		//
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		//
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		//
		double sum = 0;
		double average = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		int count = 0;

		while (!StdIn.isEmpty()) {
			double n = StdIn.readDouble();
			sum = sum + n;
			count = count + 1;
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}
		average = sum / count;

		System.out.println("Sum " + sum);
		System.out.println("Average " + average);
		System.out.println("Count " + count);
		System.out.println("Max " + max);
		System.out.println("Min " + min);
	}

}
