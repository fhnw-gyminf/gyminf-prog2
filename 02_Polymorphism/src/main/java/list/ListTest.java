package list;

public class ListTest {

	public static void main(String[] args) {
		List list = new List();
		list.add("Hello");
		list.add("World");
		list.add("!");
		list.print();
		System.out.println();

		list = new List();
		list.add("3");
		list.add("2");
		list.add("1");
		list.add("4");
		list.print();
	}

}
