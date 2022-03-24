package ch.fhnw.oop.clone.stack;

public class ArrayStack implements Cloneable {

	private final static int CAPACITY = 20;

	private Object[] buf = new Object[CAPACITY];
	private int pos = 0;

	public void push(Object x) {
		buf[pos++] = x;
	}

	public Object pop() {
		return buf[--pos];
	}

	public boolean isEmpty() {
		return pos == 0;
	}

	public boolean isFull() {
		return pos == CAPACITY;
	}

	@Override
	public Object clone() {
		try {
			ArrayStack s = (ArrayStack) super.clone();
			s.buf = buf.clone();
			return s;
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}

}
