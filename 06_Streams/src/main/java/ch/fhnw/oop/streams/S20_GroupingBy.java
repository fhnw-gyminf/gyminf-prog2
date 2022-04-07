package ch.fhnw.oop.streams;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class S20_GroupingBy {

	public static void main(String[] args) {
		List<String> names = List.of(
			"Müller", "Meier", "Kobler", "Schmid", "Stalder",
			"Suter", "Maurer", "Meier",	"Meck", "Müller");

		Map<Character, List<String>> groups = names.stream()
				.collect(groupingBy(s -> s.charAt(0)));
		for (char c : groups.keySet()) {
			String group = groups.get(c).stream().collect(joining(", "));
			System.out.println(c + ": " + group);
		}

		System.out.println();
		Map<Character, Set<String>> groups2 = names.stream()
				.collect(groupingBy(s -> s.charAt(0), toSet()));
		for (char c : groups2.keySet()) {
			String group = groups2.get(c).stream().collect(joining(", "));
			System.out.println(c + ": " + group);
		}
	}

}