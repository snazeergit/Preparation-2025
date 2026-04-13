package com.nt.interview;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "CDABEF";
		String s2 = "BCDAEF";
		boolean isAnagram = findAnagram(s1, s2);
		if (isAnagram)
			System.out.println("Given strigns are Anagrams");
		else
			System.out.println("Given strigns are NOT Anagrams");
	}

	private static boolean findAnagram(String s1, String s2) {
		// converting String to char[]
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		// sorting the char[]
		Arrays.sort(c1);
		Arrays.sort(c2);

		return Arrays.equals(c1, c2);
	}
}
