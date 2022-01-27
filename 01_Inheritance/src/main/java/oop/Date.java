package oop;

public class Date {
	private int day, month, year;

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
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

	public boolean equals(Date date) {
		return date != null && date.day == this.day && date.month == this.month && date.year == this.year;
	}

}
