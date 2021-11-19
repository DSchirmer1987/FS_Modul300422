package project_kassenbon.model;

import java.util.ArrayList;

/**
 * Die Klasse die den Kassenbon darstellt.
 * Beinhaltet eine ArrayList f�r die einzelnen Eintr�ge
 * 
 * @author CC_Dozent
 *
 */
public class Kassenbon {
	private String[] laden = new String[3];
	private ArrayList<KassenbonEintrag> liste;
	private double summe;
	
	/**
	 * Initialisiert den Kassenbon mit einer leeren Liste
	 */
	public Kassenbon() {
		this.laden[0] = "Fischladen";
		this.laden[1] = "Fischallee 42";
		this.laden[2] = "12345 Fischhausen";
		this.liste = new ArrayList<>();
	}
	
	/**
	 * Initialisiert das Kassenbon-Objekt mit den gegebenen Daten f�r den Verk�ufer
	 * @param name - Den Namen als {@code String}
	 * @param strasse - Die Stra�e als {@code String}
	 * @param plz - Die PLZ als  {@code String}
	 */
	public Kassenbon(String name, String strasse, String plz) {
		this.laden[0] = name;
		this.laden[1] = strasse;
		this.laden[2] = plz;
		this.liste = new ArrayList<>();
	}
	
	/**
	 * Gibt den Laden des Kassenbons zur�ck
	 * @return - String-Array
	 */
	public String[] getLaden() {
		return laden;
	}

	/**
	 * Gibt die gesamte Liste des Kassenbons zur�ck
	 * @return ArrayList<KassenbonEintrag>
	 */
	public ArrayList<KassenbonEintrag> getListe() {
		return liste;
	}
	
	/**
	 * Gibt die Gesamtsumme aller Artikel im Kassenbon zur�ck
	 * @return Double
	 */
	public double getSumme() {
		return summe;
	}

	/**
	 * F�gt einen Eintrag zur Liste hinzu
	 * @param eintrag - Der Eintrag vom Typ {@code KassenbonEintrag}
	 */
	public void addEintrag(KassenbonEintrag eintrag) {
		this.liste.add(eintrag);
		this.summe =+ eintrag.getPreis() * eintrag.getMenge();
	}
	
	/**
	 * F�gt einen Eintrag zur Liste hinzu
	 * @param artikel - Der {@code Artikel}
	 * @param menge - Die Menge als {@code Integer}
	 */
	public void addEintrag(Artikel artikel, int menge) {
		this.liste.add(new KassenbonEintrag(artikel, menge));
		this.summe =+ artikel.getPreis() * menge;
	}
	
	/**
	 * Entfernt einen Eintrag von der Liste
	 * @param index - Die Position des Eintrages als {@code Integer}
	 */
	public void removeEintrag(int index) {
		this.summe =- this.liste.get(index).getPreis() * this.liste.get(index).getMenge();
		this.liste.remove(index);
	}
	
	/**
	 * Gibt den Verk�ufer in einem vorformartierten String zur�ck
	 * @return - String
	 */
	public String getFormattedLaden() {
		String output = "";
		for(int i=0; i <= 25; i++ ) {
			output += "=";
		}
		output +=  System.lineSeparator();
		output += "||" + this.laden[0] + "\t\t||" + System.lineSeparator();
		output += "||" + this.laden[1] + "\t\t||" + System.lineSeparator();
		output += "||" + this.laden[2] + "\t||" + System.lineSeparator();
		for(int i=0; i <= 25; i++ ) {
			output += "=";
		}
		return output;
	}
}
