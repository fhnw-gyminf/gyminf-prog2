package ch.fhnw.oop.generics.trashcan;

public class GlassTrashCan {
	private Glass[] waste = new Glass[100];
	private int pos = 0;

	public void trash(Glass object) {
		waste[pos++] = object;
	}

	public Glass getLast() {
		return waste[--pos];
	}

	public void purge() {
		waste = new Glass[100];
		pos = 0;
	}

	static class Glass { }

	public static void main(String[] args) {
		GlassTrashCan trashCan = new GlassTrashCan();
		trashCan.trash(new Glass());
		Glass glass = trashCan.getLast();
		System.out.println(glass);
	}
}
