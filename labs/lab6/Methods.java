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
			// when x = 4, y will be 0, so stackoverflow
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
		System.out.println(g(3,2));
	}

}
