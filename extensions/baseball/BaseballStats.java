package baseball;

import cse131.ArgsProcessor;

public class BaseballStats {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor (args);
		
		String name = ap.nextString("Name of the player");
		int atBats = ap.nextInt("Number of at-bats");
		int hits = ap.nextInt("Number of hits");
		
		double batAvg = ((int)(hits*1000.0/atBats))/1000.0;
		boolean allStar = false;
		
		if (atBats > 200 && batAvg >= 0.270) {
			allStar = true;
		}
		
		System.out.println(name + " " + batAvg);
		System.out.println("All-star worthy? " + allStar);

	}

}
