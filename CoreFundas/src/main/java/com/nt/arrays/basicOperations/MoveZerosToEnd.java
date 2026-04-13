package com.nt.arrays.basicOperations;

import java.util.Arrays;

/*
 * input = {2, 4, 1, 0, 2, 0, 1, 0};
 * output= {2, 4, 1, 2, 1, 0, 0, 0};
 */
public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 1, 0, 2, 0, 1, 0 };
		int index = 0;
		for (int n : arr) {
			if (n != 0) {
				arr[index++] = n;
			}
		}
		while (index < arr.length) {
			arr[index++] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}

}
