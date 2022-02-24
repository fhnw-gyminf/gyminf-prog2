package ch.fhnw.oop.generics.task3;

public class RedundantTest {

	public static void main(String[] args) {
//		Drill drill = findBoschDrill(); // could be null;
//		Hammer hammer = new Hammer();
//		Redundant<Tool, Hammer> tool = new Redundant<>(drill, hammer);
//
//		Tool t = tool.get();
//		System.out.println(t); // could be drill or hammer
//		Hammer h = tool.getBackup();
//		
//		// Die folgende Deklaration soll zu einem Fehler fuehren, denn ein Hammer ist kein spezieller Bohrer.
//		// Redundant<Drill, Hammer> tool2;
//		
//		// Die folgende Deklration soll zu einem Fehler fuehren, denn Object ist kein Werkzeug.
//		// Redundant<Object, Object> tool3;
	}

	private static Drill findBoschDrill() {
		return Math.random() > 0.5 ? new Drill() : null;
	}
}

class Tool { }
class Drill extends Tool { }
class Hammer extends Tool { }
