package ch.fhnw.oop.boxing;

public class Test {
	public static Integer inc(Integer i) {
		return i + 1;
	}
	   
	public static void main(String[] args) {
		Object o1 = inc(2); 		System.out.println(o1); // 3
		Integer i1 = inc(2); 		System.out.println(i1); // 3
		int i2 = inc(2); 			System.out.println(i2); // 3
	}

}
