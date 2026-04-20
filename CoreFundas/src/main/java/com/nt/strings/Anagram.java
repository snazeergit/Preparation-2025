package com.nt.strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		boolean isAnagram1 = findAnagram1(s1, s2);
		if (isAnagram1)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

		boolean isAnagram2 = findAnagram2(s1, s2);
		if (isAnagram2)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}

	private static boolean findAnagram1(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}

	private static boolean findAnagram2(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int[] index = new int[26];
		for (char c : s1.toCharArray()) {
			index[c - 'a']++;
		}
		for (char c : s2.toCharArray()) {
			if (--index[c - 'a'] < 0)
				return false;
		}
		return true;
	}
}
