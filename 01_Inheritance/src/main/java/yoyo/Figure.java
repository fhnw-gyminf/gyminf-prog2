package yoyo;

public class Figure {

	public void draw() {
		System.out.println("Figure:draw");
		drawContent();
		drawBorder();
	}

	public void drawContent() {
		System.out.println("Figure:drawContent");
	}

	public void drawBorder() {
		System.out.println("Figure:drawBorder");
	}
}
