package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.point(0.3, 0.3);
		// larger green point
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.setPenRadius(.05);
		StdDraw.point(0.7, 0.15);
		// unfilled red triangle
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.02);
		StdDraw.line(0, 0, 0, 0.5);
		StdDraw.line(0, 0.5, 0.25, 0);
		StdDraw.line(0.25, 0, 0, 0);
		// yellow circle, filled
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.3, 0.7, 0.08);
		// filled blue rectangle
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.7, 0.4, 0.02, 0.04);


	}

}
