package arrays;
import cse131.ArgsProcessor;

public class PascalsTriangle {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor (args);

		int N = ap.nextInt("Number of rows for the triangle?");
		int [][] triangle = new int [N][N];

		// format the output
		System.out.print("    " + "column");
		System.out.println();
		System.out.print("    ");
		for (int i=0; i < N; ++i) {
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println("row");


		for (int r = 0; r < N; ++r) {
			System.out.print(r + "  ");
			for (int c = 0; c < N; ++c) {
				if (c == 0) {
					triangle[r][c] = 1;
				}
				else if (c == r) {
					triangle[r][c] = 1;
				}
				else if (r < 0 || c < 0 || c > r) {
					triangle[r][c] = 0;
				}
				else {
					triangle[r][c] = triangle[r-1][c] + triangle[r-1][c-1];
				}
				if (triangle[r][c] != 0) {
					if (triangle[r][c] < 10) {
						System.out.print(" " + triangle[r][c] + " ");
					}
					else {
						System.out.print(triangle[r][c] + " ");
					}
				}
			}
			System.out.println();
		}

	}		

}
