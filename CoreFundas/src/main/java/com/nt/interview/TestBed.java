package com.nt.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestBed {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 3, 3, 3, 3, 2, 1 };

		Map<Integer, Long> map = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map.Entry<Integer, Long> entry = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst().get();

		System.out.println(entry.getKey());

		//IntStream stream = Arrays.stream(arr);
		//Stream<Integer> boxed = Arrays.stream(arr).boxed();

	}
}