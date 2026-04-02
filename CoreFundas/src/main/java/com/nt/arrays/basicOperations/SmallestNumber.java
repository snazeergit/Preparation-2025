package com.nt.arrays.basicOperations;

import java.util.Arrays;

/*
 * Find the smallest number in an array
 */
public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 7, 2, 0, -1, 6, 8 };
		int min = Arrays.stream(arr).distinct().min().getAsInt();
		System.out.println(min);
	}

}
