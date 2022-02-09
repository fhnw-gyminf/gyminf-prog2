package ch.fhnw.util.dates;

public final class Date {
	private final int day, month, year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public int getWeekDay() {
		int m = month, y = year;

		if (m < 3) {
			y--;
		}
		m = (m + 9) % 12;
		int w = y * 1461 / 4 + (m * 153 + 2) / 5 + day - (y / 100 * 3 - 5) / 4;
		return w % 7;
	}

	@Override
	public String toString() {
		return day + "." + month + "." + year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Date d = (Date) obj;
		return day == d.day && month == d.month && year == d.year;
	}
	
}
