package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor (args);
		int n1 = ap.nextInt("Enter a pitch 1: ");
		int n2 = ap.nextInt("Enter a pitch 2: ");
		int pitch7 = n1 + 7;
		double frequency1 = 440.0 * Math.pow(2, n1/12.0);
		double frequency2 = 440.0 * Math.pow(2, n2/12.0);
		double frequency7 = 440.0 * Math.pow(2, pitch7/12.0);
		double ratio = frequency2 / frequency1;
		System.out.println("Pitch " + n1);
		System.out.println("Pitch " + n2);
		System.out.println("ratio  is " + ratio);
		
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A


	}

}
