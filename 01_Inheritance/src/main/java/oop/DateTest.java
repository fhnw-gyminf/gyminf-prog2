package oop;

public class DateTest {

	public static void main(String[] args) {
		Date d = new Date();
		d.setDay(28);
		d.setMonth(1);
		d.setYear(2022);

		int wd = d.getWeekDay();

		switch(wd) {
		case 0: System.out.println("Sonntag"); break;
		case 1: System.out.println("Montag"); break;
		case 2: System.out.println("Dienstag"); break;
		case 3: System.out.println("Mittwoch"); break;
		case 4: System.out.println("Donnerstag"); break;
		case 5: System.out.println("Freitag"); break;
		case 6: System.out.println("Samstag"); break;
		}
	}

}
