package ch.fhnw.oop.nested;
import java.util.NoSuchElementException;

public class ListWithStaticIterator<T> {
	@SuppressWarnings("unchecked")
	private T[] entries = (T[])new Object[100];
	private int size = 0;

	public void add(T x) {
		entries[size++] = x;
	}

	public static class Iterator<E> {
		private int pos = 0;
		private ListWithStaticIterator<E> list;

		private Iterator(ListWithStaticIterator<E> list) {
			this.list = list;
		}

		public E next() {
			if (pos >= list.size)
				throw new NoSuchElementException();
			return list.entries[pos++];
		}

		public boolean hasNext() {
			return pos < list.size;
		}
	}

	public Iterator<T> iterator() {
		return new Iterator<>(this);
	}

	public ListWithStaticIterator<T> map(Function<T> f) {
		ListWithStaticIterator<T> res = new ListWithStaticIterator<>();
		res.size = size;
		for (int i = 0; i < size; i++) {
			res.entries[i] = f.apply(entries[i]);
		}
		return res;
	}

}
