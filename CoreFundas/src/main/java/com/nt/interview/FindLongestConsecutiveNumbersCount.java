package com.nt.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Find consecutive numbers maximum count
 * input= {1,2,3,201,202,203,4,300,400};
 * output=5
 * 1,2,3,4,5 are the max no of consecutive numbers in array
 */
public class FindLongestConsecutiveNumbersCount {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 201, 202, 203, 4, 300, 5, 400 };
		// Brute Force approach
		maxConsecutiveCount(arr);

		// Optimized Approach
		findMaxConsecutiveCount(arr);

	}

	private static void findMaxConsecutiveCount(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int n : arr) {
			// Put all numbers in a HashSet (for O(1) lookup)
			set.add(n);
		}
		int max = 1;
		for (int num : set) {
			// Only start counting when the number is beginning of sequence
			if (!set.contains(num - 1)) {
				int current = num;
				int count = 1;
				// Check next consecutive number is available if yes, increase the count and
				// counter too
				// to check the next consecutive numbers availability
				while (set.contains(current + 1)) {
					count++;
					current++;
				}
				// Track maximum length
				max = Math.max(max, count);
			}
		}
		System.out.println(max);
	}

	private static void maxConsecutiveCount(int[] arr) {
		int max = 1;
		int counter = 1;
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if (Math.abs(arr[i - 1] - arr[i]) == 1)
				counter++;
			else {
				counter = 1;
			}
			max = Math.max(max, counter);
		}
		System.out.println(max);
	}

}
