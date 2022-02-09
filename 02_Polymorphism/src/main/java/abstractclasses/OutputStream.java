package abstractclasses;

abstract class OutputStream {
	public abstract void write(char ch); // implementation depends on stream type, i.e. Termina, File, Network, etc.

	public void write(String s) {
		for (int pos = 0; pos < s.length(); pos++) {
			write(s.charAt(pos));
		}
	}
}
