package ch.fhnw.oop.nested;

public class Stack<T> {
	private static class Node<E> {
		private E value;
		private Node<E> next;

		private Node(E value, Node<E> next) {
			this.value = value;
			this.next = next;
		}
	}

	private Node<T> root = null;

	public void push(T x) {
		root = new Node<>(x, root);
	}

	public T top() {
		return root.value;
	}

	public T pop() {
		try {
			return root.value;
		} finally {
			root = root.next;
		}
	}
}
