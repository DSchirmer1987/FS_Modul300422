package project_kassenbon.controller;

import javax.swing.JOptionPane;

import project_kassenbon.model.Artikel;
import project_kassenbon.model.Artikelliste;
import project_kassenbon.model.Kassenbon;
import project_kassenbon.model.KassenbonEintrag;

public class ConsoleController {
	
	private Kassenbon kb;
	private Artikelliste al;
	public ConsoleController() {
		kb = new Kassenbon();
		al = new Artikelliste();
		this.generateArtikels();
		frageArtikel();
		System.out.println(kb);
	}
	
	private void generateArtikels() {
		this.al.addArtikel(new Artikel(123, "Banane", 1.99));
		this.al.addArtikel(new Artikel(456, "Kaffee", 4.99));
	}
	
	private void frageArtikel() {
		while (true) {
			while (true) {
				int input = Integer.parseInt(JOptionPane.showInputDialog("Artikelnummer eingeben"));
				if (this.al.searchArtikel(input)) {
					int menge = Integer.parseInt(JOptionPane.showInputDialog("Menge eingeben"));
//					this.kb.addEintrag(this.al.getArtikelFromList(input), menge);
					break;
				} else {
					System.out.println("Artikel nicht vorhanden");
				}
			}
			int input = JOptionPane.showConfirmDialog(null, "Weiteren Artikel hinzufügen?", "Weiter?1", JOptionPane.YES_NO_OPTION);
			if(input==1 || input==-1) {
				break;
			}
		}
	}
}
