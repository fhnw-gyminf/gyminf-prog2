package ch.fhnw.app;

public class Weekday {
	
	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("Usage: Weekday <day> <month> <year>");
		} else {
			int day = Integer.parseInt(args[0]);
			int month = Integer.parseInt(args[1]);
			int year = Integer.parseInt(args[2]);
			
			// TODO: Create instance of class Date and print the weekday
		}
	}

}
