package ch.fhnw.oop.generics.trashcan;

public class PaperTrashCan {
	private Paper[] waste = new Paper[100];
	private int pos = 0;

	public void trash(Paper object) {
		waste[pos++] = object;
	}

	public Paper getLast() {
		return waste[--pos];
	}

	public void purge() {
		waste = new Paper[100];
		pos = 0;
	}

	static class Paper { }

	public static void main(String[] args) {
		PaperTrashCan trashCan = new PaperTrashCan();
		trashCan.trash(new Paper());
		Paper paper = trashCan.getLast();
		System.out.println(paper);
	}
}
