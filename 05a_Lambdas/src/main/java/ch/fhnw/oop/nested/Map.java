package ch.fhnw.oop.nested;

public class Map<K, V> {

	private static class Entry<K, V> {
		private final K key;
		private V value;

		private Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	@SuppressWarnings("unchecked")
	private Entry<K, V>[] entries = new Entry[100];

	private int size = 0;

	public void put(K key, V value) {
		assert key != null;
		for (int i = 0; i < size; i++) {
			if (key.equals(entries[i].key)) {
				entries[i].value = value;
				return;
			}
		}
		entries[size++] = new Entry<>(key, value);
	}

	public V get(K key) {
		assert key != null;
		for (int i = 0; i < size; i++) {
			if (key.equals(entries[i].key))
				return entries[i].value;
		}
		return null;
	}


	public static void main(String[] args) {
		Map<Integer, String> map = new Map<>();
		map.put(1, "one");
		map.put(2, "two");
		for(int i = 0; i < 4; i++) System.out.println(map.get(i));
	}
}
