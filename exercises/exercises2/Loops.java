package exercises2;

public class Loops {

	public static void main(String[] args) {
		//
		// Some helpful information:
		//    System.out.print(i);
		// will print the value of i but not skip to a new line
		// in the output
		//
		//    System.out.print(i + "  ");
		// will print the value of i with a few spaces after it, also
		// not skipping to a new line
		//
		//    System.out.print();
		// skips to the next line
		//
		//
		
		//
		// Below each of the following comments,
		//   write code using a while loop
		//   that produces the specified sequence
		// Each loop will be preceded by a statement
		//   that initializes an int variable
		// Each loop's predicate will control how long it
		//   executes
		// Each loop will contain a statement to bump (change)
		//   the int variable
		//
		// To get the most out of this exercise:
		//
		// Move from one loop to the next by 
		//   * changing the starting value
		//   * changing the loop predicate, for example, from <= to <
		//   * changing the loop bump, for example, from i=i+1 to i=i+2
		//
		// Do the best you can here, and then view the solution video
		//
		
		
		
		// 0 to 9 inclusively
		//    produces  0 1 2 3 4 5 6 7 8 9
		int i1 = 0;
		while (i1 <= 9) {
			System.out.print(i1 + " ");
			i1 = i1 + 1;
		}
		System.out.println();
		
		// 1 to 10 inclusively
		//    produces 1 2 3 4 5 6 7 8 9 10
		int i2 = 1;
		while (i2 <= 10) {
			System.out.print(i2 + " ");
			i2 = i2 + 1;
		}
		System.out.println();
		
		// 0 to 10, including 0, excluding 10
		//    produces 0 1 2 3 4 5 6 7 8 9
		int i3 = 0;
		while (i3 < 10) {
			System.out.print(i3 + " ");
			i3 = i3 + 1;
		}
		System.out.println();
		
		// like the one above, but jumping by 2
		//    produces 0 2 4 6 8
		int i4 = 0;
		while (i4 < 10) {
			System.out.print(i4 + " ");
			i4 = i4 + 2;
		}
		System.out.println();
	}

}
