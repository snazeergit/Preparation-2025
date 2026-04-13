package com.nt.arrays.subarray;

public class MaxSubArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, -4, 3, 2 };

		int maxProd = findMaxProd(arr);
		System.out.println(maxProd);

		int maxSum = findMaxSum(arr);
		System.out.println(maxSum);

	}

	private static int findMaxSum(int[] arr) {
		// TODO Auto-generated method stub
		int maxSum = arr[0];
		int currentSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}

	private static int findMaxProd(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		int target = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < 0) {
				int temp = max;
				max = min;
				min = temp;
			}
			max = Math.max(arr[i] * max, arr[i]);
			min = Math.min(arr[i] * min, arr[i]);
			target = Math.max(max, target);
		}
		return target;

	}

}
