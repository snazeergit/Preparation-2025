package com.nt.arrays.other;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
 * A peak element is an element that is strictly greater than its neighbors.
 * Find a peak element in a given array and return its index.
 * 
 * peak value >= neighbors
 * Input: int [] nums = {1, 2, 3, 3, 1, 2, 1};
 * Output:
 * 	Peak:3
 * 	Index:2
 * 
 * //peak value > neighbors
 * Input: int[] nums = {1, 2, 3, 3, 1, 2, 1};
 * Output: 
 * 	Peak:2
 * 	Index:5
 */
public class PeakElement {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 3, 1, 2, 1 };

		// peak value >= neighbors
		peakGTREqneibours(nums);

		// peak value > neighbors
		peakStrictyGTneibours(nums);

	}

	private static void peakStrictyGTneibours(int[] nums) {
		int peak = 0;
		int index = 0;
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
				peak = nums[i];
				index = i;
			}
		}
		System.out.println("Peak: " + peak);
		System.out.println("Index: " + index);
	}

	private static void peakGTREqneibours(int[] nums) {
		Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(i, nums[i]);
		}
		// System.out.println(map);
		Integer peak = map.values().stream().max(Comparator.naturalOrder()).get();
		// System.out.println(peak);
		Integer key = map.entrySet().stream().filter(e -> e.getValue() == peak).map(Map.Entry::getKey).findFirst()
				.orElse(null);
		System.out.println("Peak: " + peak);
		System.out.println("Index: " + key);

	}
}
