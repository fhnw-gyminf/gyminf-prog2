package ch.fhnw.oop.streams;

import java.util.stream.Stream;

public class S26_Lazy {

	public static void main(String[] args) {
		Stream.iterate(1, x -> x+1)
			.filter(n -> {
				System.out.println("filtering: " + n);
				return n % 2 == 0;
			})
			.map(n -> {
				System.out.println("mapping: " + n);
				return n * n;
			})
			.limit(3)
			.forEach(System.out::println);

		System.out.println();
		Stream.iterate(1, x -> x+1)
			.peek(e -> System.out.println("iterate: " + e))
			.filter(n -> n % 2 == 0)
			.peek(e -> System.out.println("filtered: " + e))
			.map(n -> n * n)
			.peek(e -> System.out.println("mapped: " + e))
			.limit(3)
			.forEach(System.out::println);
	}

}
