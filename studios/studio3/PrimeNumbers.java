package studio3;

import cse131.ArgsProcessor;

public class PrimeNumbers {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("Size of the array?");

		// prime array indicates whether the index number is prime
		boolean prime[] = new boolean [n+1];
		for (int i=2; i <= n; ++i) {
			prime[i] = true;
		}
		
		System.out.print("Primes under " + n + " = ");

		// mark multiples
		// instead of making four for loops, we can just use one loop in terms of i.
		// m = 2*i because we want to keep 2, 3, 5, 7, 11 ... as true not false
		// for example, if i = 5, m would be 10, and m = 10 + 5 ... if i = 11, m would be 22, m = 22 + 11
		for (int i=2; i <= n; ++i) {
			for (int m=2*i; m <= n; m = m + i) {  
				prime[m] = false;
			}
			if (prime[i]) {
				System.out.print(i + ", ");
			}
		}
	}
}
