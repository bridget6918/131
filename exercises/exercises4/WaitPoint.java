package exercises4;

import sedgewick.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		while (!StdDraw.mousePressed()) {
			// do nothing
			StdDraw.pause(100);
		}
		// here, the mouse has been pressed
		System.out.println("Pressed");

		while (StdDraw.mousePressed()) {
			// do nothing
			// to avoid a tight loop
			StdDraw.pause(100);
		}
		// here the mouse is released
		System.out.println("Released");

		// draw a point at the location of the mouse
		StdDraw.setPenRadius(.01);
		StdDraw.point(StdDraw.mouseX(), StdDraw.mouseY());

		// here, a q has been typed
		char gotkey = ' ';
		while (gotkey != 'q') {
			while (!StdDraw.hasNextKeyTyped()) {
				StdDraw.pause(100);
			}
			gotkey = StdDraw.nextKeyTyped();
		}
		if (gotkey == 'q') {
			StdDraw.text(0.5, 0.5, "Farewell!");	
		}

	}

}
