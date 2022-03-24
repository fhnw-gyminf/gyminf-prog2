package ch.fhnw.oop.clone.stack;

import java.util.NoSuchElementException;

public class LinkedStack implements Cloneable {

	private static class Node {
		private Object value;
		private Node next;

		public Node(Object value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	private Node root;

	public void push(Object value) {
		root = new Node(value, root);
	}

	public Object pop() {
		if (root == null)
			throw new NoSuchElementException();
		Node n = root;
		root = root.next;
		return n.value;
	}

	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public LinkedStack clone() {
		try {
			return (LinkedStack) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}
}
