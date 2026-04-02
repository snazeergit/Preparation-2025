package com.nt.arrays.sorting;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Rearrange the array in increasing–decreasing order
 */
public class AscendingDscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 7, 2, 0, -1, 6, 8 };
		int[] ascending = Arrays.stream(arr).sorted().toArray();
		int[] descending = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue)
				.toArray();

		System.out.println(Arrays.toString(ascending));
		System.out.println(Arrays.toString(descending));

	}

}
