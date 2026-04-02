package com.nt.arrays.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * Find the average of all elements in an array
 */
public class AverageNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 7, 2, 0, -1, 6, 8 };
		Double avg = Arrays.stream(arr).boxed().collect(Collectors.averagingInt(Integer::intValue));
		System.out.println(avg);
	}

}
