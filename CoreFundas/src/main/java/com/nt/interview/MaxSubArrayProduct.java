package com.nt.interview;

/*
 * Find a subarray that has the largest product.
 * Input: nums=={2,3,-2,4};
 * Output: 6
 */

public class MaxSubArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, -2, 4 };
		int max = nums[0];
		int min = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int current = nums[i];

			// If current is negative → swap max and min
			if (current < 0) {
				int temp = max;
				max = min;
				min = temp;
			}
			// Update max
			max = Math.max(current, current * max);
			// Update min
			min = Math.min(current, current * min);
			// Update overall result
			result = Math.max(max, result);
		}

		System.out.println(result);
	}
}
