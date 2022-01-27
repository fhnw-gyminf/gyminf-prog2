package stack;

public class GenericStack {
	private Object[] data = new Object[100];
	private int top = 0;

	public void push(Object elem) {
		data[top++] = elem;
	}

	public Object pop() {
		return data[--top];
	}
}
