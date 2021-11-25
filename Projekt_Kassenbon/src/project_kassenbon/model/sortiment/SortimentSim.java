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
		
		// Object[0] = Object
//		this.sortiment = new Produkt[1];
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

	@Override
	public void produktHinzufuegen(Produkt produkt) {
		List<Produkt> tmp = Arrays.asList(this.sortiment);
		tmp.add(produkt);
		this.sortiment = (Produkt[]) tmp.toArray();
	}

	@Override
	public void produktAktualisieren(Produkt produkt) {
		
	}

	@Override
	public void produktEntfernen(Produkt produkt) {
		List<Produkt> tmp = Arrays.asList(this.sortiment);
		tmp.remove(produkt);
		this.sortiment = (Produkt[]) tmp.toArray();
	}

}
