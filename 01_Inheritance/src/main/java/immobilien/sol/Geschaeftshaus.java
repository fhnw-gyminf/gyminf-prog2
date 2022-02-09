package immobilien.sol;

public class Geschaeftshaus extends Immobilie {
    private double lagerFlaeche;
    private double bueroFlaeche;

    public Geschaeftshaus(String besitzer, int baujahr, double preis, double lagerFlaeche, double bueroFlaeche) {
        super(besitzer, baujahr, preis);
        this.lagerFlaeche = lagerFlaeche;
        this.bueroFlaeche = bueroFlaeche;
    }

    public double getLagerFlaeche() {
        return lagerFlaeche;
    }

    public void setLagerFlaeche(double lagerFlaeche) {
        this.lagerFlaeche = lagerFlaeche;
    }

    public double getBueroFlaeche() {
        return bueroFlaeche;
    }

    public void setBueroFlaeche(double bueroFlaeche) {
        this.bueroFlaeche = bueroFlaeche;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Sie ist ein Geschäftshaus mit %fm^2 Lagerfläche und %fm^2 Bürofläche.\n", 
            lagerFlaeche, bueroFlaeche);
    }
}
