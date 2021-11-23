package project_kassenbon.model;

/**
 * Die Klasse die einen einzelnen Artikel darstellt
 * @author CC_Dozent
 *
 */
public class Artikel {
	private double preis;
	private String bezeichnung;
	private int nummer;
	
	/**
	 * Erstellt einen Artikel
	 * @param nummer - Artikelnummer als {@code Integer}
	 * @param bezeichnung - Artikelbezeichnung als {@code String}
	 * @param preis - Artikelpreis als {@code Double}
	 */
	public Artikel(int nummer, String bezeichnung, double preis) {
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}
	
	/**
	 * Gibt den Preis aus
	 * @return Double
	 */
	public double getPreis() {
		return preis;
	}

	/**
	 * Setzt den Preis
	 * @param preis - {@code Double}
	 */
	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	/**
	 * Gibt die Bezeichnung aus
	 * @return String
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	/**
	 * Setzt die Bezeichnung
	 * @param bezeichnung - {@code String}
	 */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	/**
	 * Gibt die Nummer aus
	 * @return - Integer
	 */
	public int getNummer() {
		return nummer;
	}
	
	/**
	 * Setzt die Nummer
	 * @param nummer - {@code Integer}
	 */
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	
	@Override
	public String toString() {
		return this.nummer + " - " + this.bezeichnung + " - " + String.format("%.2f€", this.preis);
	}
}
