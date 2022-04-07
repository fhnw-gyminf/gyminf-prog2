package ch.fhnw.oop.streams;

public class CountriesTest {
	
	public static void main(String[] args) {
		Countries.stream()
			.map(c -> c.getName())
			.forEach(System.out::println);
	}

}
