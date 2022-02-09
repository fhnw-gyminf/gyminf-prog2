package abstractclasses;

public class Terminal extends OutputStream {

	@Override
	public void write(char ch) {
		System.out.print(ch);
	}

}
