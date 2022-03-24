package ch.fhnw.oop.clone.company;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CloningTest {
	private Company c1;
	private Employee p1;

	@BeforeEach
	public void setUp() throws Exception {
		p1 = new Employee("P1", 1990);
		Employee p2 = new Employee("P2", 1989);
		Employee p3 = new Employee("P3", 1993);
		c1 = new Company("C1");
		c1.addEmployee(p1);
		c1.addEmployee(p2);
		c1.addEmployee(p3);
	}

	@Test
	public void testCompanyClone() {
		Company c2 = c1.clone();
		assertTrue(c1 != c2);
		assertEquals(c1.getClass(), c2.getClass());
		assertEquals(c1.getName(), c2.getName());
	}

	@Test
	public void testEmployeeClone() {
		Employee p2 = p1.clone();
		assertTrue(p1 != p2);
		assertEquals(p1.getClass(), p2.getClass());
		assertEquals(p1.getName(), p2.getName());
		assertEquals(p1.getYearOfBirth(), p2.getYearOfBirth());
	}

	@Test
	public void testShallow() {
		Company c2 = c1.clone();
		assertEquals(c1, c2);
	}

	@Test
	public void testDeep1() {
		Company c2 = c1.clone();
		assertEquals(c1, c2);
		c1.addEmployee(new Employee("new", 1993));
		assertFalse(c1.equals(c2));
	}

	@Test
	public void testDeep2() {
		Company c2 = c1.clone();
		assertEquals(c1, c2, "this is not even a shallow copy");
		c1.addEmployee(new Employee("new", 1993));
		assertFalse(c1.equals(c2), "this is only a shallow copy");
		c2 = c1.clone();
		p1.setName("Changed");
		assertFalse(c1.equals(c2), "you didn't copy deep enough");
	}

	@Test
	public void testDeepWithPartTimeEmployee() {
		PartTimeEmployee ppe = new PartTimeEmployee("new", 1993, 42);
		c1.addEmployee(ppe);
		Company c2 = c1.clone();
		assertEquals(c1, c2, "this is not even a shallow copy");
		ppe.setWorkload(10);
		assertFalse(c1.equals(c2), "you didn't copy deep enough");
	}
}
