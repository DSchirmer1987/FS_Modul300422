package konto;

public class KontoTest {

	public static void kontoVergleich(Konto k1, Konto k2) {
		if (k1.getKontostand() > k2.getKontostand()) {
			System.out.println(k1.getName() + " hat mehr Geld auf dem Konto als " + k2.getPerson().getName());
		} else {
			System.out.println(k2.getPerson().getName() + " hat mehr Geld auf dem Konto als " + k1.getPerson().getName());
		}
	}

	public static void main(String[] args) {
		Konto konto1 = new Konto("Müller", "Hans", 500);
		Konto konto2 = new Konto("Krause", "Peter", 1500);
		Konto konto3 = new Konto("Böhm", "Harald", 330);
		kontoVergleich(konto1, konto2);
		kontoVergleich(konto2, konto3);
		kontoVergleich(konto1, konto3);
	}

}
