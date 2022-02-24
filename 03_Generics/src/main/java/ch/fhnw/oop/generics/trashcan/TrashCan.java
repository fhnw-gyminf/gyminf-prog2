package ch.fhnw.oop.generics.trashcan;

public class TrashCan {
	private Object[] waste = new Object[100];
	private int pos;

	public void trash(Object object) {
		waste[pos++] = object;
	}

	public Object getLast() {
		return waste[--pos];
	}

	public void purge() {
		waste = new Object[100];
		pos = 0;
	}

	static class Paper { }
	static class Plastic { }
	static class Glass { }

	public static void main(String[] args) {
		TrashCan trashCan = new TrashCan();

		trashCan.trash(new Paper());
		trashCan.trash(new Glass());

		Object o = trashCan.getLast();
		Glass glass = null;
		if (o instanceof Glass) {
			glass = (Glass) o;
		}
		System.out.println(glass);
	}

}
