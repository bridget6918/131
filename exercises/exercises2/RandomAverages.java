package exercises2;

public class RandomAverages {

	public static void main(String[] args) {
		//
		// Write a loop that computes the average
		//     of 1, 2, ... 1000 doubles
		// In each iteration of that loop, print
		//     the average of the doubles generated
		//     thus far.
		//
		// Your code goes below here.
		int i = 0;
		double number = 0;
		while (i < 1000) {
			double avg = number / i;
			i = i + 1;
			number = number + Math.random();
			if (i % 100 == 0) {
				System.out.println("As of " + i + " , the average is " + avg);
			}
		}
		
		//
		//  Some questions:
		//    1) How does the average change as your loop progresses?
		//    2) Can you write code in your loop that prints out the average only
		//         every 100 iterations, instead of each iteration?
		//	Answers: 
		//		1) The average approaches 0.5. 

	}

}
