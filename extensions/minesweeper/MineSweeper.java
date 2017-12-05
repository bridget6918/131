package minesweeper;

import cse131.ArgsProcessor;

public class MineSweeper {

	public static void main (String[] args) {

		//
		// Do not change anything between here ...
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int cols = ap.nextInt("How many columns?");
		int rows = ap.nextInt("How many rows?");
		double percent = ap.nextDouble("What is the probability of a bomb?");
		//
		// ... and here
		//
		//  Your code goes below these comments
		//

		// grid and solution
		boolean [][] grid = new boolean[rows+2][cols+2];
		int [][] sol = new int [rows+2][cols+2];
		String [][] gridS = new String[rows+2][cols+2];
		String [][] solS = new String[rows+2][cols+2];

		// the grid array
		for (int i=1; i <= rows; ++i) {
			for (int j=1; j <= cols; ++j) {
				grid[i][j] = Math.random() < percent;

				if(grid[i][j]) {
					gridS[i][j] = "*";
					solS[i][j] = "*";
				}
				else {
					gridS[i][j] = ".";
				}
			}
		}
		
		// the solution array
		for (int i=1; i <= rows; ++i) {
			for (int j=1; j <= cols; ++j) {
				for (int m=i-1; m <= i+1; ++m) {
					for (int n=j-1; n <= j+1; ++n) {
						if(grid[m][n]) {
							sol[i][j]++;
						}
					}
				}
			}
		}

		// print the two arrays
		for (int i=1; i <= rows; ++i) {
			for (int j=1; j <= cols; ++j) {
				if(solS[i][j] != "*") {
					solS[i][j] = sol[i][j] + "";
				}
				System.out.print(gridS[i][j] + " ");
			}
			System.out.print("\t");
			for (int k=1; k <= cols; ++k) {
				System.out.print(solS[i][k] + " ");
			}
			System.out.println();
		}
	}
}
