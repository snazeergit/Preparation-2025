package com.nt.strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAlladjacentDuplicates {
	public static void main(String[] args) {
		String str = "abbade";
		Deque<Character> stack = new ArrayDeque<>();
		for (char c : str.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Character c : stack) {
			sb.append(c);
		}
		System.out.println(sb.toString());

		/*
		while (!stack.isEmpty()) {
			sb.append(stack.pop()); //it appends in reverse order as it goes from top to bottom hence reverse used.
		}
		System.out.println(sb.reverse().toString());
		
		while (!stack.isEmpty()) {
			sb.append(stack.removeLast()); // maintain correct order
		}
		System.out.println(sb.toString());
		*/
	}

}
