package project_kassenbon.model;

/**
 * Die Klasse für die einzelnen Einträge auf dem Kassenbon
 * @author CC_Dozent
 * @see Artikel
 *
 */
public class KassenbonEintrag extends Artikel{
	private int menge;
	
	/**
	 * Erstellt einen KassenbonEintrag
	 * @param artikel - Der Artikel als {@code Artikel}
	 * @param menge - Die Menge als {@code Integer}
	 * 
	 * @see #Artikel(int, String, double)
	 */
	public KassenbonEintrag(Artikel artikel, int menge) {
		super(artikel.getNummer(), artikel.getBezeichnung(), artikel.getPreis());
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
	
}
