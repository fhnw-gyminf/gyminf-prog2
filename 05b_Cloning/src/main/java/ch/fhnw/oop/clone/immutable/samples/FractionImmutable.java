package ch.fhnw.oop.clone.immutable.samples;

public class FractionImmutable {
	private final int n, d;

	// Constructors
	public FractionImmutable(int numer, int denom) {
		if (denom == 0) throw new IllegalArgumentException();
		int g = gcd(numer, denom);
		this.n = numer / g;
		this.d = denom / g;
		assert this.d > 0;
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			int r = a % b;
			while (r != 0) {
				a = b;
				b = r;
				r = a % b;
			}
			return b;
		}
	}

	public FractionImmutable(int numer) { this(numer, 1); }
	public FractionImmutable(FractionImmutable f) { this(f.n, f.d); }

	public double getNumerator() { return n; }
	public double getDenominator() { return d; }

	@Override
	public String toString() {
		return n + " / " + d;
	}

	public FractionImmutable divide(FractionImmutable y) {
		return new FractionImmutable(this.n * y.d, this.d * y.n);
	}
	
	public static void main(String[] args) {
		FractionImmutable f = new FractionImmutable(2, 3); 	// f = 2/3
		System.out.println(f);
		f = f.divide(f);						// f = f/f
		System.out.println(f);
	}

}