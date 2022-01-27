package figures;

public class Test2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Figure f = new TextBox(0, 0, 100, 50, "X");
		Rectangle r;
		TextBox tb;
		Circle c;

		r = (Rectangle) f;
		r = (TextBox) f;
//		tb = r;
		tb = (TextBox) r;
//		c = (Circle) f;

		f = null;
		c = (Circle) f;
	}

}
