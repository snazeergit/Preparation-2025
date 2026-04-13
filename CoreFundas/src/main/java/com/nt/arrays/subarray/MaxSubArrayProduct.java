package com.nt.arrays.subarray;

public class MaxSubArrayProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, -4, 3, 2 };

		int max = arr[0];
		int min = arr[0];
		int target = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];

			if (current < 0) {
				int temp = max;
				max = min;
				min = temp;
			}
			max = Math.max(current * max, current);
			min = Math.min(current * min, current);
			target = Math.max(max, target);
		}

		System.out.println(target);

	}

}
