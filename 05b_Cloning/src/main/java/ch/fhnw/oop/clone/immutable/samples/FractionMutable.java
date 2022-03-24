package ch.fhnw.oop.clone.immutable.samples;

public class FractionMutable {
	private int n, d;

	// Constructors
	public FractionMutable(int numer, int denom) {
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

	public FractionMutable(int numer) { this(numer, 1); }
	public FractionMutable(FractionMutable f) { this(f.n, f.d); }

	public double getNumerator() { return n; }
	public double getDenominator() { return d; }

	@Override
	public String toString() {
		return n + " / " + d;
	}

	public void divide(FractionMutable y) { // this = this / y
		this.n *= y.d; // i.e. Fraction is mutable
		this.d *= y.n;
		int g = gcd(this.n, this.d);
		this.n /= g;
		this.d /= g;
		assert this.d > 0;
	}
	
	public static void main(String[] args) {
		FractionMutable f = new FractionMutable(2, 3); 	// f = 2/3
		System.out.println(f);
		f.divide(f);						// f = f/f
		System.out.println(f);
	}

}