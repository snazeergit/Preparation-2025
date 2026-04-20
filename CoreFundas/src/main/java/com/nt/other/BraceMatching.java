package com.nt.other;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Stack;

public class BraceMatching {
	public static void main(String[] args) {
		String str = "[{()}]";

		System.out.println(findBraceMatching(str) ? "Balanced" : "Not Balanced");
		System.out.println(findMatchingDeque(str) ? "Balanced" : "Not Balanced");
	}

	private static boolean findMatchingDeque(String str) {

		Map<Character, Character> map = Map.of(')', '(', ']', '[', '}', '{');
		/*
		 * We use Deque instead of Stack because in modern Java,
		 * Because Stack is a legacy synchronized class extending Vector, slower
		 * while Deque (ArrayDeque) is faster, cleaner, and officially recommended for LIFO operations.
		 */
		Deque<Character> stack = new ArrayDeque<>();
		for (char c : str.toCharArray()) {
			if (map.containsValue(c)) {
				stack.push(c);
			} else if (map.containsKey(c)) {
				if (stack.isEmpty() || stack.pop() != map.get(c)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
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
