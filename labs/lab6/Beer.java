package lab6;

import cse131.ArgsProcessor;

public class Beer {

	public static String bottlesOfBeer (int n) {
		if (n == 0) {
			return "0 bottles of beer on the wall";
		}
		else {
			return n + " bottles of beer on the wall, " + n + " bottles of beer; you take one down, pass it around, ";
		}
	}
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor (args);
		int n = ap.nextInt("How many to begin with?");
		for (int i=n; i >= 0; --i) {
			System.out.println(bottlesOfBeer(i));
		}
	}

}
