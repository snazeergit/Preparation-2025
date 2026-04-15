package com.nt.interview;

import java.util.Stack;

/*
 * Finding the braces are closed correctly
 * Input="{{[()]}}[]";
 * Output="Balanced"
 */
public class BrachMatchingV2 {
	public static void main(String[] args) {
		String str = "{{[()]}}[]";

		boolean flag = findBraceMatching(str);
		if (flag)
			System.out.println("Braces are Balanced");
		else
			System.out.println("Braces are Not Balanced");
	}

	private static boolean findBraceMatching(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : str.toCharArray()) {
			if (c == '{' || c == '[' || c == '(')
				stack.push(c);
			else {
				if (stack.isEmpty())
					return false;
				Character top = stack.pop();
				if (c == '}' && top != '{' || c == ']' && top != '[' || c == ')' && top != '(')
					return false;
			}
		}
		return stack.isEmpty();
	}
}
