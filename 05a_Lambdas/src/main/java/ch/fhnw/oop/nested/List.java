package ch.fhnw.oop.nested;
import java.util.NoSuchElementException;

public class List<T> {
	@SuppressWarnings("unchecked")
	private T[] entries = (T[])new Object[100];
	private int size = 0;

	public void add(T x) {
		entries[size++] = x;
	}

	public class Iterator {
		private int pos = 0;

		public T next() {
			if (pos >= size)
				throw new NoSuchElementException();
			return entries[pos++];
		}

		public boolean hasNext() {
			return pos < size;
		}
	}

	public Iterator iterator() {
		return new Iterator();
	}

	public List<T> map(Function<T> f) {
		List<T> res = new List<>();
		res.size = size;
		for (int i = 0; i < size; i++) {
			res.entries[i] = f.apply(entries[i]);
		}
		return res;
	}

}
