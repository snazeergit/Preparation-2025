package com.nt.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VirtusaTest {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		// reverseEachWordInString();

		// firstNonRepeatedNum();

		findMiddleElement();

		// findAnagram();

	}

	private static void findAnagram() {
		String s1 = "listen";
		String s2 = "silent";

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2))
			System.out.println("Anagrams");
		else
			System.out.println("Not ANagrams");
	}

	private static int findMiddleElement() {

		
		return 0;
	}

	private static void firstNonRepeatedNum() {
		int[] num = { 4, 5, 1, 2, 0, 4, 1, 0 };
		Integer integer = Arrays.stream(num).boxed()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().map(e -> e.getKey()).orElse(-1);
		System.out.println(integer);
	}

	private static void reverseEachWordInString() {
		String str = "Java Spring Boot";
		String[] s = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (String s1 : s) {
			sb.append(new StringBuilder(s1).reverse()).append(" ");
		}
		System.out.println(sb);
	}
}
