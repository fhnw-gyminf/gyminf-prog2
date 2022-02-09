package abstractclasses;

public class Test {

	public static void main(String[] args) {
		OutputStream out = new Terminal();
		out.write("Hello World1");
		out.write('\n');

		OutputStream2 out2 = new Terminal2();
		out2.write("Hello World2");
	}

}
