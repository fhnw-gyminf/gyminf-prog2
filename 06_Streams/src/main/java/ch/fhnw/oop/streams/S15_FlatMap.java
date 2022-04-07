package ch.fhnw.oop.streams;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

public class S15_FlatMap {

	public static void main(String[] args) {
		List<String> results = List.of("3:0", "2:1", "0:1");
		Stream<String> scores = results.stream().flatMap(r -> Stream.of(r.split(":")));
		System.out.println(scores.collect(toList()));
 
		System.out.println();
		results.stream().map(r -> Stream.of(r.split(":"))).forEach(System.out::println);

		System.out.println();
		results.stream().map(r -> Stream.of(r.split(":"))).forEach(s -> s.forEach(System.out::println));
		
		System.out.println();
		results.stream().flatMap(r -> Stream.of(r.split(":"))).forEach(System.out::println);
	}

}