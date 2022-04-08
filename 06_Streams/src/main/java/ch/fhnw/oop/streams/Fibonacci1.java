package gruntz;

import java.util.stream.Stream;

public class Fibonacci1 {

	static class Tuple {
		private final int n1;
		private final int n2;

		public Tuple(int n1, int n2) {
			this.n1 = n1;
			this.n2 = n2;
		}
	}

	public static void main(String[] args) {
		Stream<Tuple> tupleStream = Stream.iterate(
				new Tuple(0, 1), 
				t -> new Tuple(t.n2, t.n1 + t.n2)
		);
		Stream<Integer> fibs = tupleStream.map(x -> x.n1);
		System.out.println(fibs.skip(46).limit(1).findFirst().get());
//		fibs.limit(50).forEach(System.out::println);
	}

}

// f44 = 701408733+1134903170
