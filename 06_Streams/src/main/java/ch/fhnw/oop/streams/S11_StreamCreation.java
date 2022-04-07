package ch.fhnw.oop.streams;

import java.util.List;
import java.util.stream.Stream;

public class S11_StreamCreation {
	
	public static void main(String[] args) {
		List<Country> countries = List.of(
				new Country("CHE", "Switzerland",    41_285.00,  8514329),
				new Country("DEU", "Germany",       357_121.41, 82905782),
				new Country("FRA", "France",        668_763.00, 66965912),
				new Country("ITA", "Italy",         301_338.00, 60421760),
				new Country("AUT", "Austria",        83_878.99,  8840521)
		);

		Stream<Country> s1 = countries.stream();
		s1.forEach(System.out::println);
		System.out.println();
		
		String[] chars = "Hello World".split("");
		Stream<String> s2 = Stream.of(chars);
		s2.forEach(System.out::println);
		System.out.println();
		
		Stream<Integer> s3 = Stream.of(6, 28, 496, 8128, 33550336);
		s3.forEach(System.out::println);
		System.out.println();
		
		Stream<String> s4 = Stream.generate(() -> "Echo");
		s4.limit(5).forEach(System.out::println);
		System.out.println();
		
		Stream<Double> s5 = Stream.generate(Math::random);
		s5.limit(5).forEach(System.out::println);
		System.out.println();
		
		Stream<Integer> s6 = Stream.iterate(1, i -> i + 1);
		s6.limit(5).forEach(System.out::println);
	}
	
}