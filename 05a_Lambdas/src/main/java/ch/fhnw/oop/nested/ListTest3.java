package ch.fhnw.oop.nested;

public class ListTest3 {

	public static Function<Integer> multiplyBy(final int factor) {
		return new Function<>() {
			@Override
			public Integer apply(Integer x) {
				return factor * x;
			}
		};
	}

	public static void main(String[] args) {
		List<Integer> list = new List<>();
		list.add(1);
		list.add(2);
		list.add(3);

		List<Integer>.Iterator it = list.map(multiplyBy(42)).iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
