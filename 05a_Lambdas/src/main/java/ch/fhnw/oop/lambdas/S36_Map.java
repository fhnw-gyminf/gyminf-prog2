package ch.fhnw.oop.lambdas;

import java.util.Arrays;

public class S36_Map {

	@FunctionalInterface
	public interface Function {
		int exec(int x);
	}

	static int[] map(Function f, int[] data) {
		int[] result = new int[data.length];
		for (int i = 0; i < data.length; i++)
			result[i] = f.exec(data[i]);
		return result;
	}

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4 };
		int[] r1 = map(x -> x + 1, data); // [2, 3, 4, 5]
		int[] r2 = map(x -> x * x, data); // [1, 4, 9, 16]
		int[] r3 = map(x -> x, data); // [1, 2, 3, 4]
		int[] r4 = map(x -> 42, data); // [42, 42, 42, 42]
		System.out.println(Arrays.toString(r1));
		System.out.println(Arrays.toString(r2));
		System.out.println(Arrays.toString(r3));
		System.out.println(Arrays.toString(r4));
	}

}
