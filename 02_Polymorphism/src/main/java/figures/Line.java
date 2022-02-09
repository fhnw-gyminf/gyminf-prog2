package figures;

public class Line extends Figure {
	private double x1, y1, x2, y2;

	public Line(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getCircumference() {
		return 2 * Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

}
