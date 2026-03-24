package com.nt.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroup {
	public static void main(String[] args) {
		String[] strArr = { "abc", "bca", "cab", "cbi", "ci", "sbi", "bis", "icb" };
		List<List<String>> anagramGroups = findAnagramGroups(strArr);
		System.out.println(anagramGroups);
	}

	private static List<List<String>> findAnagramGroups(String[] strArr) {
		// TODO Auto-generated method stub
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strArr) {
			char[] cArr = str.toCharArray();
			Arrays.sort(cArr);
			String sorted = new String(cArr);
			if (!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(str);
		}

		return new ArrayList<>(map.values());
	}
}
