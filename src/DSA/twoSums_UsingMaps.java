package DSA;

import java.util.HashMap;
import java.util.Map;

public class twoSums_UsingMaps {
	
	public static void main(String[] args) {
		int nums[] = {4,5,2,3};
		int target = 8;
		for (int i : twoSums(nums, target)) {
			System.out.print(i+ " ");
		}
	}
	
	public static int[] twoSums(int[] num, int target) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i = 0; i < num.length; i++) {
			int complement = target - num[i];
			if(m.containsKey(complement)) {
				return new int[] {m.get(complement),i};
			}
			m.put(num[i], i);
		}
		
		throw new IllegalArgumentException("No two sums");
	}

}
