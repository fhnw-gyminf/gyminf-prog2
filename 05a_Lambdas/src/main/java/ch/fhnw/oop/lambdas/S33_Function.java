package ch.fhnw.oop.lambdas;

import java.util.Comparator;

public class S33_Function {

	@FunctionalInterface
	interface Function {
		int exec(int x);
	}

	public static void main(String[] args) {
		Function f;
		f = x -> x * x;
		f = x -> x % x;
		f = x -> 42;
		f = x -> (int) 3.0;
		f = x -> (short) ((double) x / x);

		// Object obj = x -> x; // does not compile
		Object obj = (Function) (x -> x);

		// int res = ((i1, i2) -> 0).compare("42", "-42"); // does not compile
		int res = ((Comparator<String>) ((i1, i2) -> 0)).compare("42", "-42");
	}

}
