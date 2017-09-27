package onerepmax;

import cse131.ArgsProcessor;

public class OneRepMax {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor (args);
		// Prompt the user for inputs
		int weight = ap.nextInt("Successful Weight Lifted");
		int r = ap.nextInt("Reps Performed (2 to 12)");

		if (r > 12 || r < 2) {
			System.out.println("Please enter a number between 2 and 12");
		}

		else {			
			int rWant = ap.nextInt("Reps wanted to perform (2 to 12)");

			if (rWant > 12 || rWant < 2) {
				System.out.println("Please enter a number between 2 and 12");
			}

			else {
				System.out.println("Successful weight: " + weight + " pounds" + "\n"
						+ "Successful reps:" + r + "\n"
						+ "Desired reps: " + rWant);
				System.out.println();

				int max = (int) (weight*(1.0 + r / 30.0)); // Epley formula
				int wPercent = 0; 
				int numRep = 1;
				int wWant = (int) (Math.round((max / (1.0 + rWant / 30.0) - 2.5)));

				if (max % 5 > 2.5) {
					System.out.println("One-rep max: " + (max - max%5));
				}
				else  if (max % 5 < 2.5 && max % 5 != 0){
					System.out.println("One-rep max: " + (max - max%5 + 5));
				}
				else if (max % 5 == 0) {
					System.out.println("One-rep max: " + max);
				}
				System.out.println("Weight for " + rWant + " reps: " + wWant);

				for (double percent = 0.95; percent > 0.45; percent = percent - 0.05) {
					wPercent = (int) (((Math.round(percent*100.0))/100.0)*max);
					numRep++;

					if (wPercent % 5 > 2.5) {
						System.out.println(Math.round(percent*100) + "% 1 RM: " + (wPercent - wPercent%5));
					}
					else  if (wPercent % 5 < 2.5 && wPercent % 5 != 0){
						System.out.println(Math.round(percent*100) + "% 1 RM: " + (wPercent - wPercent%5 + 5));
					}
					else if (wPercent % 5 == 0) {
						System.out.println(Math.round(percent*100) + "% 1 RM: " + wPercent);
					}			
				}
			}
		}
	}

}
