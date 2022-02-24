package ch.fhnw.oop.generics.variance;

@SuppressWarnings("unused")
public class VarianceTest {

	static class Cage<A extends Animal> {
		private A animal;
		public A getAnimal() { return animal; }
		public void storeAnimal(A a) { animal = a; }
		public A replaceAnimal(A a) { A ret = animal; animal = a; return ret; }
	}

	public void readAnimal(Cage<? extends Animal> cage) {
		Animal a = cage.getAnimal();
		// cage.storeAnimal(new Animal());
		// a = cage.replaceAnimal(new Animal());
	}

	public void setAnimal(Cage<? super Bird> cage) {
		// Bird b = cage.getAnimal();
		cage.storeAnimal(new Bird());
		// Bird b = cage.replaceAnimal(new Bird());
	}


	public static void main(String[] args) {
		Cage<? extends Animal> cage1 = new Cage<Bird>();
		Animal a = cage1.getAnimal();
		//cage1.storeAnimal(new Animal());

		Cage<? super Bird> cage2 = new Cage<Animal>();
//		Bird b = cage2.getAnimal();
		Animal x = cage2.getAnimal();
		cage2.storeAnimal(new Bird());
	}
}
