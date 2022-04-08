package ch.fhnw.oop.clone.immutable;

public final class ImmutablePoint {
	private final int x, y;

	public ImmutablePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public ImmutablePoint withX(int newX) {
		return this.x == newX ? this : new ImmutablePoint(newX, this.y);
	}

	public ImmutablePoint withY(int newY) {
		return this.y == newY ? this : new ImmutablePoint(this.x, newY);
	}

	@Override
	public String toString() {
		return String.format("[Point: x=%s, y=%s]", x, y);
	}

	@Override
	public boolean equals(Object p) {
		return p instanceof ImmutablePoint && ((ImmutablePoint)p).x == x && ((ImmutablePoint)p).y == y;
	}
}
