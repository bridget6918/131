package exercises3;

import cse131.ArgsProcessor;

public class TimesTable {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("Max value for table?");

		int[][] time = new int [N + 1][N + 1];
		for (int i = 0; i <= N; ++i) { //include N as well
			for (int j = 0; j <= N; ++j) {
				time[i][j] = i*j;
			}
		}

		// produce labels before making the table
		// labeling the columns
		System.out.print("    ");
		for (int j = 0; j <= N; ++j) {
			System.out.print(j + "  ");
		}
		System.out.println();
		for (int j = 0; j <= N+1; ++j) {
			System.out.print("---");
		}
		System.out.println("");
		// now produce the table
		for (int i = 0; i <= N; ++i) {
			// to label this row
			System.out.print(i + " |");
			for (int j = 0; j <= N; ++j) {
				// print with space to the right but all on the same line
				// to leave 2 space for each number
				int entry = time[i][j];
				if (entry < 10) {
					System.out.print(" " + time[i][j] + " ");
				}
				else {
					System.out.print(time[i][j] + " ");
				}
			}
			System.out.println();
		}

		//  Table should include rows and columns for 0...N  
		//     making N+1 rows and columns

	}

}
