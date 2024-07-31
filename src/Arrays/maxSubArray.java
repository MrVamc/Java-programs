package Arrays;
//leetcode 53
public class maxSubArray {
	
	public static int SubArray(int[] arr) {
		int maximum_subarray = Integer.MIN_VALUE;
		int maximum_current_value = 0;
		
		for(int arr1 : arr) {
			if(maximum_current_value < 0) {
				maximum_current_value = 0;
			}
			maximum_current_value += arr1;
			if(maximum_subarray < maximum_current_value) {
				maximum_subarray = maximum_current_value;
			}
		}
		
		return maximum_subarray;
	}
	
	public static void main(String[] args) {
		int[] nums = {10,-3,8,-4,-2,1,4,6,3,-6};
		System.out.println("Maximum subarray value is : "+ SubArray(nums));
	}

}
