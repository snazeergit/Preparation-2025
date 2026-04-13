package com.nt.interview;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";

		findAnagram(s1, s2);
	}

	private static void findAnagram(String s1, String s2) {

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2))
			System.out.println("Anagrams");
		else
			System.out.println("Not ANagrams");
	}
}
