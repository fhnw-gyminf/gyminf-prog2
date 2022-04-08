package gruntz;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Fibonacci2 {

	static class Tuple {
		private final BigInteger n1;
		private final BigInteger n2;

		public Tuple(BigInteger n1, BigInteger n2) {
			this.n1 = n1;
			this.n2 = n2;
		}
	}

	public static void main(String[] args) {
		Stream<Tuple> tupleStream = Stream.iterate(
				new Tuple(BigInteger.ZERO, BigInteger.ONE), 
				t -> new Tuple(t.n2, t.n1.add(t.n2))
		);
		Stream<BigInteger> fibs = tupleStream.map(x -> x.n1);
		fibs.limit(50).forEach(System.out::println);
	}

}
