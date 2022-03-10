package ch.fhnw.oop.exceptions.flow;

public class FlowTest {

	public static void main(String[] args) {
		
		p(0);

	}
	
	static void p(int status) {
		try {
			q(status);
			System.out.println("p - after q()");
		} catch (E1 ex) {
			System.out.println("p - catch " + ex.getMessage());
		}
		System.out.println("p - end");
	}
	
	static void q(int status) {
		try {
			r(status);
			System.out.println("q - after r()");
		} catch (E2 ex) {
			System.out.println("q - catch " + ex.getMessage());
		} finally {
			System.out.println("q - finally...");
		}
		System.out.println("q - end");
	}
	
	static void r(int status) {
		if (status == 1) {
			throw new E1("E1");
		} else if (status == 2) {
			throw new E2("E2");
		} else if (status == 3) {
			throw new E3("E3");
		}
	}

}

class E1 extends RuntimeException {
	E1(String msg) {
		super(msg);
	}
}

class E2 extends RuntimeException {
	E2(String msg) {
		super(msg);
	}
}

class E3 extends RuntimeException {
	E3(String msg) {
		super(msg);
	}
}
