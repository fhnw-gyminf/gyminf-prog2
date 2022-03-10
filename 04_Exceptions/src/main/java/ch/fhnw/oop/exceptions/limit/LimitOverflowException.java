package ch.fhnw.oop.exceptions.limit;

public class LimitOverflowException extends Exception {

	private final double limit;

	public LimitOverflowException(String message, Throwable cause, double limit) {
		super(message, cause);
		this.limit = limit;
	}

	public LimitOverflowException(Throwable cause, double limit) {
		this("Limit exceeded", cause, limit);
	}

	public LimitOverflowException(double limit) {
		this(null, limit);
	}

	@Override
	public String getMessage() {
		return super.getMessage() + ": " + getLimit();
	}

	public double getLimit() {
		return limit;
	}
}
