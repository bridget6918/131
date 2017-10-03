package lab4;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int ball = ap.nextInt("Number of balls:");
		int iteration = ap.nextInt("Number of iterations:");
		int pause = ap.nextInt("Enter pause time:");

		// set the scale of the coordinate system
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);

		double [] rx = new double [ball];
		double [] ry = new double [ball];
		double [] vx = new double [ball];
		double [] vy = new double [ball];

		// initial values
		double radius = 0.05;              // radius

		// main animation loop
		for (int i=0; i < ball; ++i)  { 

			rx[i] = Math.random();
			ry[i] = Math.random();
			vx[i] = Math.random()*0.5;
			vy[i] = Math.random()*0.5;
		}

		for (int i=0; i < iteration; ++i) {
			for (int j=0; j < ball; ++j) {

					double dist = Math.sqrt((Math.pow((rx[j]), 2)) + (Math.pow((ry[j]), 2)));

					// bounce off wall according to law of elastic collision
					if (Math.abs(rx[j] + vx[j]) > 1.0 - radius) {
						vx[j] = -vx[j];
					}
					if (Math.abs(ry[j] + vy[j]) > 1.0 - radius) {
						vy[j] = -vy[j];
					}

					// if the balls collide
					if (dist <= radius*2) {
						vx[j] = - vx[j];
						vy[j] = - vy[j];
						rx[j] = - rx[j];
						ry[j] = - ry[j];
					}

					// update position
					rx[j] = rx[j] + vx[j]; 
					ry[j] = ry[j] + vy[j]; 
					
					// draw ball on the screen
					if(rx[j] < 0)
					{
						StdDraw.setPenColor(StdDraw.GREEN);
					}
					else
					{
						StdDraw.setPenColor(StdDraw.BLUE);
					}
					StdDraw.filledCircle(rx[j], ry[j], radius); 

					// display and pause for 20 ms
					StdDraw.show(pause); 
				}
				// clear the background
				StdDraw.clear();
			}
	}

}
