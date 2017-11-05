package arrays;
import cse131.ArgsProcessor;

public class Sorting {
	
	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int size = ap.nextInt("size of the collection");
		if (size < 0) {
			size = ap.nextInt("size of the collection");
		}
		
		int [] input = new int [size];
		for (int i=0; i < size; ++i) {
			input[i] = ap.nextInt("Enter an integer");
		}
		
		int sortCount = 0;
		int sum = 0;
		while(sortCount < size) {
			for (int i=sortCount; i < size; ++i) {
				int min = input[sortCount];
				int minIndex = 0;
				if (min > input[i]) {
					min = input[i];
					minIndex = i;
				}
				else {
					min = min;
					minIndex = sortCount;
				}
				input[minIndex] = input[sortCount];
				input[sortCount] = min;
			}
			sortCount++;
		}
		for (int i=0; i < size; ++i) {
			System.out.print(input[i] + " ");
			sum = sum + input[i];
		}
		System.out.println();
		System.out.println("Mean: " + (sum/size*1.0));
		if (size % 2 == 0) {
			System.out.println("Median: " + (input[size/2]+input[size/2-1])/2.0);
		}
		else {
			System.out.println("Median: " + input[(size-1)/2]);
		}
		System.out.println("Min: " + input[0]);
		System.out.println("Max: " + input[size-1]);
		System.out.println("Range: " + (input[size-1] - input[0]));
	}

}
