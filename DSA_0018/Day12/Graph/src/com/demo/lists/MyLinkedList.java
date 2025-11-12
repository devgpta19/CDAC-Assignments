package com.demo.lists;

public class MyLinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public MyLinkedList() {
		head = null;
	}
	
	public void addNode(int num) {
		Node newNode = new Node(num);
		if(head!=null) {
			newNode.next = head;
		}
		head = newNode;
	}
	
	public boolean search(int val) {
		if(head == null) {
			return false;
		}else {
			Node temp = head;
			while(temp!=null) {
				if(temp.data == val) {
					return true;
				}
				temp = temp.next;
			}
		}return false;
	}
}
