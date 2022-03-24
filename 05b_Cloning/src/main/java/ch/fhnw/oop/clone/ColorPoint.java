package ch.fhnw.oop.clone;

import java.awt.Color;

public class ColorPoint extends Point {
	private Color color;

	public ColorPoint(int x, int y, Color c) {
		super(x, y);
		this.color = c;
	}

	@Override
	public ColorPoint clone() {
		return (ColorPoint) super.clone();
	}

	@Override
	public String toString() {
		return String.format("ColorPoint(%s, %s)", super.toString(), color);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj)
				&& this.getClass() == obj.getClass()
				&& ((ColorPoint) obj).color == color; 
	}
	
}
