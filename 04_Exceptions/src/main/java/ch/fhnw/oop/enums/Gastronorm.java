package ch.fhnw.oop.enums;

public class Gastronorm {
	private Size size;
	private Material material;

	public Gastronorm(Material material, Size size) {
		this.material = material;
		this.size = size;
	}

	public Material getMaterial() { return material; }
	public int getWidth() { return size.getWidth(); }
	public int getLength() { return size.getLength(); }
	public double getLiterVolume() { return size.getWidth()*size.getLength()/10_000.0;}

	// Enum Material
	enum Material {
		STEEL, PLASTIC
	}

	// Enum Size, all measurements in millimeters
	enum Size {
		GN1_4(162, 265),
		GN1_2(325, 265),
		GN1_1(325, 530);

		private final int width;
		private final int length;

		private Size(int width, int length) {
			this.width = width;
			this.length = length;
		}

		public int getWidth() { return width; }
		public int getLength() { return length; }
	}
}
