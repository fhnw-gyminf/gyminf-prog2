package ch.fhnw.oop.clone;

import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
		ColorPoint p2 = p1.clone();

		System.out.printf("%s [%d]%n", p1, System.identityHashCode(p1));
		System.out.printf("%s [%d]%n", p2, System.identityHashCode(p2));

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}
