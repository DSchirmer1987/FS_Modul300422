package project_kassenbon.model;

import project_kassenbon.model.sortiment.Produkt;

/**
 * Die Klasse für die einzelnen Einträge auf dem Kassenbon
 * @author CC_Dozent
 * @see Artikel
 *
 */
public class KassenbonEintrag extends /*Artikel*/ Produkt{
	private int menge;
	
	/**
	 * Erstellt einen KassenbonEintrag
	 * @param artikel - Der Artikel als {@code Artikel}
	 * @param menge - Die Menge als {@code Integer}
	 * 
	 * @see #Artikel(int, String, double)
	 */
	// Alter Konstruktor, der noch mit Artikel arbeitete
//	public KassenbonEintrag(Artikel artikel, int menge) {
//		super(artikel.getNummer(), artikel.getBezeichnung(), artikel.getPreis());
//		this.menge = menge;
//	}
	
	// Konstruktor mit Artikeln, jedoch ohne Vererbung von Artikeln
	public KassenbonEintrag(Artikel artikel, int menge) {
		super(artikel.getBezeichnung(), artikel.getPreis(), artikel.getNummer());
		this.menge = menge;
	}
	
	// Neuer Konstruktor, der mit Produkt aus Sortiment arbeitet
	public KassenbonEintrag(Produkt produkt, int menge) {
		super(produkt.getBezeichnung(), produkt.getPreis(), produkt.getId());
		this.menge = menge;
	}
	
	/**
	 * Gibt die Menge zurück
	 * @return - Integer
	 */
	public int getMenge() {
		return menge;
	}
	
	/**
	 * Setzt die Menge fest
	 * @param menge - Menge als {@code Integer}
	 */
	public void setMenge(int menge) {
		this.menge = menge;
	}
	
	@Override
	public String toString() {
		return this.getBezeichnung() + System.lineSeparator() + " x" + this.getMenge() + "\t\t" + String.format("%.2f€", this.getPreis());
	}
	
}
