package exercises2;

import cse131.ArgsProcessor;

public class FeetInches {

	public static void main(String[] args) {
		//
		// Prompt the user for a number of inches
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int inches = ap.nextInt("Enter inches:");
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		//
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//
		int feet = inches / 12;
		int inchesLeft = inches % 12;
		// if statement to determmine whether singular or plural
		if (feet == 1) {
			if (inchesLeft == 1) {
				System.out.println(inches + " inches will produce: "
						+ feet + " foot and "
						+ inchesLeft + " inch");
			}
			else {
				System.out.println(inches + " inches will produce: "
						+ feet + " foot and "
						+ inchesLeft + " inches");
			}
		}
		else {
			if (inchesLeft == 1) {
				System.out.println(inches + " inches will produce: "
						+ feet + " feet and "
						+ inchesLeft + " inch");
			}
			else {System.out.println(inches + " inches will produce: "
						+ feet + " feet and "
						+ inchesLeft + " inches");
			}
		}

	}

}
