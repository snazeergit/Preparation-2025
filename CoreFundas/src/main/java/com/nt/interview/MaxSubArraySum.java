package com.nt.interview;

public class MaxSubArraySum {
	public static void main(String[] args) {
		int[] arr = { 5, -4, 3, 0, -2, -1 };
		findMaxSubarraySum(arr);
	}

	private static void findMaxSubarraySum(int[] arr) {
		int currentSum = arr[0];
		int maxSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}

		System.out.println(maxSum);
	}
}
