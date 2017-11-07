package calculator;

public class Computations {

	/**
	 * Create the static methods as described on the 
	 * description for this assignment.
	 */
	
	/**
	 * 
	 * @param d1 double 1
	 * @param d2 double 2
	 * @return sum
	 */
	public static double addDoubles(double d1, double d2) {
		return d1 + d2;
	}
	/**
	 * 
	 * @param d1 double 1
	 * @param d2 double 2
	 * @return d1 - d2
	 */
	public static double subtractDoubles(double d1, double d2) {
		return d1 - d2;
	}
	/**
	 * 
	 * @param d1 double 1
	 * @param d2 double 2
	 * @return d1/d2
	 */
	public static double divideDoubles(double d1, double d2) {
		if (d2 == 0) {
			return 0;
		}
		else {
			return d1/d2;
		}
	}
	/**
	 * 
	 * @param d1 double 1
	 * @param d2 double 2
	 * @return d1*d2
	 */
	public static double multiplyDoubles(double d1, double d2) {
		return d1*d2;
	}
	/**
	 * 
	 * @param i1 int 1
	 * @param i2 int 2
	 * @return sum
	 */
	public static int addInts(int i1, int i2) {
		return i1 + i2;
	}
	/**
	 * 
	 * @param i1 int 1
	 * @param i2 int 2
	 * @return i1 - i2
	 */
	public static int subtractInts(int i1, int i2) {
		return i1 - i2;
	}
	/**
	 * 
	 * @param i1 int 1 
	 * @param i2 int 2
	 * @return i1/i2
	 */
	public static int divideInts(int i1, int i2) {
		if (i2 == 0) {
			return 0;
		}
		else {
			return i1/i2;
		}
	}
	/**
	 * 
	 * @param i1 int 1
	 * @param i2 int 2
	 * @return i1*i2
	 */
	public static int multiplyInts(int i1, int i2) {
		return i1*i2;
	}
	/**
	 * 
	 * @param s1 String 1
	 * @param s2 String 2
	 * @return combine/concatenation of the two strings
	 */
	public static String concatenate(String s1, String s2) {
		return s1 + s2;
	}
	/**
	 * 
	 * @param b1 boolean 1
	 * @param b2 boolean 2
	 * @return b1 and b2
	 */
	public static boolean andBoolean(boolean b1, boolean b2) {
		return b1 && b2;
	}
	/**
	 * 
	 * @param b1 boolean 1
	 * @param b2 boolean 2
	 * @return b1 or b2
	 */
	public static boolean orBoolean(boolean b1, boolean b2) {
		return b1 || b2;
	}
	/**
	 * 
	 * @param in integer in
	 * @return convert to a double
	 */
	public static double intToDouble(int in) {
		return in*1.0;
	}
	/**
	 * 
	 * @param in double in 
	 * @return in
	 */
	public static double doubleToDouble(double in) {
		return in;
	}
	/**
	 * 
	 * @param in string in
	 * @return error
	 */
	public static double stringToDouble(String in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * 
	 * @param in boolean in
	 * @return error
	 */
	public static double booleanToDouble(boolean in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * 
	 * @param in integer in
	 * @return in
	 */
	public static int intToInt(int in) {
		return in;
	}
	/**
	 * 
	 * @param in double in
	 * @return integer in (casting)
	 */
	public static int doubleToInt(double in) {
		return (int)in;
	}
	/**
	 * 
	 * @param in string in
	 * @return error
	 */
	public static int stringToInt(String in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * 
	 * @param in boolean in
	 * @return error
	 */
	public static int booleanToInt(boolean in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * 
	 * @param in integer  in
	 * @return convert to string
	 */
	public static String intToString(int in) {
		return Integer.toString(in);
	}
	/**
	 * 
	 * @param in double in
	 * @return convert to string
	 */
	public static String doubleToString(double in) {
		return Double.toString(in);
	}
	/**
	 * 
	 * @param in string in
	 * @return in
	 */
	public static String stringToString(String in) {
		return in;
	}
	/**
	 * 
	 * @param in boolean in
	 * @return convert to string
	 */
	public static String booleanToString(boolean in) {
		return Boolean.toString(in);
	}
	/**
	 *  
	 * @param in integer in
	 * @return error
	 */
	public static boolean intToBoolean(int in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * 
	 * @param in double in
	 * @return error 
	 */
	public static boolean doubleToBoolean(double in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * 
	 * @param in string in
	 * @return error
	 */
	public static boolean stringToBoolean(String in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * 
	 * @param in boolean in
	 * @return in
	 */
	public static boolean booleanToBoolean(boolean in) {
		return in;
	}
	
}
