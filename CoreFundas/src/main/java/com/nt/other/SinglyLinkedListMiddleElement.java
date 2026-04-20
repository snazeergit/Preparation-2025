package com.nt.other;

public class SinglyLinkedListMiddleElement {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void fetchMiddleElement(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);

	}

	public static void printLinkedList(Node head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("null");

	}

	public static void main(String[] args) {
		Node node0 = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(5);

		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		printLinkedList(node0);
		fetchMiddleElement(node0);
	}

}
