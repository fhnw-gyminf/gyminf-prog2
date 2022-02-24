package ch.fhnw.oop.generics.trashcan;

@SuppressWarnings("unchecked")
public class RecyclingBin<T> {
	private T[] waste = (T[]) new Object[100];
	private int pos = 0;

	public void trash(T object) {
		waste[pos++] = object;
	}

	public T getLast() {
		return waste[--pos];
	}

	public void purge() {
		waste = (T[]) new Object[100];
		pos = 0;
	}

	static class Paper { }
	static class Plastic { }
	static class Glass { }

	public static void main(String[] args) {
		RecyclingBin<Paper> recyclingBin = new RecyclingBin<>();

		recyclingBin.trash(new Paper());
//		recyclingBin.trash(new Plastic());
//		Error message: The method trash(RecyclingBin.Paper) in the type RecyclingBin<RecyclingBin.Paper> 

		Paper paper = recyclingBin.getLast();
		System.out.println(paper);
	}

}
