package com.nt.arrays.duplicateHandling;

import java.util.Arrays;

public class RemoveDuplicateUnSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 1, 2, 3, 5, 4, 4 };
		int[] unique = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(unique));
	}

}
