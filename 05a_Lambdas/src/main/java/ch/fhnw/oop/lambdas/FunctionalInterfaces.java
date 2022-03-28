package ch.fhnw.oop.lambdas;

import java.io.File;

public class FunctionalInterfaces {

	// 1)
	@FunctionalInterface
	public interface FileFilter {
		boolean accept(File pathname);
	}

	// 2)
	@FunctionalInterface
	public interface Callable<V> {
		V call() throws Exception;
	}

	// 3)
	@FunctionalInterface
	public interface CharPredicate {
		boolean is(int ch);

		default CharPredicate negate() {
			return ch -> !is(ch);
		}
	}

	// 4)
	// @FunctionalInterface
	public interface EqualToFilter {
		boolean equals(Object arg);
	}

	// 5)
	@FunctionalInterface
	public interface Function<T, R> {
		R apply(T t);

		static <T> Function<T, T> identity() {
			return t -> t;
		}
	}

	// 6)
	@FunctionalInterface
	public interface NestedFunction<T1, T2, R> {
		Function<T2, R> exec(T1 x);
	}

	// 7)
	@FunctionalInterface
	public interface UnaryOperator<T> extends Function<T, T> {
	}

	// 8)
	// @FunctionalInterface
	public interface Cache<K, V> extends Function<K, V> {
		V get(K key) throws Exception;
	}

	// 9)
	@FunctionalInterface
	public interface Comparator<T> {
		int compare(T o1, T o2);

		boolean equals(Object o);
	}

	public static void main(String[] args) {
		// 1)
		FileFilter filter = f -> f.exists();
		filter = x -> true;
		filter = f -> f.getName().length() > 5;
		filter = f -> f.getName().endsWith(".pdf");
		filter = f -> f.getName().equals("C:\\temp\\test.txt");
		filter = f -> { throw new RuntimeException(); };

		filter = File::exists; // type 3


		// 2)
		Callable<Double> callable = () -> Math.random();
		callable = () -> 3.0;
		callable = () -> Double.valueOf(43);
		callable = () -> { throw new Exception(); };

		callable = Math::random; // type 1


		// 3)
		CharPredicate pred = ch -> Character.isDigit(ch);
		CharPredicate npred = pred.negate();
		System.out.println(pred.is('5'));
		System.out.println(npred.is('5'));
		pred = ch -> true;
		pred = ch -> false;

		pred = Character::isDigit; // type 1

		// 5)
		Function<String, Integer> f = s -> s.length();
		f = s -> 42;
		f = s -> null;
		f = s -> Integer.parseInt(s);
		Integer res = f.apply("4450");

		f = Integer::parseInt; // type 1
		f = String::length; // type 3

    
		// 6)
		NestedFunction<String, Integer, String> nf = s -> (n -> s.substring(n));

		Function<Integer, String> f2 = nf.exec("Hello World");
		String res2 = f2.apply(3);
		System.out.println(nf.exec("Hello World").apply(6));

		nf = s -> new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				return s.substring(t);
			}
		};

		nf = new NestedFunction<>() {
			@Override
			public Function<Integer, String> exec(String s) {
				return new Function<Integer, String>() {
					@Override
					public String apply(Integer t) {
						return s.substring(t);
					}
				};
			}
		};

		// 7)
		UnaryOperator<String> op = s -> s.toUpperCase();
		op = s -> s;
		op = s -> null;

		op = String::toUpperCase; // type 3


		// 9)
		Comparator<String> cmp = (s1, s2) -> s1.length() - s2.length();
		cmp = (s1, s2) -> s1.compareTo(s2);
		cmp = (s1, s2) -> 0;

		cmp = String::compareTo; // type 3
	}

}
