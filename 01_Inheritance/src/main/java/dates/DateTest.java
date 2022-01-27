package dates;

public class DateTest {

	public static void main(String[] args) {
		Date d1 = new Date(23, 4, 2021);
		Date d2 = new Date(23, 4, 2021);

		System.out.println(d1.toString());
		System.out.println(d2);

		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
	}

}
