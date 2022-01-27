package figures;

public class Test1 {

	public static void main(String[] args) {
		Figure f = new Figure(0, 0);
		Rectangle r = new Rectangle(0, 0, 100, 50);
		TextBox tb = new TextBox(0, 0, 100, 50, "Hello");

		System.out.println(r instanceof Rectangle);
		System.out.println(f instanceof Rectangle);
		System.out.println(r instanceof Figure);

		f = tb;
		System.out.println(f instanceof Rectangle);
		System.out.println(f instanceof TextBox);

		f = null;
		System.out.println(f instanceof TextBox);

//		System.out.println(f instanceof Dog);
	}

}

class Dog {}
