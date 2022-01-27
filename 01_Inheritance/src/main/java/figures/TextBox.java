package figures;

public class TextBox extends Rectangle {
	private String text;

	public TextBox(int x, int y, int w, int h, String text) {
		super(x, y, w, h);
		this.text = text;
	}

	@Override
	public void draw() {
		super.draw();
		drawString(getX() + 5, getY() + 5, text);
	}

	private void drawString(int x, int y, String text) {
		System.out.printf("drawString(%d, %d, %s)%n", x, y, text);
	}
}
