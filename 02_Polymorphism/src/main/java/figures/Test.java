package figures;

public class Test {

	public static void main(String[] args) {
		Rectangle r = null;
		r = new Rectangle(4, 5);
		if (r instanceof Drawable) { System.out.println("Drawable"); }
		if (r instanceof Moveable) { System.out.println("Moveable"); }
		// if (r instanceof Triangle) { System.out.println("Triangle"); }
		if (r instanceof TextBox) { System.out.println("TextBox"); }
		if (r instanceof Figure) { System.out.println("Figure"); }

		Rectangle x = new Rectangle(20, 10);
		Figure f = x;
		Triangle t = (Triangle) f;
		Polygon p = (Polygon2) t;
	}

}
