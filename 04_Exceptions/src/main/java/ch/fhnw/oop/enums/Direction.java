package ch.fhnw.oop.enums;

public enum Direction {
	NORTH(90), EAST(0), SOUTH(270), WEST(180);

	private int angle;

	private Direction(int angle) {
		this.angle = angle;
	}

	public int getAngle() {
		return angle;
	}

	public static void main(String[] args) {
		for (Direction dir : Direction.values()) {
			System.out.println(dir + "/" + dir.ordinal() + "/" + dir.getAngle());
		}

		// Initialisierung einer Variablen mit einem bestimmten Wert
		Direction d = Direction.EAST;

		// Switch-Anweisung über die Werte eines Enums:
		// Interessant: Wenn ein Label fehlt gibt der Compiler eine Warnung aus
		//              (ausser natürlich es hätte ein Defulat-Label im switch)
		switch(d) {
			case NORTH: System.out.println("Norden"); break;
			case EAST: System.out.println("Osten"); break;
			case SOUTH: System.out.println("Süden"); break;
			case WEST: System.out.println("Westen"); break;
		}
	}
}
