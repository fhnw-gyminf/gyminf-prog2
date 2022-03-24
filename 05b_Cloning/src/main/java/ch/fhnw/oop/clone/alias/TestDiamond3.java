package ch.fhnw.oop.clone.alias;

import java.util.IdentityHashMap;
import java.util.Map;

// This program implements clone with the help of a identity-hash-map where the cloned objects are stored.
// Method clone invokes a clone method where a new map is passed, and this method creates a clone using 
// Java cloning where the map is passed on the deeply copied references. 
public class TestDiamond3 {

	static class Node implements Cloneable {
		private Node left, right;
		private int val;

		public Node(int val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
		
		@Override
		public Node clone() {
			return clone(new IdentityHashMap<Node, Node>());
		}
		
		public Node clone(Map<Node, Node> map) {
			try {
				if(map.containsKey(this))
					return map.get(this);
				Node clone;
				clone = (Node)super.clone();
				map.put(this, clone);
				if(this.left != null) {
					clone.left = this.left.clone(map);
				}
				if(this.right != null) {
					clone.right = this.right.clone(map);
				}
				return clone;
			} catch (CloneNotSupportedException e) {
				throw new InternalError(e);
			}
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

		Node c = null;
		c = n1.clone();
//		c = (Node) SerializableClone.clone(n1);
//		c = (Node) ReflectiveClone.clone(n1);
//
//		Cloner cloner=new Cloner();
//		c = cloner.deepClone(n1);

		System.out.println(c.getLeft().getRight());
		System.out.println(c.getRight().getLeft());
		System.out.println(c.getLeft().getRight() == c.getRight().getLeft());
	}
}
