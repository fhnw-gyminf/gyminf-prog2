package immobilien.sol;

public class Immobilie {
    private String besitzer;
    private int baujahr;
    private double preis;

    public Immobilie(String besitzer, int baujahr, double preis) {
        this.besitzer = besitzer;
        this.baujahr = baujahr;
        this.preis = preis;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void print() {
        System.out.printf("Die Immobilie von %s aus dem Jahr %d ist %.2f Franken wert.\n", besitzer, baujahr, preis);
    }
}
