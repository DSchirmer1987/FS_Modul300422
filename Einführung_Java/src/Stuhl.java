
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
}
