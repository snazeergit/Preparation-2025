package com.nt.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "Stress";
		String emt = "";

		approach(str);
		approach2(str);
		approach3(str);
	}

	private static void approach3(String str) {
		int[] freq = new int[256];

		for (char ch : str.toCharArray()) {
			freq[ch]++;
		}

		for (char ch : str.toCharArray()) {
			if (freq[ch] == 1) {
				System.out.println(ch);
				break;
			}
		}
	}

	private static void approach2(String str) {
		for (char c : str.toLowerCase().toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}
	}

	private static void approach(String str) {
		Map<Character, Long> map = str.toLowerCase().chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		Character c = map.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().map(Map.Entry::getKey).get();
		System.out.println(c);
	}

}
