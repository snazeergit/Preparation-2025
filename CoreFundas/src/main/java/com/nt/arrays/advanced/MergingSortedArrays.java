package com.nt.arrays.advanced;

import java.util.Arrays;

/*
 * Merge the two sorted arrays into one.
 */
public class MergingSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9, 11 };
		int[] arr2 = { 2, 4, 6, 8, 10 };

		mergingArrays1(arr1, arr2);
		mergingArrays2(arr1, arr2);
		mergingArrays3(arr1, arr2);
	}

	private static void mergingArrays3(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int l1 = arr1.length, l2 = arr2.length;
		int[] res = new int[l1 + l2];
		while (i < l1 && j < l2)
			res[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
		System.arraycopy(i < l1 ? arr1 : arr2, j < l2 ? i : j, res, k, i < l1 ? l1 - i : l2 - j);
		System.out.println(Arrays.toString(res));
	}

	private static void mergingArrays2(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length)
			res[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
		if (i < arr1.length)
			// System.arraycopy(source, sourcePos, destination, destPos, length);
			System.arraycopy(arr1, i, res, k, arr1.length - i);
		if (j < arr2.length)
			System.arraycopy(arr2, j, res, k, arr2.length - j);
		System.out.println(Arrays.toString(res));
	}

	private static void mergingArrays1(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j])
				res[k++] = arr1[i++];
			else
				res[k++] = arr2[j++];
		}
		while (i < arr1.length)
			res[k++] = arr1[i++];
		while (j < arr2.length)
			res[k++] = arr2[j++];
		System.out.println(Arrays.toString(res));
	}

}
