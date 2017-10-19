package exercises6;

public class FactorialNoBaseCase {

	public static int factorial(int n) {
		if (n <= 0) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		int ans = factorial(2);
		System.out.println("Answer is " + ans);
	}
}
// for the question mentioned in the video, the problem with it
// 	is that there could be a stack overflow problem
//	there will be infinite number of baby inside a baby inside the woman
//	and that would keep going on and on forever ... 
