package ch.fhnw.oop.clone.alias;

import java.util.IdentityHashMap;
import java.util.Map;

// This program implements clone with the help of a identity-hash-map where the cloned objects are stored.
// Method clone invokes a clone method where a new map is passed, and this method creates a clone using 
// Java cloning where the map is passed on the deeply copied references. 
public class TestCycle3 {

	static class Node implements Cloneable {
		Node next;
		int val;

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

		@Override
		public Node clone() {
			return clone(new IdentityHashMap<Node, Node>());
		}
		
		public Node clone(Map<Node, Node> map) {
			try {
				if(map.containsKey(this))
					return map.get(this);
				Node clone = (Node)super.clone();
				map.put(this, clone);
				if(this.next != null) {
					clone.next = this.next.clone(map);
				}
				return clone;
			} catch (CloneNotSupportedException e) {
				throw new InternalError(e);
			}
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
