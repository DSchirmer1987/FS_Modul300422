package main;
import buch.Buch;
import mitarbeiter.Hilfsarbeiter;

public class Main {

	public static void main(String[] args) {
//		Buch b1 = new Buch("ES", "Stephen King", "Heyne", (short) 1214);
//		Buch b2 = new Buch("Krabat", "Otfried Preuﬂler", "Thienemann", (short) 256);
//		
//		System.out.println(b1);
//		System.out.println(b2);
		
		Hilfsarbeiter ha1 = new Hilfsarbeiter(123, "Harald", "26.12.1688", 2500);
		ha1.monatslohnHilfsarbeiter(12.50, 160, 1.50, 25);
		System.out.println(ha1);
	}

}
