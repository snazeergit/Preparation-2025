package com.nt.other;

import java.util.Scanner;
import java.util.Stack;

public class UndoRedoAction {

	static Stack<Character> stack = new Stack<>();
	static Stack<Character> redoStack = new Stack<>();

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Initial typing
		typing('A');
		typing('B');
		typing('C');
		typing('D');

		while (true) {

			System.out.println("\nCurrent Text : " + print(stack));
			System.out.print("Enter u-undo, r-redo, t-type, e-exit -> ");

			String key = s.nextLine();

			switch (key) {

			case "u":
				System.out.println(undo());
				break;

			case "r":
				System.out.println(redo());
				break;

			case "t":
				System.out.print("Enter character: ");
				char ch = s.nextLine().charAt(0);
				System.out.println(typing(ch));
				break;

			case "e":
				System.out.println("Program ended");
				s.close();
				return;

			default:
				System.out.println("Invalid option");
			}
		}
	}

	private static String redo() {
		if (redoStack.isEmpty()) {
			return "Nothing to redo";
		}
		stack.push(redoStack.pop());
		return print(stack);
	}

	private static String undo() {
		if (stack.isEmpty()) {
			return "Nothing to undo";
		}
		redoStack.push(stack.pop());
		return print(stack);
	}

	private static String typing(Character c) {
		stack.push(c);
		// New typing invalidates redo history
		redoStack.clear();
		return print(stack);
	}

	private static String print(Stack<Character> stack) {
		StringBuilder sb = new StringBuilder();
		for (char ch : stack) {
			sb.append(ch);
		}
		return sb.toString();
	}
}