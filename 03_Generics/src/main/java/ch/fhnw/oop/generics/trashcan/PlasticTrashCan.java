package ch.fhnw.oop.generics.trashcan;

public class PlasticTrashCan {
	private Plastic[] waste = new Plastic[100];
	private int pos = 0;

	public void trash(Plastic object) {
		waste[pos++] = object;
	}

	public Plastic getLast() {
		return waste[--pos];
	}

	public void purge() {
		waste = new Plastic[100];
		pos = 0;
	}

	static class Plastic { }

	public static void main(String[] args) {
		PlasticTrashCan trashCan = new PlasticTrashCan();
		trashCan.trash(new Plastic());
		Plastic plastic = trashCan.getLast();
		System.out.println(plastic);
	}
}
