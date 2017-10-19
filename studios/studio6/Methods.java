package studio6;

public class Methods {

	// Your methods go below this line
	/**
	 * 
	 * @param n int n
	 * @return factorial of n
	 */
	public static int fact(int n) {
		if (n <= 0) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}
	
	/**
	 * 
	 * @param n integer n
	 * @return return Fibonacci series
	 */
	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	/**
	 * 
	 * @param n integer n
	 * @return whether n is an odd number
	 */
	public static boolean isOdd (int n) {
		if (n <= 0) {
			return false;
		}
		else {
			return ! isOdd(n-1);
		}
	}
	
	/**
	 * 
	 * @param a integer a
	 * @param b integer b
	 * @return sum of a and b
	 */
	public static int sum(int a, int b) {
		if (b <= 0) {
			return a;
		}
		else {
			return sum(a+1, b-1);
		}
	}
	
	/**
	 * 
	 * @param n integer n
	 * @return sum of n + (n-2) + (n-2) + ... + 0
	 */
	public static int sumDownBy2(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return n + sumDownBy2 (n - 2);
		}
	}
	
	/**
	 * 
	 * @param n integer n
	 * @return harmonic sum of n (1/n + 1/(n-1) + ... + 1)
	 */
	public static double harmonicSum(double n) {
		if (n == 1.0) {
			return 1.0;
		}
		else {
				return 1.0/n + harmonicSum(n-1);
		}
	}
	
	/**
	 * 
	 * @param a integer a
	 * @param b integer b
	 * @return a*b
	 */
	public static int mult(int a, int b) {
		if (b == 0) {
			return 0;
		}
		else {
			return a + mult(a, b-1);
		}
	}
}
