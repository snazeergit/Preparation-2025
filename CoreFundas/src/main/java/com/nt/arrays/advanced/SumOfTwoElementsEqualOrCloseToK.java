package com.nt.arrays.advanced;

import java.util.Arrays;

public class SumOfTwoElementsEqualOrCloseToK {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 7, 2, 3, 5 };
		int k = 16;
		twoPointers(arr, k);
	}

	private static void twoPointers(int[] arr, int k) {
		/*
		 * Two Pointer requires ordered traversal.
		 * Sorting helps us intelligently move left/right pointers instead of checking all pairs. 
		 */
		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;
		int res_l = 0, res_r = 0;
		int dif = Integer.MAX_VALUE;
		
		while (left < right) {
			if (arr[left] + arr[right] == k) {
				res_l = left;
				res_r = right;
				break;
			}
			if (Math.abs(arr[left] + arr[right] - k) < dif) {
				dif = Math.abs(arr[left] + arr[right] - k);
				res_l = left;
				res_r = right;
			}
			if (arr[left] + arr[right] > k) {
				right--;
			} else {
				left++;
			}
		}
		System.out.println("Two Pointers :\t (" + arr[res_l] + ", " + arr[res_r] + ")");
	}

}

/*
Yes — now your code is correct.

This is the proper Two Pointer approach for finding the pair whose sum is closest to k (or exact match if present).

⸻

Why this works

Your flow is now:

1. Exact match check

if (arr[left] + arr[right] == k)

If exact match found → store result and break

Perfect.

⸻

2. Closest pair update

if (Math.abs(arr[left] + arr[right] - k) < dif)

This updates the best pair seen so far.

Correct.

⸻

3. Pointer movement

if (arr[left] + arr[right] > k)
    right--;
else
    left++;

This guarantees traversal continues.

Most important part.

⸻

Time Complexity

Sorting:

O(n \log n)

Traversal:

O(n)

Final:

O(n \log n)

⸻

Space Complexity

O(1)

because only variables are used.

⸻

Interview-level statement

You can say:

First I sort the array, then I use two pointers from both ends.
If exact match exists, I return it.
Otherwise I continuously track the pair with minimum difference from target k.

That is a strong senior-level explanation.

⸻

This is now interview-ready code.
*/