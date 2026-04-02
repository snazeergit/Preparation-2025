package com.nt.interview;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 2, 3, 6, 7, 9 };
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Set<Integer> set1 = convertArrayToSet(arr1);
		Set<Integer> set2 = convertArrayToSet(arr2);
		Set<Integer> commonElements = new HashSet<>();

		for (int n3 : arr3) {
			if (set1.contains(n3) && set2.contains(n3)) {
				commonElements.add(n3);
			}
		}
		System.out.println(commonElements);
	}

	private static Set<Integer> convertArrayToSet(int[] arr1) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		for (int n : arr1) {
			set.add(n);
		}
		return set;
	}
}
