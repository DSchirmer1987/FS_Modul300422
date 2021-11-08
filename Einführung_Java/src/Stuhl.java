
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
	public void setAnzahlBeine(int anzahl) {
		if(anzahl < 3) {
			this.anzahlBeine = 3;
		} else {
			this.anzahlBeine = anzahl;
		}
	}

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
	
	public String toString() {
		return "Der Stuhl hat " + this.anzahlBeine + 
				" Beine und eine Polsterung ist " + this.gepolstert + 
				" und besteht aus " + this.material;
	}
}
