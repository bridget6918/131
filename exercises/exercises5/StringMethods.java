package exercises5;

public class StringMethods {

	//
	// Below are the methods defined for this exercise
	//   The names are not prescribed in the assignment, so choose
	//   names you like (that are meaningful)
	//

	//
	// First one is completed for you:
	//

	public static String selfConcat(String s) {
		return nConcat(s, 2);
	}

	public static String nConcat(String s, int n) {
		String [] sN = new String [n];
		for (int i=0; i < n; ++i) {
			sN[i] = s;
		}
		return join(sN, "");
	}

	public static String join(String[] array, String joiner) {
		// special case when the length of the array is 0
		if (array.length == 0) {
			return "";
		}
		String result = array[0];
		for (int i=1; i < array.length; ++i) {
			result = result + joiner + array[i];
		}
		return result;
	}

	public static void main(String[] args) {

		//
		// Testing the methods
		//
		System.out.println(selfConcat("echo"));
		System.out.println(nConcat("pine", 3));

		String s = "I love chocolate and ice cream.";
		String [] words = s.split(" ");
		for (String w : words) {
			System.out.println("A word: " + w);
		}
		System.out.println("Back together: " + join(words, " "));
	}

}
