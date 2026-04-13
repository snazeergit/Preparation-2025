package com.nt.arrays.basicOperations;

import java.util.Arrays;

/*
 * 	4. Reverse a given array
 */
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		reverseArray1(arr);
		reverseArray2(arr);
	}

	// Brute Force
	private static void reverseArray1(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	// Two Pointers
	private static void reverseArray2(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
