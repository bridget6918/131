package studio4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {

	
	public static void main(String[] args) {
		//
		//  Add code for your studio below here.
		//
		
		// body of the pineapple
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.5, 0.4, 0.18);
		StdDraw.filledCircle(0.5, 0.35, 0.18);
		
		// top of the pineapple part 1
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.setPenRadius(0.01);
		double [] x1 = {0.34, 0.5, 0.37};
		double [] y1 = {0.48, 0.53, 0.7};
		StdDraw.filledPolygon(x1, y1);
		
		// top of the pineapple part 2
		double [] x2 = {0.45, 0.65, 0.65};
		double [] y2 = {0.48, 0.51, 0.7};
		StdDraw.filledPolygon(x2, y2);
		
		// top of the pineapple part 3
		double [] x3 = {0.4, 0.6, 0.5};
		double [] y3 = {0.48, 0.53, 0.7};
		StdDraw.filledPolygon(x3, y3);
		
		// dots on the pineapple
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.45, 0.25, 0.02);
		StdDraw.filledCircle(0.57, 0.31, 0.02);
		StdDraw.filledCircle(0.37, 0.38, 0.02);
		StdDraw.filledCircle(0.5, 0.4, 0.02);
		StdDraw.filledCircle(0.63, 0.42, 0.02);
		
		// black rectangle around
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.5);
		
		// display name of the country
			StdDraw.text(0.3, 0.9, "Pineapple Kingdom!");
			StdDraw.text(0.75, 0.3, "Pineapple Kingdom!");
			StdDraw.text(0.5, 0.5, "Pineapple Kingdom!");
			StdDraw.text(0.45, 0.7, "Pineapple Kingdom!");
			
			ArgsProcessor.useStdInput("music");

	        // repeat as long as there are more integers to read in
	        while (!StdIn.isEmpty()) {

	            // read in the pitch, where 0 = Concert A (A4)
	            int pitch = StdIn.readInt();

	            // read in duration in seconds
	            double duration = StdIn.readDouble();

	            // build sine wave with desired frequency
	            double hz = 440 * Math.pow(2, pitch / 12.0);
	            int N = (int) (StdAudio.SAMPLE_RATE * duration);
	            double[] a = new double[N+1];
	            for (int i = 0; i <= N; i++) {
	                a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
	            }

	            // play it using standard audio
	            StdAudio.play(a);
	        }
		
	}

}
