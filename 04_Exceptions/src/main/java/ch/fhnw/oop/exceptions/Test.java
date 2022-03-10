package ch.fhnw.oop.exceptions;

public class Test {

	public static void main(String[] args) {
		System.out.println("Ausgabe auf System.out");
		System.err.println("Ausgabe auf System.err");
		foo();
	}
	
	private static void foo() {
		bar();
	}
	
	private static void bar() {
		throw new RuntimeException();
	}

}
