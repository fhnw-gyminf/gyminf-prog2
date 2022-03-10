package ch.fhnw.oop.boxing;

class Autoboxing1 {

	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println();

		System.out.println(i1 >= i2);
		System.out.println(i1 <= i2);
		System.out.println(i1 == i2);
	}

}
