package ch.fhnw.oop.streams;

import static java.util.Comparator.comparing;

public class S23_Sorted {

	public static void main(String[] args) {
		Countries.stream()
				.sorted((c1, c2) -> Double.valueOf(c1.getArea()).compareTo(c2.getArea()))
				.limit(5)
				.forEach(System.out::println);

		System.out.println();
		Countries.stream()
				.map(Country::getArea)
				.sorted()
				.limit(5)
				.forEach(System.out::println);

		System.out.println();
		Countries.stream()
				.sorted(comparing(Country::getArea))
				.limit(5)
				.forEach(System.out::println);

		System.out.println();
		Countries.stream()
				.filter(c -> !Double.isNaN(c.getArea()))
				.sorted(comparing(Country::getArea).reversed())
				.limit(5)
				.forEach(System.out::println);
	}

}
