package Arrays;

public class maxProductSubArray {
	
	public static int maxProduct(int [] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int maxValue = nums[0];
		int minValue = nums[0];
		int maxProductSubArray = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] >= 0) {
				maxValue = Math.max(nums[i], maxValue * nums[i]);
				minValue = Math.min(nums[i], minValue * nums[i]);
			}else {
				int temp = maxValue;
				maxValue = Math.max(nums[i], minValue * nums[i]);
				minValue = Math.min(nums[i], temp * nums[i]);
			}
			maxProductSubArray = Math.max(maxProductSubArray, maxValue);
		}
		return maxProductSubArray;
	}
	public static void main(String[] args) {
		int[] arr = {2, 3, -2, 4};
        System.out.println("Maximum product subarray is: " + maxProduct(arr)); // Output: 6
	}

}
