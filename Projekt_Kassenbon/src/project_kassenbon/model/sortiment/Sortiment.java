package project_kassenbon.model.sortiment;

import java.util.ArrayList;
import java.util.Arrays;

public class Sortiment {
	private ISortimentSpeicher speicher;
	private ArrayList<Produkt> sortiment;
	
	public Sortiment(ISortimentSpeicher speicher) {
		super();
		this.speicher = speicher;
//		this.sortiment = (ArrayList<Produkt>) Arrays.asList(speicher.getSortiment());
		this.sortiment = new ArrayList<Produkt>(Arrays.asList(speicher.getSortiment()));
	}
	
	
}
