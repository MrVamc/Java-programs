package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

//leetcode 238
public class productOfArrayExceptSelf {
	
	public static int[] productofArray(int[] nums) {
		
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		int[] output = new int[nums.length];
		int n = nums.length;
		
		left[0] = 1;
		right[n-1] = 1;
		
		for(int i = 1; i<n ; i++) {
			
			left[i] = left[i-1]*nums[i-1];
			
		}
		
		for(int i = n-2; i>=0 ; i--) {
			
			right[i] = right[i+1]*nums[i+1];
			
		}
		
		for(int i =0; i<n ; i++) {
			
			output[i] = left[i]*nums[i];
			
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,4,6,8};
		System.out.println( "product of Array except itself is : " + Arrays.toString(productofArray(nums)));
	}
}
