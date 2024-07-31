	1- Kadane’s Algorithm is a popular method used to solve the maximum subarray problem, which involves finding the contiguous subarray with the largest sum within a given array of numbers.
	2- This algorithm is efficient with a time complexity of O(n).

Here’s a brief explanation of how Kadane’s Algorithm works:
	1st. Initialise two variables.
		a. Max_so_far: This will store highest sum we found so far.
		b. Max_ending_here: This will store the sum of the current subarray we are looking at.
	2nd. Iterate through the array:
		a. Add the current number to "Max_ending_here"
		b. If "Max_ending_here" is higher than "Max_so_far", update "Max_so_far".
		c. If "Max_so_far" becomes negative, reset it to zero (0). Because a negative sum won't help in finding the maximum sum.
	3rd. At the end, "Max_so_far" will have the highest sum of the sub array.

For example: 

public class KadaneAlgorithm {
    public static int maxSubArraySum(int[] arr) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int num : arr) {
            max_ending_here += num;
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(arr));
    }
}


In this example, the array {-2, -3, 4, -1, -2, 1, 5, -3} has a maximum contiguous subarray sum of 7, which is the sum of the subarray {4, -1, -2, 1, 5}.
