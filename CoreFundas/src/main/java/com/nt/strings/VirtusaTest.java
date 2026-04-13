package com.nt.strings;

import java.util.ArrayList;
import java.util.List;

public class VirtusaTest {

	public static void main(String[] args) {
		int[] arr = { 4, 7, 8, 10, 15 };
		int target = 9;

		List<Integer> nearestAll = findAllNearestNums(arr, target);
		System.out.println(nearestAll);
	}

	private static List<Integer> findAllNearestNums(int[] arr, int target) {
		int minDif = arr[0];
		List<Integer> nearestAll = new ArrayList<>();
		for (int i = 1; i < arr.length; i++) {
			int currDif = Math.abs(target - arr[i]);
			if (currDif < minDif) {
				minDif = currDif;
				nearestAll.clear();
				nearestAll.add(arr[i]);
			} else if (currDif == minDif) {
				nearestAll.add(arr[i]);
			}
		}
		return nearestAll;
	}
}
