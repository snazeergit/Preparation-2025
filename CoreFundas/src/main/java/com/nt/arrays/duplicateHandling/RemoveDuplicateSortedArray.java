package com.nt.arrays.duplicateHandling;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 3, 4, 4, 5 };
		int[] unique = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(unique));

	}

}
