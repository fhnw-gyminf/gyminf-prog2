package yoyo;

public class TextBox extends Rectangle {

	@Override
	public void draw() {
		System.out.println("TextBox:draw");
		super.draw();
		super.drawBorder();
	}

	@Override
	public void drawBorder() {
		System.out.println("Rectangle:drawBorder");
	}
}
