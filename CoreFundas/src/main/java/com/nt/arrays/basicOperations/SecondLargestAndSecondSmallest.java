package com.nt.arrays.basicOperations;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Find the second smallest and second largest element in an array
 */
public class SecondLargestAndSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 7, 2, 0, -1, 6, 8 };
		int secondMin = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().getAsInt();
		int secondMax = Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();
		System.out.println(secondMin);
		System.out.println(secondMax);

	}

}
