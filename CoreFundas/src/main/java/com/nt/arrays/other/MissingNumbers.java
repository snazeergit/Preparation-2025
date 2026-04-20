package com.nt.arrays.other;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Missing number in a given array
 * Input={1,2,2,4,5,6,6,2,1,8};
 * Output={3,7}
 */
public class MissingNumbers {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 2, 4, 5, 6, 6, 2, 1, 8 };

		int min = Arrays.stream(ar).min().getAsInt();
		int max = Arrays.stream(ar).max().getAsInt();

		Set<Integer> set = Arrays.stream(ar).boxed().collect(Collectors.toSet());
		int[] missing = IntStream.rangeClosed(min, max).filter(n -> !set.contains(n)).toArray();
		System.out.println(Arrays.toString(missing));
	}
}
