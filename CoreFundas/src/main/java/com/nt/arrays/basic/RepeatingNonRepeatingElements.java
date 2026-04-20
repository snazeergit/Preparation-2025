package com.nt.arrays.basic;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Find all repeating and Non-Repeating elements in an array
 */
public class RepeatingNonRepeatingElements {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 1, 2, 3, 5, 4, 4 };

		/*
		 * Find Repeating elements
		 */
		int[] repeating = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(e -> e.getKey()).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(repeating));

		/*
		 * Find Non-Repeating elements
		 */
		int[] non_repeating = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(e -> e.getKey()).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(non_repeating));
	}

}
