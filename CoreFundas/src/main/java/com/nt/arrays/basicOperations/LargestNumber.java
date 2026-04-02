package com.nt.arrays.basicOperations;

import java.util.Arrays;

/*
 * Find the largest number in an array
 */
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 7, 2, 0, -1, 6, 8 };
		int max = Arrays.stream(arr).distinct().max().getAsInt();
		System.out.println(max);
	}

}
