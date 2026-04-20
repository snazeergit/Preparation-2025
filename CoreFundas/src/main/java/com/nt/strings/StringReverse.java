package com.nt.strings;

/*
 * Reverse the String by preserving the numbers and special characters positions.
 * Input =ab12c!@de
 * Output=ed12c!@ba
 */
public class StringReverse {

	public static void main(String[] args) {
		String str = "ab12c!@de";
		char[] ar = str.toCharArray();
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (!Character.isAlphabetic(ar[left])) {
				left++;
			} else if (!Character.isAlphabetic(ar[right])) {
				right--;
			} else {
				char temp = ar[left];
				ar[left] = ar[right];
				ar[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(String.valueOf(ar));
	}
}
