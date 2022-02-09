package abstractclasses;

public class Terminal2 implements OutputStream2 {

	@Override
	public void write(char ch) {
		System.out.print(ch);
	}

}
