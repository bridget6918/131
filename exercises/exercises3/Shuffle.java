package exercises3;

public class Shuffle {

	public static void main(String[] args) {
		String[] original = { "A", "B", "C", "D",
				"E", "F", "G", "H"
		};
		
		// copy the original array
		String[] shuffled = new String[original.length];
		for (int i = 0; i < original.length; ++i) {
			shuffled [i] = original [i];
		}
		// to iterate backwards
		for (int i = shuffled.length - 1; i >= 0; --i) {
			// this will generate an integer from 0 to i
			int c = (int) (Math.random() * (i + 1)); 
			// once the number/card is generated, 
			// we want to pick the card and set it to the array
			shuffled[i] = original[c];
			
			// a loop that moves all the cards up from c+1 to length-1
			for (int j = c; j < shuffled.length - 1; ++j) {
				original[j] = original[j+1];
			}
		}

		// print out original array
		for (int i=0; i < original.length; ++i) {
			System.out.println("Original at " + i + " is " + original[i]);
		}
		
		// print out the shuffled array
		for (int i = 0; i < shuffled.length; ++i) {
			System.out.println("Shuffled at " + i + " is " + shuffled[i]);
		}
		

		//
		// Follow the instructions on the web page to make a copy of
		// the original array, named shuffled, but with its elements
		// permuted from the original array.  The result is that the
		// shuffled array contains the same strings, but in a randomized
		// order.
		//

	}
	
}