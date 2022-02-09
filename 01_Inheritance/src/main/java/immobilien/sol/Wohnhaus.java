package immobilien;

public class Wohnhaus extends Immobilie {
    private int wohnungen;

    public Wohnhaus(String besitzer, int baujahr, double preis, int wohnungen) {
        super(besitzer, baujahr, preis);
        this.wohnungen = wohnungen;
    }

    public int getWohnungen() {
        return wohnungen;
    }

    public void setWohnungen(int wohnungen) {
        this.wohnungen = wohnungen;
    }

    @Override
	public void print() {
		super.print();
		System.out.printf("Sie ist ein Wohnhaus und enthält %d Wohnung%s.\n", wohnungen, wohnungen != 1 ? "en" : "");
	}
}
