package ch.fhnw.oop.clone.immutable;

public final class ImmutableLine2 {
	private final ImmutablePoint start, end;

	public ImmutableLine2(ImmutablePoint start, ImmutablePoint end) {
		this.start = start;
		this.end = end;
	}

	public ImmutablePoint getStartPoint() {
		return this.start;
	}

	public ImmutableLine2 withStartPoint(ImmutablePoint newStart) {
		return this.start.equals(newStart) ? this : new ImmutableLine2(newStart, this.end);
	}

	public ImmutablePoint getEndPoint() {
		return this.end;
	}

	public ImmutableLine2 withEndPoint(ImmutablePoint newEnd) {
		return this.end.equals(newEnd) ? this : new ImmutableLine2(this.start, newEnd);
	}

	@Override
	public String toString() {
	   return String.format("[Line: start=%s, end=%s]", this.start, this.end);
	}
}
