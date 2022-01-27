package stack;

import dates.Date;
import figures.Rectangle;

public class GenericStackTest {

	public static void main(String[] args) {
		GenericStack stack = new GenericStack();
		stack.push(new Rectangle(0, 0, 100, 50));
		stack.push("Text");
		stack.push(new Date(3, 8, 2020));
		
		Date d = (Date)stack.pop();
		String s = (String)stack.pop();
		Rectangle r = (Rectangle)stack.pop();
		
		System.out.println(r);
		System.out.println(s);
		System.out.println(d);
	}

}
