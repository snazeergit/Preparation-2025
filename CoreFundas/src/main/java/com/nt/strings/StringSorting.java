package com.nt.strings;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Arrange them in Ascending order based on String length
 */
public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "abcd", "bc", "bcd", "de", "fg" };
		String[] array = Arrays.stream(str).sorted(Comparator.comparing(String::length)).toArray(String[]::new);
		System.out.println(Arrays.toString(array));
	}

}
