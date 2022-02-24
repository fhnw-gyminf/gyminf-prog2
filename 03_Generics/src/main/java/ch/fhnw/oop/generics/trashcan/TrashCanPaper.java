package ch.fhnw.oop.generics.trashcan;

public class TrashCanPaper extends TrashCan {
	@Override
	public void trash(Object object) { 
		if(object instanceof Paper) super.trash(object);
	}

	@Override
	public Paper getLast() { return (Paper) super.getLast(); }

	static class Paper { }
	static class Plastic { }
	static class Glass { }

	public static void main(String[] args) {
		TrashCanPaper paperTrashCan = new TrashCanPaper();
		paperTrashCan.trash(new Paper());
		Paper p = paperTrashCan.getLast();
		System.out.println(p);
	}

}
