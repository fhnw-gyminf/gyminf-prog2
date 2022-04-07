package ch.fhnw.oop.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S03_Motivation {
	
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
		List<Country> smallCountries = new ArrayList<>();
		for(Country c : countries) {
			if(c.getArea() < area) {
				smallCountries.add(c);
			}
		}
		
		Collections.sort(smallCountries,
				(c1, c2) -> (int)Math.signum(c1.getArea() - c2.getArea()));
		
		List<String> names = new ArrayList<>();
		for(Country c : smallCountries) {
			names.add(c.getName());
		}
		
		return names;
	}

}
