package project_kassenbon.model;

import java.util.ArrayList;

/**
 * Die Klasse die den Kassenbon darstellt.
 * Beinhaltet eine ArrayList für die einzelnen Einträge
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
	 * Initialisiert das Kassenbon-Objekt mit den gegebenen Daten für den Verkäufer
	 * @param name - Den Namen als {@code String}
	 * @param strasse - Die Straße als {@code String}
	 * @param plz - Die PLZ als  {@code String}
	 */
	public Kassenbon(String name, String strasse, String plz) {
		this.laden[0] = name;
		this.laden[1] = strasse;
		this.laden[2] = plz;
		this.liste = new ArrayList<>();
	}
	
	/**
	 * Gibt den Laden des Kassenbons zurück
	 * @return - String-Array
	 */
	public String[] getLaden() {
		return laden;
	}

	/**
	 * Gibt die gesamte Liste des Kassenbons zurück
	 * @return ArrayList<KassenbonEintrag>
	 */
	public ArrayList<KassenbonEintrag> getListe() {
		return liste;
	}
	
	/**
	 * Gibt die Gesamtsumme aller Artikel im Kassenbon zurück
	 * @return Double
	 */
	public double getSumme() {
		return summe;
	}

	/**
	 * Fügt einen Eintrag zur Liste hinzu
	 * @param eintrag - Der Eintrag vom Typ {@code KassenbonEintrag}
	 */
	public void addEintrag(KassenbonEintrag eintrag) {
		this.liste.add(eintrag);
		this.summe =+ eintrag.getPreis() * eintrag.getMenge();
	}
	
	/**
	 * Fügt einen Eintrag zur Liste hinzu
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
	 * Gibt den Verkäufer in einem vorformartierten String zurück
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
