package DSA;

public class twoSum {
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		for (int i : twoSum(nums, target)) {
			System.out.print(i+ " ");
		}
	}
	
	public static int[] twoSum(int[] num, int target) {
		
		for(int i = 0; i< num.length; i++) {
			for(int j = i+1; j< num.length; j++) {
				
				if(num[j] == target - num[i]) {
					return new int[] {i,j};
				}
				
			}
		}
		
		throw new IllegalArgumentException("No two sums");
	}

}
