
/*
 * Genereller Klassenaufbau
 * Attribute
 * Konstruktoren
 * Getter/Setter
 * To-String
 * Eigenen Methoden
 */

public class Stuhl {
	// Datenfelder (Attribute)
	private int anzahlBeine;
	private String material;
	private boolean gepolstert;
	
	// Konstruktoren
	public Stuhl() {
		this.anzahlBeine = 4;
		this.material = "Fichte";
		this.gepolstert = false;
	}
	
	public Stuhl(int anzahlBeine, String material, boolean gepolstert) {
		this.anzahlBeine = anzahlBeine;
		this.material = material;
		this.gepolstert = gepolstert;
	}
	
	public Stuhl(int anzahlBeine) {
		this(anzahlBeine, "Eisen", false);
	}
	
	// Methoden
	public int getAnzahlBeine() {
		return this.anzahlBeine;
	}
	
	/**
	 * Setz die Anzahl der Beine des Stuhl-Objektes. Bei einer Angabe von kleiner als 3, wird
	 * die Anzahl auf 3 gesetzt.
	 * @param anzahl  Die Anzahl der Beine als Integer
	 */
	public void setAnzahlBeine(int anzahl) {
		if(anzahl < 3) {
			this.anzahlBeine = 3;
		} else {
			this.anzahlBeine = anzahl;
		}
	}
	
	/**
	 * Gibt das Material zurück.
	 * @return material als String
	 */
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isGepolstert() {
		return gepolstert;
	}

	public void setGepolstert(boolean gepolstert) {
		this.gepolstert = gepolstert;
	}

//	@Override
//	public String toString() {
//		return "Stuhl [anzahlBeine=" + anzahlBeine + ", material=" + material + ", gepolstert=" + gepolstert + "]";
//	}
	
	public String toString() {
		String polsterung = "nicht gepolstert";
		if(this.gepolstert) {
			polsterung = "gepolstert";
		} else {
			polsterung = "nicht gepolstert";
		}
		
		// Ternary Operator
		// Variable = Bedingung ? True : False
		// Wenn Bedingung true ist, dann wird der True-Teil genommen
		// Wenn Bedingung false ist, dann wird der False-Teil genommen
		polsterung = this.gepolstert ? "gepolstert" : "nicht gepolstert";
		
		return "Der Stuhl hat " + this.anzahlBeine + 
				" Beine und ist " + polsterung +
				" und besteht aus " + this.material;
	}
	
	
	
}
