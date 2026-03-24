package com.nt.interview;

import java.util.Stack;

public class BraceMatchingV1 {
	public static void main(String[] args) {
		String str = "[{()}]";
		boolean balanced = true;
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
			} else if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
				balanced = false;
				break;
			} else if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
				balanced = false;
				break;
			} else if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
				balanced = false;
				break;
			}
		}
		if (stack.isEmpty() && balanced)
			System.out.println("Braces are balanced");
		else
			System.out.println("Braces are NOT balanced");

	}
}
