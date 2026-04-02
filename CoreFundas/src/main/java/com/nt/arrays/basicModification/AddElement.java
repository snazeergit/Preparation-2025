package com.nt.arrays.basicModification;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Add an element in an array
 */
public class AddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 4 };
		int newElement = 5;
		int[] newArr = IntStream.concat(Arrays.stream(arr), IntStream.of(newElement)).toArray();
		System.out.println(Arrays.toString(newArr));
	}

}
