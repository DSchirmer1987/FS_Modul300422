package main;
import java.util.Random;

import buch.Buch;
import mitarbeiter.Hilfsarbeiter;
import schneckenrennen.Wettbuero;

public class Main {

	public static void main(String[] args) {
//		Buch b1 = new Buch("ES", "Stephen King", "Heyne", (short) 1214);
//		Buch b2 = new Buch("Krabat", "Otfried Preuﬂler", "Thienemann", (short) 256);
//		
//		System.out.println(b1);
//		System.out.println(b2);
		
//		Hilfsarbeiter ha1 = new Hilfsarbeiter(123, "Harald", "26.12.1688", 2500);
//		ha1.monatslohnHilfsarbeiter(12.50, 160, 1.50, 25);
//		System.out.println(ha1);
		
//		Wettbuero wb = new Wettbuero();
//		for(int i = 1; i < 6; i++) {
//			wb.wetteAnnehmen("TurboSchnecki_" + i, i * 3, "Spieler_" + i);
//		}
//		wb.rennenDurchfuehren();
//		System.out.println(wb);
		
		double min = 0.0;
		double max = 1.2;
		Random random = new Random();
		double randomValue = min + (max - min) * random.nextDouble();
		System.out.println(randomValue);
	}

}
