package com.nt.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

/*
 * FInd duplicate words in a given string
 */

public class DuplicateWords {

	public static void main(String[] args) {
		String str = "Hi my name is Nazeer and your name please";
		String[] ar = str.split("\\s+");
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String s : ar) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		System.out.println(map);
		List<Entry<String, Integer>> list = map.entrySet().stream().filter(e -> e.getValue() >= 2).toList();
		list.forEach(e -> System.out.println(e.getKey()));
	}
}
