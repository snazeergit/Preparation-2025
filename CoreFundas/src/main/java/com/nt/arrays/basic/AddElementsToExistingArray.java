package com.nt.arrays.basic;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Add an element in an existing array
 */
public class AddElementsToExistingArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4 };
		int newElement = 5;
		int[] newArr = IntStream.concat(Arrays.stream(arr), IntStream.of(newElement)).toArray();
		System.out.println(Arrays.toString(newArr));
	}

}
