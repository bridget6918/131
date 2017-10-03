package lab4;

import java.awt.Color;

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
			vx[i] = Math.random()*0.005;
			vy[i] = Math.random()*0.005;
		}

		for (int i=0; i < iteration; ++i) {
			for (int j=0; j < ball; ++j) {
				for (int b=0; b < ball; ++b) {


					// bounce off wall according to law of elastic collision
					if (Math.abs(rx[j] + vx[j]) > 1.0 - radius) {
						vx[j] = -vx[j];
					}
					if (Math.abs(ry[j] + vy[j]) > 1.0 - radius) {
						vy[j] = -vy[j];
					}

					rx[j] = rx[j] + vx[j];
					ry[j] = ry[j] + vy[j];

					// if the balls collide
					if (i!=b) {
						double dist = Math.sqrt((Math.pow((rx[j]-rx[b]), 2)) + (Math.pow((ry[j]-ry[b]), 2)));
						if (dist <= radius*2.0) {
							vx[j] = - vx[j];
							vy[j] = - vy[j];
							vx[b] = - vx[b];
							vy[b] = - vy[b];
							// update position
							rx[j] = rx[j] + vx[j]; 
							ry[j] = ry[j] + vy[j]; 
							rx[b] = rx[b] + vx[b];
							ry[b] = ry[b] + vy[b];
						}
					}
				}
				StdDraw.setPenColor(Color.BLUE);
				StdDraw.filledCircle(rx[j], ry[j], radius); 
			}
			StdDraw.show(pause); 
			StdDraw.clear();
		}
	}
}
