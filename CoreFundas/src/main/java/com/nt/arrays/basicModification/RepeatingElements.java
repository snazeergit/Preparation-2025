package com.nt.arrays.basicModification;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Find all repeating elements in an array
 */
public class RepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 1, 2, 3, 5, 4, 4 };
		int[] repeating = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(e -> e.getKey()).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(repeating));
	}

}
