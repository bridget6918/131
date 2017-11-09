package lab0;

import sedgewick.StdDraw;

public class Exam2 {

	// non-recursive, use iterations
	public static int f(int n) {
		if (n < 0) {
			return 0;
		}
		else {
			int sum = 0;
			for (int i=n; i >= 0; i=i-3) {
				sum = sum + i;
			}
			return sum;
		}
	}
	
	// recursion
	public static int f2(int n) {
		if (n < 0) {
			return 0;
		}
		else {
			return n + f2(n-3);
		}
	}
	
	// draw circles recursively
	public static void circles(double x, double y, double r) {
		if (r < 0.01) { // base case
			return; 
		}
		StdDraw.circle(x, y, r); // recursive call
		StdDraw.pause(50);
		circles(x, y, 0.9*r);
	}
	
	// draw squares recursively
	public static void squares(double x, double y, double r) {
		if (r < 0.05) {
			return;
		}
		StdDraw.square(x, y, r);
		squares(x, y, (r-0.03));
	}
	
	public static boolean isOdd(int n) {
		if (n>=2) {
			return isOdd(n-2);
		}
		else if (n == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int num131s(int[] a, int s, int e) {
		int num = 0;
		for (int i=0; i < e; ++i) {
			if (a[i] == 131) {
				num++;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
//		System.out.println(f(3));		
//		System.out.println(f2(7));
//		circles(0.5, 0.5, 0.5);
//		squares(0.5, 0.5, 1);
//		System.out.println(isOdd(21));
		int[] a = {131, 254, 1, 131, 131, 55};
		System.out.println(num131s(a, 0, a.length));
		
	}

}
