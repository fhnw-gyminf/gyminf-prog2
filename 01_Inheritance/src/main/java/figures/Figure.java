package figures;

public class Figure {
	private int x, y;

	public Figure(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public void draw() {
		System.out.printf("Figure:draw(%d, %d)%n", x, y);
	}

}
