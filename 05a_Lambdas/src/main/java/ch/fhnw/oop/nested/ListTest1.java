package ch.fhnw.oop.nested;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> list = new List<>();
		list.add(1);
		list.add(2);
		list.add(3);
		List<Integer>.Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Cannot allocate the member type List<Integer>.Iterator using a parameterized
		// compound name; use its simple name and an enclosing instance of type
		// List<Integer>
		// it = new List<Integer>.Iterator();
	}

}
