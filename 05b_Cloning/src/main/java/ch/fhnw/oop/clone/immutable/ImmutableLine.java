package ch.fhnw.oop.clone.immutable;

import java.awt.Point;

public final class ImmutableLine {
	private final Point start, end;

	public ImmutableLine(Point start, Point end) {
		this.start = (Point) start.clone();
		this.end = (Point) end.clone();
	}

	public Point getStartPoint() {
		return (Point) this.start.clone();
	}

	public Point getEndPoint() {
		return (Point) this.end.clone();
	}

	public ImmutableLine withStartPoint(Point newStart) {
		return this.start.equals(newStart) ? this : new ImmutableLine(newStart, this.end);
	}

	public ImmutableLine withEndPoint(Point newEnd) {
		return this.end.equals(newEnd) ? this : new ImmutableLine(this.start, newEnd);
	}

	@Override
	public String toString() {
		return String.format("[Line: start=%s, end=%s]", this.start, this.end);
	}
	
//	@Override
//	public Object clone() {	// violates the condition that x.clone() != x 
//			return this;	// which is specified in the specification of
//	}						// Object clone (as a SHOULD requirement).
//	// As an alternative method clone() could also actually create a copy, 
//	// or the method could be omitted altogether (as in class java.lang.String).
}
