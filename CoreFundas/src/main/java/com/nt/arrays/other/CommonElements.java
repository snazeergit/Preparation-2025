package com.nt.arrays.other;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = { 1, 2, 3, 4, 5 };
		int[] ar2 = { 4, 5, 6, 7, 8 };

		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> commonElements = new HashSet<Integer>();
		for (int n : ar1) {
			set.add(n);
		}
		for (int n : ar2) {
			if (set.contains(n)) {
				commonElements.add(n);
			}
		}
		System.out.println(commonElements);
	}

}
