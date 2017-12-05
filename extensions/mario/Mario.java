package mario;

import cse131.ArgsProcessor;

public class Mario {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int size = ap.nextInt("size of the mountain for Mario");
		boolean up = ap.nextBoolean("Is the mountain facing up?");
		boolean left = ap.nextBoolean("Is the mountain facing left?");
		
		if(up) {
			if(left) {
				for(int i=0; i < size; ++i) {
					int blank = size-i-1;
					for(int m=0; m < blank; ++m) {
						System.out.print(" ");
					}
					for(int n=0; n < (i+1); ++n) {
						System.out.print("#");
					}
					System.out.println();
				}
			}
			else {
				String pound = "";
				for(int i=0; i < size; ++i) {
					pound = pound + "#";
					System.out.println(pound);
				}
			}
		}
		else {
			if(left) {
				for(int i=0; i < size; ++i) {
					int blank = size-i;
					for(int m=0; m < i; ++m) {
						System.out.print(" ");
					}
					for(int n=0; n < blank; ++n) {
						System.out.print("#");
					}
					System.out.println();
				}
			}
			else {
				for(int i=0; i < size; ++i) {
					int blank = size-i;
					for(int m=0; m < blank; ++m) {
						System.out.print("#");
					}
					for(int n=0; n < i; ++n) {
						System.out.print(" ");
					}
					System.out.println();
				}
			}
		}
	}

}
