package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor (args);
		int n = ap.nextInt("How much history to keep?");

		StdDraw.setPenColor(Color.RED);
		
		// use an array to keep the history of where the mouse has been
		double [] histX = new double [n];
		double [] histY = new double [n];
		
		int cur = 0; // current value of the mouse
		
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			// create a ball (circle) that follows the mouse
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
			
			histX[cur] = x;
			histY[cur] = y;
			if (cur >= histX.length) {
				cur = 0;
			}
			int oldest = cur;
			
			StdDraw.filledCircle(histX[oldest], histY[oldest], 0.05);
			
			//  
			// End of your frame
			//
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
			StdDraw.show(20);
		}

	}

}
