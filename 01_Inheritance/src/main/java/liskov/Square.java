package liskov;

public class Square {
	private int x, y, width;

	public Square(int x, int y, int width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return width;
	}

	public void setHeight(int height) {
		this.width = height;
	}

	public int getArea() { 
		return width * width;
	}

}
