package lab2;

import cse131.ArgsProcessor;

public class Nim {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);

		// Prompt the user for inputs
		boolean startHuman = ap.nextBoolean("Do you wanna start?");
		int numBegin = ap.nextInt("How many sticks to start with?");

		int numRound = 0;
		int numLeft = numBegin;
		boolean humanNext = false; // change this to alter turns

		// Loop beings here
		while (numLeft > 0) {
			int n = numLeft; // store previous numLeft in n
			if (numRound == 0) {				
				if (startHuman) {
					int numRemoveMan = ap.nextInt("Enter either 1 or 2");
					while (numRemoveMan !=1 && numRemoveMan != 2) {
						numRemoveMan = ap.nextInt("Please enter either 1 or 2");
					}
					numLeft = numBegin - numRemoveMan;
					humanNext = false;
					System.out.println("Human starts");
					System.out.println("Round " + numRound + ", "
							+ numBegin + " sticks at start, "
							+ "human took " + numRemoveMan + ", "
							+ "so " + numLeft + " sticks remain");
				}
				else {
					int numRemoveComp = Math.random() < 0.5? 1 : 2;
					numLeft = numBegin - numRemoveComp;
					humanNext = true;
					System.out.println("Computer starts");
					System.out.println("Round " + numRound + ", "
							+ numBegin + " sticks at start, "
							+ "computer took " + numRemoveComp + ", "
							+ "so " + numLeft + " sticks remain");
				}
				numRound++;
			}
			else {
				if (humanNext == false) { // this round computer plays
					int numRemoveComp = Math.random() < 0.5? 1 : 2;
					if (numLeft - numRemoveComp < 0) {
						System.out.println("You cannot remove more sticks that what are left");;
					}
					else {
						numLeft = n - numRemoveComp;
						humanNext = true; // make it human again
						System.out.println("Round " + numRound + ", "
								+ n + " sticks at start, "
								+ "computer took " + numRemoveComp + ", "
								+ "so " + numLeft + " sticks remain");
					}
				}
				else { // this round human plays
					int numRemoveMan = ap.nextInt("How many sticks do you remove?");
					while (numRemoveMan !=1 && numRemoveMan != 2) {
						numRemoveMan = ap.nextInt("Please enter either 1 or 2");
					}
					if (numLeft - numRemoveMan < 0) {
						System.out.println("You cannot remove more sticks that what are left");
					}
					else {
						numLeft = n - numRemoveMan;
						humanNext = false; // make it computer again
						System.out.println("Round " + numRound + ", "
								+ n + " sticks at start, "
								+ "human took " + numRemoveMan + ", "
								+ "so " + numLeft + " sticks remain");
					}
				}
				numRound++;
			}
		}

		if (numLeft == 0) {
			if (humanNext == true) {
				System.out.println("Computer wins!");	
			}
			else {
				System.out.println("Human wins!");
			}
		}

	}

}
