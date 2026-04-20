package com.nt.arrays.intermediate;

import java.util.ArrayList;
import java.util.List;

public class NearestNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 7, 10, 8, 15 };
		int target = 9;

		int nearest = findNearest(arr, target);
		System.out.println("Nearest number: " + nearest);

		List<Integer> nearestAll = findAllNearestNums(arr, target);
		System.out.println("All nearest numbers: " + nearestAll);

	}

	private static int findNearest(int[] arr, int target) {
		int nearest = arr[0];
		int minDiff = Math.abs(arr[0] - target);

		for (int i = 1; i < arr.length; i++) {
			int curDiff = Math.abs(arr[i] - target);

			if (curDiff < minDiff) {
				minDiff = curDiff;
				nearest = arr[i];
			}
		}
		return nearest;
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
