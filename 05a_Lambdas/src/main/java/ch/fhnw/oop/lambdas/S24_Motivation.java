package ch.fhnw.oop.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class S24_Motivation {

	static class LengthComparator implements Comparator<String> {
		public int compare(String a, String b) {
			return Integer.compare(a.length(), b.length());
		}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Haskell");
		list.add("Scala");
		list.add("Python");
		Collections.sort(list, new LengthComparator());
		System.out.println(list);
	}
}

class Motivation2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Haskell");
		list.add("Scala");
		list.add("Python");

		class LengthComparator implements Comparator<String> {
			public int compare(String a, String b) {
				return Integer.compare(a.length(), b.length());
			}
		}
		Collections.sort(list, new LengthComparator());
		System.out.println(list);
	}
}

class Motivation3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Haskell");
		list.add("Scala");
		list.add("Python");
		Collections.sort(list, new Comparator<String>() {
			public int compare(String a, String b) {
				return Integer.compare(a.length(), b.length());
			}
		});
		System.out.println(list);
	}
}

class Motivation4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Haskell");
		list.add("Scala");
		list.add("Python");
		Collections.sort(list, (a, b) -> Integer.compare(a.length(), b.length()));
		System.out.println(list);
	}
}





