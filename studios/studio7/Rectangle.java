package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	private int lengthR;
	private int widthR;
	
	/**
	 * 
	 * @param length length of the rectangle
	 * @param width width of the rectangle
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
		lengthR = width;
		widthR = length;
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
	
	public String toString() {
		return " a rectangle with a length of " + length 
				+ " and a width of " + width;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2, 5);
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
		System.out.println("If Rectangle 1 is rotated, its new length and width become " + r1.lengthR + " and " + r1.widthR);
	}

}
