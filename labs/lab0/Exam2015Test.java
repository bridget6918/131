package lab0;

import cse131.ArgsProcessor;

public class Exam2015Test {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor (args);
		//		Question #2
//		int N = ap.nextInt("How many random numbers?");
//		int num = 0;
//		
//		// beginning of the loop
//		for (int i = 0; i <= N; ++i) {
//			if (Math.random() < 0.5) {
//				num++;
//			}
//		}
//		System.out.println("You asked for " + N + " random numbers.");
//		System.out.println("Of those, " + num + " were less than 0.5.");
		
		// Question #3
//		double d = 500.0/30.0;
//		double r1 = d * 100.0;
//		double r2 = d/100.0;
//		int k = (int) d;
//		String s = String.valueOf(((int) r1)/100.0);
//		System.out.println(d + "\n" + r1 + "\n" + r2 + "\n" + k + "\n" + s);

		// Question #4
		int N = 8; // number of people being polled
		int [] poll = {3, 1, 3, 7, 6, 1, 3, 2};
		int M = 0; // number of candidates running for the poll
		for (int i=0; i < N; ++i) {
			if (M < poll[i]) {
				M = poll[i];
			}
		}
		for (int c=0; c < M; ++c) {
			int [] vote = new int [M+1];
			int getVote = poll[c];
			vote[getVote] = vote[getVote] + 1;
			System.out.println("Candidate " + (c+1) + " received " + vote[c] + " votes");
		}
	}

}
