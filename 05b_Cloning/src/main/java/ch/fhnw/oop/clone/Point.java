package ch.fhnw.oop.clone;

public class Point implements Cloneable {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public Point clone() {
		try {
			return (Point)super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}

	@Override
	public String toString() {
		return String.format("Point(%d, %d)", x, y);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && this.getClass() == obj.getClass()
				&& ((Point) obj).x == x 
				&& ((Point) obj).y == y;
	}	
	
}

