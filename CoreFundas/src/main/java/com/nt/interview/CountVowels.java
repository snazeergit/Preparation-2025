package com.nt.interview;

import java.util.HashMap;
import java.util.Map;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My name is Syed Nazeer";
		String[] arr = str.split("\\s+");
		int count = 0;
		Map<String, Integer> map = new HashMap<>();

		for (String s : arr) {
			count=0;
			for (char c : s.toCharArray()) {
				if ("aeiouAEIOU".indexOf(c) != -1) {
					count++;
				}
			}
			map.put(s, count);
		}
		System.out.println(map);
	}
}
