package project_kassenbon.model;

import java.util.ArrayList;

/**
 * Die Liste von Artikel die das System kennt
 * @author CC_Dozent
 *
 */
public class Artikelliste {
	private ArrayList<Artikel> liste;
	
	/**
	 * Erstellt eine neue ArrayList von {@code Artikel}
	 */
	public Artikelliste() {
		this.liste = new ArrayList<>();
	}
	
	/**
	 * Gibt die Liste zurück
	 * @return ArrayList
	 */
	public ArrayList<Artikel> getListe() {
		return liste;
	}
	
	/**
	 * Fügt einen Artikel der Liste hinzu
	 * @param artikel - Der Artikel als {@code Artikel}
	 */
	public void addArtikel(Artikel artikel) {
		this.liste.add(artikel);
	}
	
	/**
	 * Fügt einen Artikel der Liste hinzu
	 * @param nummer - Artikelnummer als {@code Integer}
	 * @param bezeichnung - Artikelbezeichnung als {@code String}
	 * @param preis - Artikelpreis als {@code Double}
	 */
	public void addArtikel(int nummer, String bezeichnung, double preis) {
		this.liste.add(new Artikel(nummer, bezeichnung, preis));
	}
	
	/**
	 * Sucht einen Artikel in der Liste
	 * @param nummer - Die Artikelnummer
	 * @return - Boolean
	 */
	public boolean searchArtikel(int nummer) {
		for (Artikel artikel : liste) {
			if(artikel.getNummer() == nummer) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Sucht einen Artikel aus der Liste und gibt diesen zurück
	 * @param nummer - Die Artikelnummer
	 * @return - Artikel
	 */
	public Artikel getArtikelFromList(int nummer) {
		for (Artikel artikel : liste) {
			if(artikel.getNummer() == nummer) {
				return artikel;
			}
		}
		return null;
	}
}
