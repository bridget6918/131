package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return 0;  // FIXME
	}
	
	/** 
	 * 
	 * @param a one integer
	 * @param b another integer
	 * @param c the third integer
	 * @return average of the three
	 */
	public static double avg3(int a, int b, int c) {
		double average = (a + b + c) / 3.0;
		return average;
	}
	
	/**
	 * 
	 * @param array an array of doubles
	 * @return sum of the array as a double
	 */
	public static double sumArray(double [] array) {
		double sum = 0;
		for (int i=0; i < array.length; ++i) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	/**
	 * 
	 * @param array an array of doubles
	 * @return average of the array as a double
	 */
	public static double average(double [] array) {
		double average = 0; 
		for (int i=0; i < array.length; ++i) {
			average = sumArray(array) / array.length;
		}
		return average;
	}
	
	/**
	 * 
	 * @param array an array of doubles
	 * @return the max of the array as a double
	 */
	public static double max(double [] array) {
		double max = Double.MIN_VALUE;
		for (int i=0; i < array.length; ++i) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	/**
	 * 
	 * @param s input a string
	 * @return the string begins with the second letter + the first letter + ay
	 */
	public static String pig(String s) {
		return s.substring(1) + s.substring(0, 1) + "ay";
	}

}
