package abstractclasses;

interface OutputStream2 {
	void write(char ch);

	default void write(String s) {
		for (int pos = 0; pos < s.length(); pos++) {
			write(s.charAt(pos));
		}
	}
}
