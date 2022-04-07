package ch.fhnw.oop.streams;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

public class S09_Motivation {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Country> countries = List.of(
				new Country("CHE", "Switzerland",    41_285,     8514329),
				new Country("DEU", "Germany",       357_121.41, 82905782),
				new Country("FRA", "France",        668_763.00, 66965912),
				new Country("ITA", "Italy",         301_338,    60421760),
				new Country("AUT", "Austria",        83_878.99,  8840521)
		);

		Stream<Country> smallInEurope = countries.stream()
				   .filter(Continents::inEurope)
				   .filter(c -> c.getArea() < 100_000)
				   .sorted(comparing(Country::getArea));
		
		List<String> names = smallInEurope
				.map(Country::getName)
				.collect(toList());
		
		List<Double> areas = smallInEurope
				.map(Country::getArea)
				.collect(toList());
	}
	
}