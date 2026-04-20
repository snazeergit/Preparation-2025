package com.nt.arrays.advanced;

import java.util.Arrays;
/*
 * Merge two given arrays and Sort them
 */

public class MergeAndSortTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 1, 4 };
		int[] arr2 = { 3, 5, 0, 1 };

		int[] res = mergeArrays(arr1, arr2);
		System.out.println("After Merging: " + Arrays.toString(res));

		// [3, 2, 1, 4, 3, 5, 0, 1]
		for (int j = 0; j < res.length - 1; j++) {
			/*
			 * Loop should run 1 iteration less each time 
			 * as the last element will be sorted every time.
			 */
			for (int i = 0; i < res.length - j - 1; i++) {
				// swapping adjacent elements
				if (res[i] > res[i + 1]) {
					int temp = res[i];
					res[i] = res[i + 1];
					res[i + 1] = temp;
				}
			}
		}

		System.out.println("After sorting the merged array: " + Arrays.toString(res));
	}

	private static int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			res[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			res[i + arr1.length] = arr2[i];
		}
		return res;
	}

}
