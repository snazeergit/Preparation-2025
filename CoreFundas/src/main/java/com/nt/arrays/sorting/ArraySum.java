package com.nt.arrays.sorting;

import java.util.Arrays;

/*
 * Calculate the sum of the elements of the array
 */
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 7, 2, 0, -1, 6, 8 };
		int sum = Arrays.stream(arr).reduce(0, Integer::sum);
		System.out.println(sum);
	}

}
