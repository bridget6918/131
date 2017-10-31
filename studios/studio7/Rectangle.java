package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	
	/**
	 * 
	 * @param length length of the rectangle
	 * @param width width of the rectangle
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	/**
	 * 
	 * @return calculates the area of the rectangle
	 */
	public int area() {
		return width*length;
	}
	
	/**
	 * 
	 * @return calculate the perimeter of the rectangle
	 */
	public int perimeter() {
		return (width + length)*2;
	}
	
	/**
	 * 
	 * @return whether the rectangle is in fact a square
	 */
	public boolean isSquare() {
		if (width == length) {
			return true;
		}
		else {
			return false;
		}
	}

	public Rectangle createRotated90() {
		Rectangle result = new Rectangle(this.width, this.length);
		return result;
	}
	
	public String toString() {
		return " a rectangle with a length of " + length 
				+ " and a width of " + width;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2, 5);
		
		Rectangle r1Flipped = r1.createRotated90();
		Rectangle r2 = new Rectangle(3, 3);
		if (r1.area() > r2.area()) {
			System.out.println("Rectangle 1, " + r1 + " has a greater area of " + r1.area());
		}
		else {
			System.out.println("Rectangle 2, " + r2 + " has a greater area of " + r2.area());
		}
		System.out.println("Is Rectangle 1 a square? " + r1.isSquare());
		System.out.println("Is Rectangle 2 a square? " + r2.isSquare());
		
		System.out.println();
	}

}
