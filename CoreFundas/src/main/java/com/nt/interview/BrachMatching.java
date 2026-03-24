package com.nt.interview;

import java.util.Stack;

/*
 * Finding the braces are closed correctly
 * Input="{{[()]}}[]";
 * Output="Balanced"
 */
public class BrachMatching {
	public static void main(String[] args) {
		String str = "{{[()]}}[]";
		char[] ar = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		boolean balanced = true;
		for (char c : ar) {
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
			} else if (c == '}' || c == ']' || c == ')') {
				if (stack.isEmpty()) {
					balanced = false;
					break;
				}
				Character top = stack.pop();
				if (c == '}' && top != '{' || c == ']' && top != '[' || c == ')' && top != '(') {
					balanced = false;
					break;
				}
			}
		}
		if (stack.isEmpty() && balanced)
			System.out.println("Braces are properly balanced");
		else
			System.out.println("Braces are mis balanced");
	}
}
