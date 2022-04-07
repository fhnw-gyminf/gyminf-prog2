package ch.fhnw.oop.streams;

import java.util.ArrayList;
import java.util.List;

public class Continents {
	
	private static List<String> europe = new ArrayList<>();
	static {
		europe.add("Albania");
		europe.add("Andorra");
		europe.add("Austria");
		europe.add("Belarus");
		europe.add("Belgium");
		europe.add("Bosnia and Herzegovina");
		europe.add("Bulgaria");
		europe.add("Croatia");
		europe.add("Czech Republic");
		europe.add("Denmark");
		europe.add("Estonia");
		europe.add("Finland");
		europe.add("France");
		europe.add("Germany");
		europe.add("Greece");
		europe.add("Hungary");
		europe.add("Iceland");
		europe.add("Ireland");
		europe.add("Italy");
		europe.add("Kazakhstan");
		europe.add("Kosovo");
		europe.add("Latvia");
		europe.add("Liechtenstein");
		europe.add("Lithuania");
		europe.add("Luxembourg");
		europe.add("Malta");
		europe.add("Moldova");
		europe.add("Monaco");
		europe.add("Montenegro");
		europe.add("Netherlands");
		europe.add("North Macedonia");
		europe.add("Norway");
		europe.add("Poland");
		europe.add("Portugal");
		europe.add("Romania");
		europe.add("Russian Federation");
		europe.add("San Marino");
		europe.add("Serbia");
		europe.add("Slovak Republic");
		europe.add("Slovenia");
		europe.add("Spain");
		europe.add("Sweden");
		europe.add("Switzerland");
		europe.add("Turkey");
		europe.add("Ukraine");
		europe.add("United Kingdom");
	}
	
	public static boolean inEurope(Country c) {
		return europe.contains(c.getName());
	}

}
