package com.nt.interview;

public class NearestNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 7, 10, 15 };
		int target = 9;

		int nearest = findNearest(arr, target);
		System.out.println("Nearest number: " + nearest);
	}

	private static int findNearest(int[] arr, int target) {
		int nearest = arr[0];
		int minDiff = Math.abs(arr[0] - target);

		for (int i = 1; i < arr.length; i++) {
			int diff = Math.abs(arr[i] - target);

			if (diff < minDiff) {
				minDiff = diff;
				nearest = arr[i];
			}
		}
		return nearest;
	}
}
