package com.nt.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String str = "KASSE";
		approach1(str);
		approach2(str);

	}

	private static void approach2(String str) {
		/*
		Map<Character, Long> map1 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				*/
		// OR
		Map<Character, Long> map = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0L) + 1);
		}

		String unique = map.entrySet().stream().map(e -> e.getKey().toString()).distinct()
				.collect(Collectors.joining());
		System.out.println(unique);
	}

	private static void approach1(String str) {
		String emt = "";
		for (char c : str.toCharArray()) {
			if (emt.indexOf(c) == -1) {
				emt += c;
			}
		}
		System.out.println(emt);
	}

}
