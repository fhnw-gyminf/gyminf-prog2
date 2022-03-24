package ch.fhnw.oop.clone.immutable.samples;

public class ComplexImmutable {
	private final double re, im;
	
	public ComplexImmutable(double re, double im) { this.re = re; this.im = im; }
	public ComplexImmutable(double re) { this(re, 0.0); }
	
	public double getRe () { return re; }
	public double getIm () { return im; }
	public double getAbs() { return Math.sqrt(re*re + im*im); }
	public double getArg() { return Math.atan2(im, re); }
	
	public ComplexImmutable add(ComplexImmutable x) { return new ComplexImmutable(re + x.re, im + x.im); }
	public ComplexImmutable multiply(ComplexImmutable y) {
		return new ComplexImmutable(
				this.re*y.re - this.im*y.im,
				this.re*y.im + this.im*y.re); 
	}
	public ComplexImmutable square(){ return multiply(this); }

	@Override
	public String toString(){
		return re + (im > 0 ? " + " : " ") + im + "i";
	}
	
	
	public static void main(String[] args){
		ComplexImmutable x = new ComplexImmutable(2,3);
		ComplexImmutable y = new ComplexImmutable(2,3);

		System.out.println(x);
		x = x.multiply(y);
		System.out.println(x);

		x = new ComplexImmutable(2,3);
		System.out.println(x);
		x = x.square();
		System.out.println(x);
		
	}
}