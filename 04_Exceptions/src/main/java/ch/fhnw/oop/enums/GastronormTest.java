package ch.fhnw.oop.enums;

import ch.fhnw.oop.enums.Gastronorm.Material;
import static ch.fhnw.oop.enums.Gastronorm.Material.*;

public class GastronormTest {
	public static void main(String[] args) {
		Material m = STEEL;

        Gastronorm gn = new Gastronorm(m, Gastronorm.Size.GN1_1);
        System.out.println(gn.getLiterVolume());
	}
}
