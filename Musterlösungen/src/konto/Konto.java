package konto;

public class Konto {
	private Person person;
	private double kontostand;

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public Konto(String name, String vorname, float kontostand) {
		this.person = new Person(name, vorname);
		this.kontostand = kontostand;
	}

	public Person getPerson() {
		return person;
	}
	
	public String getName() {
		return this.getPerson().getName();
	}
}