package ch.fhnw.oop.streams;

import static java.util.Comparator.comparing;

public class S21_ForEach {

	public static void main(String[] args) {
		Countries.stream()
			.filter(Continents::inEurope)
			.filter(c -> c.getArea() < 100_000)
			.sorted(comparing(Country::getArea))
			.forEach(x -> System.out.println(x));
	}

}