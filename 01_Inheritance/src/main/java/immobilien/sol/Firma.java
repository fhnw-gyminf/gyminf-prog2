package immobilien;

public class Firma {
    public static void main(String[] args) {
        Immobilie i1 = new Immobilie("Hans", 1970, 605000);
        i1.print();
        System.out.println();

        Wohnhaus w1 = new Wohnhaus("Pascal", 1967, 500000, 1);
        Wohnhaus w2 = new Wohnhaus("Fredi", 1890, 180000, 4);
        Wohnhaus w3 = new Wohnhaus("Michaela", 2005, 456000, 2);
        Wohnhaus w4 = new Wohnhaus("Paula", 1980, 3010000, 10);
        Wohnhaus w5 = new Wohnhaus("Christian", 1997, 130000, 3);

        Geschaeftshaus g1 = new Geschaeftshaus("Pack AG", 2009, 1690000, 100, 406);
        Geschaeftshaus g2 = new Geschaeftshaus("Sarasin", 1978, 1050000, 0, 890);
        Geschaeftshaus g3 = new Geschaeftshaus("Päuli", 1920, 46000, 60, 60);
        Geschaeftshaus g4 = new Geschaeftshaus("Ottos", 1969, 2007000, 2000, 25);
        Geschaeftshaus g5 = new Geschaeftshaus("Oliver", 1993, 930000, 370, 95);



        Immobilie[] immobilien = new Immobilie[] {w1, w2, w3, w4, w5, g1, g2, g3, g4, g5};
        for (int i = 0; i < immobilien.length; i++) {
            immobilien[i].print();
        }

    }
}
