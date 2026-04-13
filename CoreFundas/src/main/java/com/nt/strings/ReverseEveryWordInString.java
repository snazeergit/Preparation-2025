package com.nt.strings;

public class ReverseEveryWordInString {

	public static void main(String[] args) {
		String str = "Java Spring Boot";
		reverseEachWordInString(str);
	}

	private static void reverseEachWordInString(String str) {
		String[] s = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (String s1 : s) {
			sb.append(new StringBuilder(s1).reverse()).append(" ");
		}
		System.out.println(sb);
	}
}