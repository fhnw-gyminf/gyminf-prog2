package ch.fhnw.oop.clone.alias;

import java.util.IdentityHashMap;
import java.util.Map;

// This program implements clone with the help of a identity-hash-map where the cloned objects are stored.
// Method clone invokes a clone method where a new map is passed, and this method creates a clone using a
// private copy constructor where the map is passed in case that the object has not already been cloned.
public class TestCycle2 {

	static class Node {
		Node next;
		int val;

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
		private Node(Node source, Map<Node, Node> map) {
			map.put(source, this);
			this.val = source.val;
			if(source.next != null) this.next = source.next.clone(map);
		}

		@Override
		public Node clone() {
			return clone(new IdentityHashMap<Node, Node>());
		}
		
		private Node clone(Map<Node, Node> map) {
			if(map.containsKey(this))
				return map.get(this);
			return new Node(this, map);
		}
	}

	public static void main(String[] args) {
		Node n1 = new Node(1, null);
		Node n2 = new Node(2, n1);
		Node n3 = new Node(3, n2);
		n1.next = n3;
		// n3 -> n2 -> n1 -> n3 -> ....

		Node c = n1.clone();
	
		System.out.println(c);
		System.out.println(c.next);
		System.out.println(c.next.next);
		System.out.println(c.next.next.next);
		System.out.println(c == c.next.next.next);
	}
}
