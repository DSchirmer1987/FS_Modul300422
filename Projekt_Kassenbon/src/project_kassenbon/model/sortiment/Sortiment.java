package project_kassenbon.model.sortiment;

import java.util.ArrayList;
import java.util.Arrays;

public class Sortiment {
	private ISortimentSpeicher speicher;
	private ArrayList<Produkt> sortiment;
	
	public Sortiment(ISortimentSpeicher speicher) {
		super();
		this.speicher = speicher;
		this.sortiment = new ArrayList<Produkt>(Arrays.asList(speicher.getSortiment()));
	}

	public ISortimentSpeicher getSpeicher() {
		return speicher;
	}

	public ArrayList<Produkt> getSortiment() {
		return this.sortiment;
	}
	
	public void neuladen() {
		this.sortiment = new ArrayList<Produkt>(Arrays.asList(speicher.getSortiment()));
	}
	
	public void hinzufuegen(Produkt produkt) {
		this.speicher.produktHinzufuegen(produkt);
		this.neuladen();
	}
	
	public void entfernen(Produkt produkt) {
		this.speicher.produktEntfernen(produkt);
		this.neuladen();
	}
	
	public Produkt getProduktByID(int id) {
		for (Produkt produkt : sortiment) {
			if(id == produkt.getId()) {
				return produkt;
			}
		}
		return null;
	}
	
	public int getLastId() {
		return this.speicher.getLastId();
	}
}
