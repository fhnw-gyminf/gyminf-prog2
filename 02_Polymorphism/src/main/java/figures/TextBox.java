package figures;

public class TextBox extends Rectangle {
	private final String text;

	public TextBox(int w, int h, String text) {
		super(w, h);
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
