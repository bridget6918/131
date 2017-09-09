package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int speedNow = ap.nextInt("What is your current speed?");
		int speedLimit = ap.nextInt("What is the speed limit?");
		
		int over = (speedNow - speedLimit > 0) ? (speedNow - speedLimit) : 0;
		int pastTen = (over - 10 > 0) ? (int) (over - 10)*10 : 0;
		int totalFine = (over != 0) ? 50 + pastTen : 0;
		
		System.out.println("You reported a speed of " + speedNow + " MPH"
				+ " for a speed limit of " + speedLimit + " MPH." + "\n"
				+ "You went " + over + " MPH over the speed limit." + "\n"
				+ "Your fine is $" + totalFine + ".");

	}

}
