package com.nt.arrays.basic;

import java.util.Arrays;

/*
 * Find the median of the given array
 */
public class MedianOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 7, 2, 0, -1, 6, 8 };
		arr = Arrays.stream(arr).sorted().toArray();
		int len = arr.length;
		double median = 0;

		if (len % 2 == 0)
			median = (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
		else
			median = arr[len / 2];
		System.out.println(median);
	}

}
