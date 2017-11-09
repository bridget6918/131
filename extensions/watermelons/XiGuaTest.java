package watermelons;

public class XiGuaTest {

	public static int[] allPairSums(int[] nums) {
		int length = nums.length*(nums.length - 1)/2;

		int[] ans = new int [length];  // FIXME compute ans as the result you want
		int m = 0;
		for (int i=0; i < nums.length; ++i) {
			for (int j=i+1; j < nums.length; ++j) {
				ans[m] = nums[i] + nums[j];
				++m;
			}
		}		
		return ans; 
	}
	
	public static void main(String[] args) {
		int test [] = {2, 3, 4};	
		System.out.println(allPairSums(test));
	}

}
