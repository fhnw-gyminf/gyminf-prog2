package ch.fhnw.oop.nested;
public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new List<>();
		list.add(1);
		list.add(2);
		list.add(3);

		class Square implements Function<Integer> {
			@Override
			public Integer apply(Integer x) {
				return x * x;
			}
		}

		List<Integer> list2 = list.map(new Square());
		List<Integer>.Iterator it = list2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		List<Integer> list3 = list.map(new Function<>() {
			@Override
			public Integer apply(Integer x) {
				return x * x;
			}
		});
		it = list3.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		List<Integer> list4 = list.map(x -> x * x);
		it = list4.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
