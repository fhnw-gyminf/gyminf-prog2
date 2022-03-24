package ch.fhnw.oop.lambdas;

public class S38_Examples {

	public interface BinaryOp {
		int exec(int x, int y);
	}

	public interface StringOp {
		String exec(String s, int a, int b);
	}

	public interface Random {
		int get();
	}

	public interface Function2 {
		int exec(int a, int b);
	}

	public interface Action {
		void exec();
	}

	public static void main(String[] args) {
		BinaryOp bop;
		bop = (a, b) -> a * a + b * b;
		System.out.println(bop.exec(3, 4)); // 25

		bop = (x, y) -> 2 * x + 2 * y;
		System.out.println(bop.exec(3, 4)); // 14

		StringOp sop;
		sop = (s, a, b) -> s.substring(a, b);
		System.out.println(sop.exec("Haskell", 1, 4)); // "ask"

		sop = (s, a, b) -> s.substring(0, a) + s.substring(b);
		System.out.println(sop.exec("Haskell", 1, 4)); // "Hell"

		Random op;
		op = () -> (int) (Math.random() * Integer.MAX_VALUE);
		System.out.println(op.get());
		System.out.println(op.get());

		Function2 ggt = (x, y) -> {
			int rest = x % y;
			while (rest != 0) {
				x = y;
				y = rest;
				rest = x % y;
			}
			return y;
		};
		System.out.println(ggt.exec(28, 64));
		
		Action action;
		action = () -> System.out.println("Hello");
		action.exec();
		action = () -> { System.out.println("Hello"); };
		action.exec();
		action = () -> { for(int i = 0; i < 5; i++) System.out.println("Hello"+i); };
		action.exec();
	}

}
