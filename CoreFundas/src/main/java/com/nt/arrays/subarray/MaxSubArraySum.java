package com.nt.arrays.subarray;
/*
A sub array can be whole array too however it should produce highest sum when compare to any other possible sub array.

How your logic works
	•	currentSum → best sum ending at current index
	•	maxSum → best sum seen so far

Loop logic:
currentSum = Math.max(arr[i], currentSum + arr[i]);

This means:
	•	either start new subarray from arr[i], means arr[i]>currentSum+arr[i] 
		then better to start subarray from arr[i]
		arr[i]=5, currentSum=-3
		arr[i]> arr[i]+currentSum
		5>5-3
		5>2
		
	•	or extend previous subarray 

Then:
maxSum = Math.max(maxSum, currentSum);
updates global maximum.
*/

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, -3, 0, -2, -1 };

		int result1 = findSum1(arr);
		System.out.println(result1);

		int result2 = findSum2(arr);
		System.out.println(result2);

		int result3 = findSum3(arr);
		System.out.println(result3);
	}

	// If-Else
	private static int findSum1(int[] arr) {
		int maxSum = arr[0];
		int currentSum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i] + currentSum)
				currentSum = arr[i];
			else
				currentSum = arr[i] + currentSum;

			if (currentSum > maxSum)
				maxSum = currentSum;
		}
		return maxSum;
	}

	// Ternary Operator
	private static int findSum2(int[] arr) {
		int maxSum = arr[0];
		int currentSum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currentSum = arr[i] > arr[i] + currentSum ? arr[i] : arr[i] + currentSum;
			maxSum = currentSum > maxSum ? currentSum : maxSum;
		}
		return maxSum;
	}

	// Math.max()
	private static int findSum3(int[] arr) {
		int maxSum = arr[0];
		int currentSum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(currentSum, maxSum);
		}
		return maxSum;
	}
}
