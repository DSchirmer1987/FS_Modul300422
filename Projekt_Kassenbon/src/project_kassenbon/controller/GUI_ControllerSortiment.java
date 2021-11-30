package project_kassenbon.controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import project_kassenbon.model.Artikel;
import project_kassenbon.model.Artikelliste;
import project_kassenbon.model.IBon;
import project_kassenbon.model.Kassenbon;
import project_kassenbon.model.KassenbonEintrag;
import project_kassenbon.model.sortiment.Produkt;
import project_kassenbon.model.sortiment.Sortiment;
import project_kassenbon.model.sortiment.SortimentDBSpeicher;
import project_kassenbon.model.sortiment.SortimentDateiSpeicher;
import project_kassenbon.model.sortiment.SortimentSim;
import project_kassenbon.view.ArtikelFrame;
import project_kassenbon.view.KassenFrame;
import project_kassenbon.view.KassenbonFrame;
import project_kassenbon.view.NewArtikelFrame;

public class GUI_ControllerSortiment {
	
	private final Action artikelFrameAction = new ArtikelFrameAction();
	private final Action addArtikelKassenbon = new AddArtikelKassenbon();
	private final Action showKassenbonFrame = new ShowKassenbonFrame();
	private final Action showNewArtikelFrame = new ShowNewArtikelFrame();
	private final Action addArtikelArtikelListe = new AddArtikelArtikelListe();
//	private Kassenbon kb;
	private IBon<KassenbonEintrag, String, String[]> kb;
//	private Artikelliste al;
	private Sortiment sortiment;
	private KassenFrame kf;
	private ArtikelFrame af;
	private KassenbonFrame kbf;
	private NewArtikelFrame naf;
	
	public GUI_ControllerSortiment() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					init();
					kf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void init() {
		kb = new Kassenbon();
//		al = new Artikelliste();
//		sortiment = new Sortiment(new SortimentSim());
//		sortiment = new Sortiment(new SortimentDateiSpeicher("src/sortiment.csv"));
		sortiment = new Sortiment(new SortimentDBSpeicher());
//		generateArtikels();
		
		kf = new KassenFrame();
		kf.getTxtPane_laden().setText(kb.ladenToString());
		kf.getBtn_art().setAction(artikelFrameAction);
		kf.getBtn_kassenbon().setAction(showKassenbonFrame);
		setKassenText();
		
		af = new ArtikelFrame();
		af.getBtn_addArtikel().setAction(addArtikelKassenbon);
//		DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>(al.getListe().toArray());
//		af.getcBox_artikel().setModel(model);
		setComboBoxModel();
		af.getBtn_newArt().setAction(showNewArtikelFrame);
		
		kbf = new KassenbonFrame();
		
//		naf = new NewArtikelFrame();
	}
	
	//Umstellung auf Sortiment - Artikel werden aus dem Modell bereitgestellt.
//	private void generateArtikels() {
//		this.al.addArtikel(new Artikel(123, "Banane", 1.99));
//		this.al.addArtikel(new Artikel(456, "Kaffee", 4.99));
//	}
	
	private void setKassenText() {
		kf.getTxtPane_kassenbon().setText("Anzahl Artikel: " + kb.getEintraege().size() + System.lineSeparator()+ System.lineSeparator() + "Gesamtsumme €: " + ((Kassenbon) kb).getFormattedSumme());
	}
	
	private void setComboBoxModel() {
		DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>(sortiment.getSortiment().toArray());
		af.getcBox_artikel().setModel(model);
	}
	
	private class ArtikelFrameAction extends AbstractAction{
		public ArtikelFrameAction() {
			putValue(NAME, "Artikel hinzufügen");
			putValue(SHORT_DESCRIPTION, "Einen Artikel hinzufügen");
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			af.getTxtField_menge().setText("0");
			af.setVisible(true);
		}
	}
	
	private class AddArtikelKassenbon extends AbstractAction{
		public AddArtikelKassenbon() {
			putValue(NAME, "Artikel hinzufügen");
			putValue(SHORT_DESCRIPTION, "Den Artikel hinzufügen");
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int index = af.getcBox_artikel().getSelectedIndex();
			int menge = Integer.parseInt(af.getTxtField_menge().getText());
			if(menge > 0 ) {
				kb.addEintrag(new KassenbonEintrag(sortiment.getSortiment().get(index), menge));
				af.dispose();
			} else {
				JOptionPane.showMessageDialog(af, "Bitte eine Menge über 0 eingeben!");
			}
			setKassenText();
		}
	}
	
	private class ShowKassenbonFrame extends AbstractAction{
		public ShowKassenbonFrame() {
			putValue(NAME, "Kassenbon anzeigen");
			putValue(SHORT_DESCRIPTION, "Den Kassenbon anzeigen");
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			kbf.getTextPane().setText(kb.toString());
			kbf.setVisible(true);
		}
	}
	
	private class ShowNewArtikelFrame extends AbstractAction{
		public ShowNewArtikelFrame() {
			putValue(NAME, "+");
			putValue(SHORT_DESCRIPTION, "Neuen Artikel hinzufügen");
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			naf = new NewArtikelFrame();
			naf.getBtn_addArt().setAction(addArtikelArtikelListe);
			naf.setVisible(true);	
		}
	}
	
	private class AddArtikelArtikelListe extends AbstractAction{
		public AddArtikelArtikelListe() {
			putValue(NAME, "Artikel zur Artikelliste");
			putValue(SHORT_DESCRIPTION, "Den Artikel zu der Artikelliste hinzufügen");
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			int artNummer = Integer.parseInt(naf.getTxt_artNum().getText());
			String artBez = naf.getTxt_artBez().getText();
			double preis = Double.parseDouble(naf.getTxt_artPreis().getText());
			// Altes System mit Artikeln:
//			al.addArtikel(artNummer, artBez, preis);
			// Neues System mit Produkt aus Sortiment
			sortiment.hinzufuegen(new Produkt(artBez, preis, artNummer));
			naf.dispose();
//			DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>(al.getListe().toArray());
//			af.getcBox_artikel().setModel(model);
			setComboBoxModel();
		}
	}
}
