package com.nt.arrays.basicOperations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * 	5. Count the frequency of each element in an array
 */
public class ElementFrequencey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 7, 2, 0, -1, 6, 8, 1, 4, 2 };

		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		System.out.println(map);

		// Streams
		Map<Integer, Long> map1 = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map1);
	}

}
