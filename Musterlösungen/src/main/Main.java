package main;
import buch.Buch;

public class Main {

	public static void main(String[] args) {
		Buch b1 = new Buch("ES", "Stephen King", "Heyne", (short) 1214);
		Buch b2 = new Buch("Krabat", "Otfried Preuﬂler", "Thienemann", (short) 256);
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
