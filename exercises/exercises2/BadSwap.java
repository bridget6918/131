package exercises2;

import cse131.ArgsProcessor;

public class BadSwap {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int x = ap.nextInt("Enter x");
		int y = ap.nextInt("Enter y");
		
		if (x > y) {
			x = y;     // Bad
			y = x;     // swap!!
		}
		
		System.out.println("x and y are now "
				+ x + " and " + y);
		
		//
		// Student fill in with comments below this line:
		//   Why does the code above *not* swap the values of
		//      x and y?
		//   Note that the bad swap executes only if x>y
		//
		// Your answer:
		//	The first statement in the if bracket
		//		assigns the value of y to x. 
		//	Therefore, after the first statement is executed,
		// 	x and y now have the same value. 
		//	So instead of swapping the values,
		//		it simply replaces the value of x with y, 
		// 		which results in x and y having the same value. 
		//

	}

}
