package ch.fhnw.oop.streams;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.List;

public class S04_Motivation {
	
	public static void main(String[] args) {
		List<Country> countries = List.of(
				new Country("CHE", "Switzerland",    41_285.00,  8514329),
				new Country("DEU", "Germany",       357_121.41, 82905782),
				new Country("FRA", "France",        668_763.00, 66965912),
				new Country("ITA", "Italy",         301_338.00, 60421760),
				new Country("AUT", "Austria",        83_878.99,  8840521)
		);
		List<String> names = namesOfCountriesSmallerThan(countries, 100_000);
		System.out.println(names);
	}
	
	public static List<String> namesOfCountriesSmallerThan(List<Country> countries, double area) {
		return countries.stream()
				.filter(c -> c.getArea() < area)
				.sorted(comparing(Country::getArea))
				.map(Country::getName)
				.collect(toList());
	}

}
