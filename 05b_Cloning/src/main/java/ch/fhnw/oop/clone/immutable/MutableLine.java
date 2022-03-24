package ch.fhnw.oop.clone.immutable;

import java.awt.Point;

public class MutableLine implements Cloneable {
	public Point start, end;

	public MutableLine(Point start, Point end) {
		this.start = start;
		this.end = end;
	}

	public Point getStartPoint() {
		return start;
	}

	public void setStartPoint(Point start) {
		this.start = start;
	}

	public Point getEndPoint() {
		return end;
	}

	public void setEndPoint(Point end) {
		this.end = end;
	}

	@Override
	public MutableLine clone() {
		try {
			MutableLine p = (MutableLine) super.clone();
			p.start = (Point) start.clone();
			p.end = (Point) end.clone();
			return p;
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}

	@Override
	public String toString() {
		return String.format("Line[start=%s, end=%s]", start, end);
	}
}
