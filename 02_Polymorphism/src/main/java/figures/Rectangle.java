package figures;

public class Rectangle extends Figure {
	private int w, h;

	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public double getArea() {
		return w * h;
	}

	@Override
	public double getCircumference() {
		return 2 * (w + h);
	}

}
