package lab3;

import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int d = ap.nextInt("How many dice will be used?");
		int t = ap.nextInt("How many times will the dice be thrown?");	

		System.out.print("Array index    ");
		// indexing the array
		for (int i=0; i < d; ++i) {
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.print("Array contents");

		int sumAll [] = new int [t];
		int sumNum = 0;
		int bound = d*6; // boundaries of the sums
		int sumBound [] = new int [bound]; //include all possible sums

		// loop to throw t times
		for (int j=0; j < t; ++j) {
			System.out.println();
			System.out.print("               ");
			// array to represent results of each throw
			int roll[] = new int [d];
			int sum = 0;
			for (int i=0; i < d; ++i) {
				roll[i]  = (int) (Math.random()*6.0) +1; 
				sum = sum + roll[i];
				System.out.print(roll[i] + " ");
			}
			int index = sum - 1;
			sumBound[index] = sumBound[index] + 1;
			// add the new sum into the sumAll array
			sumAll[j] = sum;
			System.out.print("Sum = " + sum);
		}
		
		
		System.out.println();
		System.out.println("Number of times Sum was seen");
		for (int i=0; i < d*6; ++i) {
			// System.out.print(sumAll[i] + " ");
			if (sumBound[i] != 0) {
				System.out.println((i+1) + " " + sumBound[i] + "/" + t + " ");
			}
		}
	}

}
