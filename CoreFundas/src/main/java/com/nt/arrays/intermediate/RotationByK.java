package com.nt.arrays.intermediate;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Rotate an array by K elements
 */
public class RotationByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 7, 2, 0, -1, 6, 8 };
		int k = 3;
		// Left rotation by K positions
		int[] leftRotation = IntStream.concat(Arrays.stream(arr, k, arr.length), Arrays.stream(arr, 0, k)).toArray();
		System.out.println(Arrays.toString(leftRotation));

		// Right rotation by K positions
		int[] rightRotation = IntStream
				.concat(Arrays.stream(arr, arr.length - k, arr.length), Arrays.stream(arr, 0, arr.length - k))
				.toArray();
		System.out.println(Arrays.toString(rightRotation));
	}

}

/*
 * Arrays.stream(arr, startingIdex, EndingIndex-1)
 * Arrays.stream(arr, 0, 3) returns first 3 elements i.e 0,1,2 index elements 
 */