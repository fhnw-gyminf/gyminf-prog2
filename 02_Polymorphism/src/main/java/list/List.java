package list;

public class List {
	private Node head = null;

	public void add(Comparable obj) {
		Node p = head, prev = null;
		while(p != null && obj.compareTo(p.obj) > 0) {
			prev = p; p = p.next;
		}
		// p == null || obj <= p.obj
		Node q = new Node(obj, p);
		if(prev == null) head = q; else prev.next = q;
	}

	public void print() {
		Node p = this.head;
		while(p != null) { 
			System.out.println(p.obj);
			p = p.next;
		}
	}

}

class Node {
	Node next;
	Comparable obj;

	Node(Comparable obj, Node next) {
		this.obj = obj;
		this.next = next;
	}
}
