package ch.fhnw.oop.exceptions.limit;

public class ATM {

	private double limit = 3000;

	public static void main(String[] args) {

		try {
			ATM atm = new ATM();
			atm.withdraw(5000);
			System.out.println("Success!");
		} catch (LimitOverflowException exception) {
			System.err.println("LimitOverflowException");
			System.err.println(exception.getMessage());
			exception.printStackTrace();
		} catch (Exception exception) {
			System.err.println("Exception");
			System.err.println(exception.getMessage());
		} finally {
			System.out.println("Finally");
		}
		System.out.println("done");
	}

	public void withdraw(double amount) throws LimitOverflowException {

		if (amount > limit) {
			throw new LimitOverflowException(limit);
		} else {
			// ...
		}

	}

}
