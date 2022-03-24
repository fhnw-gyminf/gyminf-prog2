package ch.fhnw.oop.clone.immutable.samples;

import java.util.Date;
import java.util.HashSet;

public class KeyTest {

	public static void main(String[] args) {
		HashSet<Date> set = new HashSet<Date>();
		final Date date = new Date();
		System.out.println("set.add:  " + date + " [" + System.identityHashCode(date) + "]");
		set.add(date);

		date.setTime(date.getTime() + 24 * 60 * 60 * 1000);
		System.out.println("new date: " + date + " [" + System.identityHashCode(date) + "]");

		System.out.println("Content: ");
		System.out.println(set);

		System.out.println("set.size():");
		System.out.println(set.size());

		System.out.println("set.contains(date):");
		System.out.println(set.contains(date));
	}

}
