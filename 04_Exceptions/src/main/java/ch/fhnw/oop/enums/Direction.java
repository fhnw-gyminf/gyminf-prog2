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
	}
}
