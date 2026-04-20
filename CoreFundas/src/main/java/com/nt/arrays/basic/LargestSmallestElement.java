package com.nt.arrays.basic;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Find the largest number in an array
 */
public class LargestSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 7, 2, 0, -1, 6, 8 };

		/*
		 * Largest and Smallest Numbers
		 */
		int max = Arrays.stream(arr).distinct().max().getAsInt();
		System.out.println(max);

		int min = Arrays.stream(arr).distinct().min().getAsInt();
		System.out.println(min);

		/*
		 * Second Largest and Second Smallest Numbers
		 */
		int secondMin = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().getAsInt();
		int secondMax = Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();
		System.out.println(secondMin);
		System.out.println(secondMax);
	}

}
