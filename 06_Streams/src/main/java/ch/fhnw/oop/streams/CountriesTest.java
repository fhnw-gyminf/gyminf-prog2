package ch.fhnw.oop.streams;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountriesTest {
	
	public static void main(String[] args) {
		// a) Anzahl Länder mit mindestens 1Mio Einwohner
		System.out.println(Countries.stream()
			.filter(c -> c.getPopulation() >= 1_000_000)
			.count()
		);

		// b) Summe der Einwohner aller Länder deren Namen mit "S" startet.
		System.out.println();
		double einwohner = Countries.stream()
			.filter(c -> c.getName().startsWith("S"))
			.mapToInt(c -> c.getPopulation())
			.sum();
		System.out.println(einwohner);

		// c) Name und Fläche aller Länder mit > 5Mio Einwohner und Fläche >= 5 Mio km2
		System.out.println();
		Countries.stream()
			.filter(c -> c.getPopulation() >= 5_000_000)
			.filter(c -> c.getArea() >= 5_000_000)
			.map(c -> c.getName() + ": " + c.getArea())
			.forEach(System.out::println);

		// d) Liste der Namensteile der Landnamen, die kürzer oder gleich 3 Zeichen lang sind
		System.out.println();
		System.out.println(Countries.stream()
			.map(c -> c.getName())
			.flatMap(s -> Stream.of(s.split(" ")))
			.filter(s -> s.length() <= 3)
			.distinct()
			.collect(Collectors.joining(", ")));
		
		// e) 
		System.out.println();
		Countries.stream()
			.filter(c -> !Double.isNaN(c.getArea()))
//			.sorted((c1, c2) -> -(int)Math.signum(c1.getPopulation()/c1.getArea() - c2.getPopulation()/c2.getArea()))
			.sorted(Comparator.comparing((Country c) -> c.getPopulation()/c.getArea()).reversed())
			.limit(5)
			.map(c -> c.getName() + " " + (c.getPopulation()/c.getArea()))
			.forEachOrdered(System.out::println);
	

	}

}
