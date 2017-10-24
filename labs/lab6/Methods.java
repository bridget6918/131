package lab6;

public class Methods {
	
	//
	// In this class, implement the f and g functions described on the lab page
	//
	/**
	 * 
	 * @param x integer x
	 * @return if x > 100, x-10, else f(f(x+11))
	 */
	public static int f(int x) {
		if (x > 100) {
			return x - 10;
		}
		else {
			return f(f(x + 11));
		}
	}
	// for f(), if x > 100, it gives x - 10; if x <= 100, it returns 91
	
	/**
	 * 
	 * @param x integer x
	 * @param y integer y
	 * @return g(x-1, g(x, y-1)) or g(x-1, 1) or y+1
	 */
	public static int g(int x, int y) {
		if (x == 0) {
			return y + 1;
		}
		else if (x > 0 && y == 0) {
			return g(x-1, 1);
		}
		else {
			return g(x-1, g(x, y-1));
			// for x=4, y=0, it returns 13
			// for x=4, y=other values, stack over flow error
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//
		// from here, call f or g with the appropriate parameters
		//
		System.out.println(f(87));
		System.out.println(f(91));
		System.out.println(f(113));
		System.out.println(f(1039));
		System.out.println(f(43));
		System.out.println();
		
		System.out.println(g(3,2));
		System.out.println(g(1,100));
		System.out.println(g(4,0));
		System.out.println(g(2,0));
	}

}
