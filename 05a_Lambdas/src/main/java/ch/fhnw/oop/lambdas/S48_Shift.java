package ch.fhnw.oop.lambdas;

import java.util.function.Function;

public class S48_Shift {

	public static Function<Double, Double> shift(Function<Double, Double> f, double delta) {
		return x -> f.apply(x - delta);
	}

	public static void main(String[] args) {
		Function<Double, Double> shifted = shift(x -> x * x, 1);
		System.out.println(shifted.apply(0.0)); // 1.0
		System.out.println(shifted.apply(1.0)); // 0.0
		System.out.println(shifted.apply(2.0)); // 1.0
		System.out.println(shifted.apply(3.0)); // 4.0
	}
}
