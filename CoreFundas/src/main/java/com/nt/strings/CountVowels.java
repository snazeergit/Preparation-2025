package com.nt.strings;

import java.util.HashMap;
import java.util.Map;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My name is Syed Nazeer";
		int count;
		countVowels1(str);

		countVowels2(str);
	}

	private static void countVowels2(String str) {
		int count;
		String s1 = str.replaceAll("\\s+", "");
		count = 0;
		for (char c : s1.toCharArray()) {
			if ("aeiouAEIOU".indexOf(c) != -1) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static void countVowels1(String str) {
		String[] arr = str.split("\\s+");
		int count = 0;
		Map<String, Integer> map = new HashMap<>();

		for (String s : arr) {
			count = 0;
			for (char c : s.toCharArray()) {
				if ("aeiouAEIOU".indexOf(c) != -1) {
					count++;
				}
			}
			map.put(s, count);
		}
		System.out.println(map);
		Integer sum = map.values().stream().reduce(0, Integer::sum);
		System.out.println(sum);
	}
}
