package ch.fhnw.oop.clone.alias;

import java.util.IdentityHashMap;
import java.util.Map;

// This program implements clone with the help of a identity-hash-map where the cloned objects are stored.
// Method clone invokes a clone method where a new map is passed, and this method creates a clone using a
// private copy constructor where the map is passed in case that the object has not already been cloned.
public class TestDiamond2 {

	static class Node {
		private Node left, right;
		private int val;

		public Node(int val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
		public Node(Node source, Map<Node, Node> map) {
			map.put(source, this);
			this.val = source.val;
			if(source.left != null) this.left = source.left.clone(map);
			if(source.right != null) this.right = source.right.clone(map);
		}

		@Override
		public Node clone() {
			return clone(new IdentityHashMap<Node, Node>());
		}
		
		public Node clone(Map<Node, Node> map) {
			if(map.containsKey(this))
				return map.get(this);
			return new Node(this, map);
		}

		public Node getLeft() {  return left; }
		public Node getRight() { return right; }
		public int getVal() { return val; }
	}

	public static void main(String[] args) {
		Node n4 = new Node(4, null, null);
		Node n2 = new Node(2, null, n4);
		Node n3 = new Node(3, n4, null);
		Node n1 = new Node(1, n2, n3);
		
		System.out.println(n1.getLeft().getRight());
		System.out.println(n1.getRight().getLeft());
		System.out.println(n1.getLeft().getRight() == n1.getRight().getLeft());

		Node c = n1.clone();
	
		System.out.println(c.getLeft().getRight());
		System.out.println(c.getRight().getLeft());
		System.out.println(c.getLeft().getRight() == c.getRight().getLeft());
	}
}
