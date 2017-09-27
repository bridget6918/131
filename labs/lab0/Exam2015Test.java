package lab0;

import cse131.ArgsProcessor;

public class Exam2015Test {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor (args);

		// Exam Summer 2014/5

		// Question 2
		//		int N = ap.nextInt("how many random #");
		//		double min = 0;
		//		for (int i=0; i < N; ++i) {
		//			double random = Math.random();
		//			if (min > random) {
		//				min = random;
		//			}
		//		}
		//		System.out.println(min);

		// Question 3
		//		int N = ap.nextInt();
		//		double [] nums = new double[N];
		//		for (int i=0; i < N; ++i) {
		//			double r = 1.5 * Math.random();
		//			nums[i] = r;
		//		}
		//		int count = 0;
		//		for (int i=0; i < N; ++i) {
		//			if (nums[i] < 0.5) {
		//				count++;
		//			}
		//		}
		//		System.out.println(count);

		// Question 4
		//		String [] ht = new String [20];
		//		int countHead = 0;
		//		int countTail = 0;
		//		int countSide = 0;
		//		for (int i=0; i < ht.length; ++i) {
		//			double random = Math.random();
		//			if (random < 0.5) {
		//				ht[i] = "heads";
		//				countHead++;
		//			}
		//			else if (random > 0.5) {
		//				ht[i] = "tails";
		//				countTail++;
		//			}
		//		}
		//		for (int i=0; i < ht.length; ++i) {
		//			if (Math.random() < 0.01) {
		//				ht[i] = "side";
		//				countSide++;
		//			}
		//		}
		//		for (int i=0; i < ht.length; ++i) {
		//			String tosses = ht[i];
		//			System.out.print(tosses);
		//		}
		//		System.out.println();
		//		System.out.print(countHead + " " + countTail + " " + countSide);


		// Exam Fall 2015
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
		int M = 7; // number of candidates running for the poll

		// Solution 1
		//		for (int c=0; c < M; ++c) {
		//			int count = 0;
		//			for (int i=0; i < N; ++i) {
		//				if (poll[i] - 1 == c) {
		//					count++;
		//				}
		//			}
		//			System.out.println("Candidate " + (c+1) + "received " + count + " votes");
		//		}

		// Solution 2
		int [] count = new int [N];
		int index = 0;

		for (int c=0; c < N; ++c) {
				index = poll[c];
				count[index-1] = count[index-1] + 1;				
		}
		for (int i=0; i < M; ++i) {
			System.out.println("Candidate " + (i+1) + " received " + count[i] + " votes");
		}
	}
}
