package ch.fhnw.oop.lambdas;

import java.util.Arrays;

public class S37_Filter {

	@FunctionalInterface
	public interface Predicate {
		boolean test(int x);
	}

	static int[] filter(Predicate pred, int[] data) {
		int[] tmp = new int[data.length];
		int len = 0;
		for (int i = 0; i < data.length; i++) {
			if (pred.test(data[i]))
				tmp[len++] = data[i];
		}
		int[] result = new int[len];
		System.arraycopy(tmp, 0, result, 0, len);
		return result;
	}

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6 };
		int[] r1 = filter(x -> x % 2 == 0, data);
		int[] r2 = filter(x -> x > 3, data);
		System.out.println(Arrays.toString(r1));
		System.out.println(Arrays.toString(r2));
	} 
}
