package lab5;

public class Lab5Methods {

	/**
	 * 
	 * @param n an integer n
	 * @return the sum of the positive integers n + (n-2) + (n-4) + ...
	 */
	public static int sumDownBy2(int n) {
		int sum = 0;
		for (int i=0; i < n; i=i+2) {
			if (n-i > 0) {
				sum = sum + n - i;
			}
		}
		return sum;
	}

	/**
	 * 
	 * @param n a positive integer n
	 * @return the sum of 1 + 1/2 + 1/3 + ... + 1/n
	 */
	public static double harmonicSum(int n) {
		double sum = 0;
		for (int i=n; i > 0; --i) {
			sum = sum + (1.0/i);
		}
		return sum;
	}

	/**
	 * 
	 * @param k a non-negative integer k
	 * @return the sum 1 + 1/2 + ... + 1/Math.pow(2,k)
	 */
	public static double geometricSum(int k) {
		double sum = 0;
		for (int i=0; i <= k; ++i) {
			sum = sum + 1.0/Math.pow(2, i);
		}
		return sum;
	}

	/**
	 * 
	 * @param j a positive integer j
	 * @param k another positive integer k
	 * @return product of j*k
	 */
	public static int multPos(int j, int k) {
		int mult=0;
		for (int i=0; i < j; ++i) {
			mult = mult + k;
		}
		return mult;
	}

	/**
	 * 
	 * @param j an integer j
	 * @param k another integer k
	 * @return product of j*k
	 */
	public static int mult(int j, int k) {
		int mult = multPos(Math.abs(j), Math.abs(k));
		if (j<0 && k>0 || k<0 && j>0) {
			mult = -mult;
		}
		else if (j==0 || k==0) {
			mult = 0;
		}
		return mult;
	}

	/**
	 * 
	 * @param n an integer n
	 * @param k a non-negative integer k
	 * @return the value of n to the power k
	 */
	public static int expt(int n, int k) {
		int expt = 1;
		if (k == 0) {
			expt = 1; 
		}
		else if (k > 0) {
			if (n >= 0) {
				for (int i=0; i<k; ++i) {
					expt = expt * n;
				}
			}
			else {
				if (k%2 == 0) {
					for (int i=0; i<k; ++i) {
						expt = expt * n;
					}
				}
				else {
					for (int i=0; i<k; ++i) {
						expt = expt * n;
					}
				}
			}
		}
		return expt;
	}
}
