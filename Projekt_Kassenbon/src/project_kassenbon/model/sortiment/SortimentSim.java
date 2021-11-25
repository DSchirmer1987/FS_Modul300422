package project_kassenbon.model.sortiment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortimentSim implements ISortimentSpeicher{
	private Produkt[] sortiment;
	
	public SortimentSim() {
		List<Produkt> tmp = new ArrayList<>();
		tmp.add(new Produkt("Bananen", 1.99, 100));
		tmp.add(new Produkt("Äpfel", 2.99, 101));
		tmp.add(new Produkt("Birnen", 1.99, 102));
		tmp.add(new Produkt("Ingwer", 1.99, 103));
		tmp.add(new Produkt("Erdbeeren", 1.99, 104));
		tmp.add(new Produkt("Pizza Salami", 1.99, 105));
		tmp.add(new Produkt("Hamburger", 1.99, 106));
		tmp.add(new Produkt("Fischstäbchen", 2.99, 95));
		this.sortiment = tmp.toArray(new Produkt[0]);
		
	}
	@Override
	public Produkt[] getSortiment() {
		return this.sortiment;
	}

	@Override
	public void sortimentSpeichern(Produkt[] sortiment) {
		this.sortiment = sortiment;
	}
	
	/**
	 * Fügt ein Produkt dem Sortiment hinzu.
	 * 
	 * Intern wird das Array zu einer Liste umgewandelt, damit ein einfaches hinzufügen möglich ist.
	 * Dank der Liste muss nicht das gesamte Array iteriert werden, sondern einfach die add()-Methode angesprochen werden
	 * Danach wird die Liste wieder zu einem Array umgewandelt und zurückgegeben.
	 */
	@Override
	public void produktHinzufuegen(Produkt produkt) {
		// Umwandeln in eine Liste - Problematik List ist ein Interface. List braucht einen vollwertigen Typen.
//		List<Produkt> tmp = Arrays.asList(this.sortiment);
		// Lösung zu dem Problem mit der List. - List bekommt eine Zuweisung als ArrayList
		List<Produkt> tmp = new ArrayList<Produkt>(Arrays.asList(this.sortiment));
		// Hinzufügen zur Liste
		tmp.add(produkt);
		// Umwandeln von Liste in Array
		this.sortiment = tmp.toArray(new Produkt[0]);
	}

	@Override
	public void produktAktualisieren(Produkt produkt) {
		
	}

	/**
	 * Fügt ein Produkt dem Sortiment hinzu.
	 * 
	 * Intern wird das Array zu einer Liste umgewandelt, damit ein einfaches entfernen möglich ist.
	 * Dank der Liste muss nicht das gesamte Array iteriert werden, sondern einfach die remove()-Methode angesprochen werden
	 * Danach wird die Liste wieder zu einem Array umgewandelt und zurückgegeben.
	 */
	@Override
	public void produktEntfernen(Produkt produkt) {
		// Umwandeln in eine Liste - Problematik List ist ein Interface. List braucht einen vollwertigen Typen.
//		List<Produkt> tmp = Arrays.asList(this.sortiment);
		// Lösung zu dem Problem mit der List. - List bekommt eine Zuweisung als ArrayList
		List<Produkt> tmp = new ArrayList<Produkt>(Arrays.asList(this.sortiment));
		tmp.remove(produkt);
		this.sortiment = tmp.toArray(new Produkt[0]);
	}
	
	@Override
	public int getLastId() {
		int lastId = 0;
		for (Produkt produkt : sortiment) {
			if(lastId < produkt.getId()) {
				lastId = produkt.getId();
			}
		}
		return lastId + 1;
	}
}
