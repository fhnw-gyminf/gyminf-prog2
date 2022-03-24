package ch.fhnw.oop.clone.immutable.samples;

public class ComplexMutable {
	private double re, im;
	
	public ComplexMutable(double re, double im) { this.re = re; this.im = im; }
	public ComplexMutable(double re) { this(re, 0.0); }
	
	public double getRe () { return re; }
	public double getIm () { return im; }
	public double getAbs() { return Math.sqrt(re*re + im*im); }
	public double getArg() { return Math.atan2(im, re); }
	
	public void add(ComplexMutable x) { re += x.re; im += x.im; }
	public void multiply(ComplexMutable y) {
		double re = this.re;
		double im = this.im;
		this.re = re*y.re - im*y.im; 
		this.im = re*y.im + im*y.re; 
	}
	public void square(){ multiply(this); }

	@Override
	public String toString(){
		return re + (im > 0 ? " + " : " ") + im + "i";
	}
	
	
	public static void main(String[] args){
		ComplexMutable x = new ComplexMutable(2,3);
		ComplexMutable y = new ComplexMutable(2,3);

		System.out.println(x);
		x.multiply(y);	// corresponds to x *= y
		System.out.println(x);

		x = new ComplexMutable(2,3);
		System.out.println(x);
		x.square();
		System.out.println(x);
		
	}
}