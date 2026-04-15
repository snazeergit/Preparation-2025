package com.nt.strings;

import java.util.Arrays;

public class ReverseEveryWordInString {

	public static void main(String[] args) {
		String str = "Java Spring Boot";
		reverseEachWordInString1(str);
		reverseEachWordInString2(str);
	}

	private static void reverseEachWordInString2(String str) {
		String[] strArr = Arrays.stream(str.split("\\s+")).map(s -> new StringBuilder(s).reverse().toString())
				.toArray(String[]::new);
		String result = String.join(" ", strArr);
		System.out.println(result);

	}

	private static void reverseEachWordInString1(String str) {
		String[] s = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (String s1 : s) {
			sb.append(new StringBuilder(s1).reverse()).append(" ");
		}
		System.out.println(sb);
	}
}