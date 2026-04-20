package com.nt.arrays.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Input:
int[] arr = { 1, 2, 8, 7, 2, 3, 5 };

Output:
Brute Force:	 [(2, 8), (8, 2), (7, 3)]
Hashing :	 	 [(8, 2), (2, 8), (3, 7)]
Two Pointers :	 [(2, 8), (3, 7)]   -> No duplicate logical pairs (8,2) is absent
*/
public class SumOfTwoElementsEqualToK {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 7, 2, 3, 5 };
		int k = 10;
		bruteForce(arr, k);
		hashing(arr, k);
		twoPointers(arr, k);
	}

	private static void twoPointers(int[] arr, int k) {
		/*
		 * Two Pointer requires ordered traversal.
		 * Sorting helps us intelligently move left/right pointers instead of checking all pairs. 
		 * This approach can not produce duplicate logical pairs like Brute Force and Hashing
		 */
		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;
		List<String> list = new ArrayList<>();
		while (left < right) {
			if (arr[left] + arr[right] == k) {
				list.add("(" + arr[left] + ", " + arr[right] + ")");
				left++;
				right--;
			} else if (arr[left] + arr[right] > k) {
				right--;
			} else {
				left++;
			}
		}
		System.out.println("Two Pointers :\t " + list);
	}

	private static void hashing(int[] arr, int k) {
		Set<Integer> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		for (int first : arr) {
			int second = k - first;
			if (set.contains(second)) {
				list.add("(" + first + ", " + second + ")");
			}
			set.add(first);
		}
		System.out.println("Hashing :\t " + list);
	}

	private static void bruteForce(int[] arr, int k) {
		int l = arr.length;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k) {
					list.add("(" + arr[i] + ", " + arr[j] + ")");
				}
			}
		}
		System.out.println("Brute Force:\t " + list);
	}

}

/*
Final Comparison:
 
Approach		Time		Space

Brute Force		O(n²)		O(1)

Hashing			O(n)		O(n)

Two Pointer		O(n log n)	O(1)
*/