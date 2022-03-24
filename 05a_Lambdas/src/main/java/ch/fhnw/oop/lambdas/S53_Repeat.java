package ch.fhnw.oop.lambdas;

public class S53_Repeat {

	public interface IntConsumer {
		void accept(int value);
	}

	public static void repeat(int n, Runnable action) {
		for (int i = 0; i < n; i++) {
			action.run();
		}
	}

	public static void repeat(int n, IntConsumer action) {
		for (int i = 0; i < n; i++) {
			action.accept(i);
		}
	}


	public static void main(String[] args) {
		repeat(3, () -> System.out.print("Hello, World! "));
		System.out.println();
		repeat(4, i -> System.out.println("Countdown: " + (3-i)));
	}
}
