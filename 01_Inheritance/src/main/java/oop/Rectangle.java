package oop;

public class Rectangle {
	private int x, y, width, height;

	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}

	public Rectangle(int width, int height) {
		this(0, 0, width, height);
	}

	public Rectangle(Rectangle r) {
		this(r.x, r.y, r.width, r.height);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getArea() {
		return getWidth() * getHeight();
	}

}
