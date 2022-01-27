package liskov;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiguresTest {
	private Rectangle r;
	private Square s;

	@BeforeEach
	public void init() {
		r = new Rectangle(0, 0, 4, 4);
		s = new Square(0, 0, 4);
		// s = new Rectangle(0, 0, 4, 4); // in case that Rectangle extends Square
		// r = new Square(0, 0, 4);       // in case that Square extends Rectangle
	}

	@Test
	public void testRectangle1() {
		r.setWidth(6);
		assertEquals(0, r.getX());
		assertEquals(0, r.getY());
		assertEquals(6, r.getWidth());
		assertEquals(4, r.getHeight());
		assertEquals(24, r.getArea());
	}

	@Test
	public void testRectangle2() {
		r.setHeight(6);
		assertEquals(0, r.getX());
		assertEquals(0, r.getY());
		assertEquals(4, r.getWidth());
		assertEquals(6, r.getHeight());
		assertEquals(24, r.getArea());
	}

	@Test
	public void testRectangle3() {
		r.setX(1);
		r.setY(-1);
		assertEquals(1, r.getX());
		assertEquals(-1, r.getY());
		assertEquals(4, r.getWidth());
		assertEquals(4, r.getHeight());
		assertEquals(16, r.getArea());
	}

	@Test
	public void testSquare1() {
		s.setWidth(6);
		assertEquals(0, s.getX());
		assertEquals(0, s.getY());
		assertEquals(6, s.getWidth());
		assertEquals(6, s.getHeight());
		assertEquals(36, s.getArea());
	}

	@Test
	public void testSquare2() {
		s.setHeight(5);
		assertEquals(0, s.getX());
		assertEquals(0, s.getY());
		assertEquals(5, s.getWidth());
		assertEquals(5, s.getHeight());
		assertEquals(25, s.getArea());
	}

	@Test
	public void testSquare3() {
		s.setX(2);
		s.setY(-1);
		assertEquals(2, s.getX());
		assertEquals(-1, s.getY());
		assertEquals(4, s.getWidth());
		assertEquals(4, s.getHeight());
		assertEquals(16, s.getArea());
	}

	
}
