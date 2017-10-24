package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles {

	public static void tri(double x, double y, double size) {
		if (size < 0.05) {
			StdDraw.setPenColor(Color.BLACK);
			double [] llx = {x, x+size, x+size*0.5};
			double [] lly = {y, y, y+size};
			StdDraw.filledPolygon(llx, lly);
			return;
		}
		StdDraw.line(x+size/2, y, x+size*0.75, y+size/2);
		StdDraw.line(x+size*0.75, y+size/2, x+size*0.25, y+size/2);
		StdDraw.line(x+size*0.25, y+size/2, x+size/2, y);
		tri(x, y, size/2);
		tri(x+size/2, y, size/2);
		tri(x+size*0.25, y+size/2, size/2);
	}

	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		double [] xO = {0, 0.5, 1};
		double [] yO = {0, 1, 0};
		StdDraw.polygon(xO, yO);
		tri(0, 0, 1);
	}

}
