package wettrennen;


public class Wettrennen {

	public static void main(String[] args) {
		Fahrrad fahrrad = new Fahrrad();
		fahrrad.setGeschwindigkeit(20);
		Auto auto = new Auto();
		auto.setGeschwindigkeit(150);
		Rennwagen rennwagen = new Rennwagen();
		rennwagen.setGeschwindigkeit(200);
		Krankenwagen krankenwagen = new Krankenwagen();
		krankenwagen.setGeschwindigkeit(80);
		
		// Bewegen
		fahrrad.bewegen(240);
		fahrrad.bewegen(60);
		auto.bewegen(60);
		rennwagen.bewegen(60);
		krankenwagen.bewegen(60);
		
		// Ausgabe
		System.out.println(fahrrad);
		System.out.println(auto);
		System.out.println(rennwagen);
		System.out.println(krankenwagen);
	}

}
