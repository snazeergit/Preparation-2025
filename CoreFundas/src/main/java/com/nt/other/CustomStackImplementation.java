package com.nt.other;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomStackImplementation {
	static List<Integer> list;

	public static void main(String[] args) {
		CustomStackImplementation myStack = new CustomStackImplementation();
		list = new ArrayList<>();
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
		System.out.println("peak: " + myStack.peek());
		System.out.println("size: " + myStack.size());
		System.out.println("search: " + myStack.search(10));
	}

	public void push(Integer n) {
		list.add(n);
	}

	public Integer pop() {
		if (list.isEmpty())
			throw new EmptyStackException();
		int topIndex = list.size() - 1;
		int topElement = list.get(topIndex);
		list.remove(topIndex);
		return topElement;
	}

	public Integer peek() {
		if (list.isEmpty())
			throw new EmptyStackException();
		return list.get(list.size() - 1);
	}

	public boolean isEmpty() {
		return list.isEmpty() ? true : false;
	}

	public Integer size() {
		return list.size();
	}

	/*
	 * Follows 1-based index from top element to bottom element.
	 * Top element index will be 1 and last element index will be length of the list
	 */
	public Integer search(Integer n) {
		return list.size() - list.indexOf(n);
	}

	public String toString() {
		return list.toString();
	}
}
