package project_kassenbon.controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import project_kassenbon.model.Artikel;
import project_kassenbon.model.Artikelliste;
import project_kassenbon.model.Kassenbon;
import project_kassenbon.view.ArtikelFrame;
import project_kassenbon.view.KassenFrame;
import project_kassenbon.view.KassenbonFrame;
import project_kassenbon.view.NewArtikelFrame;

public class GUI_Controller {
	
	private final Action artikelFrameAction = new ArtikelFrameAction();
	private final Action addArtikelKassenbon = new AddArtikelKassenbon();
	private final Action showKassenbonFrame = new ShowKassenbonFrame();
	private final Action showNewArtikelFrame = new ShowNewArtikelFrame();
	private final Action addArtikelArtikelListe = new AddArtikelArtikelListe();
	private Kassenbon kb;
	private Artikelliste al;
	private KassenFrame kf;
	private ArtikelFrame af;
	private KassenbonFrame kbf;
	private NewArtikelFrame naf;
	
	public GUI_Controller() {
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
		al = new Artikelliste();
		generateArtikels();
		
		kf = new KassenFrame();
		kf.getTxtPane_laden().setText(kb.getFormattedLaden());
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
	
	private void generateArtikels() {
		this.al.addArtikel(new Artikel(123, "Banane", 1.99));
		this.al.addArtikel(new Artikel(456, "Kaffee", 4.99));
	}
	
	private void setKassenText() {
		kf.getTxtPane_kassenbon().setText("Anzahl Artikel: " + kb.getListe().size() + System.lineSeparator()+ System.lineSeparator() + "Gesamtsumme �: " + kb.getFormattedSumme());
	}
	
	private void setComboBoxModel() {
		DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>(al.getListe().toArray());
		af.getcBox_artikel().setModel(model);
	}
	
	private class ArtikelFrameAction extends AbstractAction{
		public ArtikelFrameAction() {
			putValue(NAME, "Artikel hinzuf�gen");
			putValue(SHORT_DESCRIPTION, "Einen Artikel hinzuf�gen");
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			af.getTxtField_menge().setText("0");
			af.setVisible(true);
		}
	}
	
	private class AddArtikelKassenbon extends AbstractAction{
		public AddArtikelKassenbon() {
			putValue(NAME, "Artikel hinzuf�gen");
			putValue(SHORT_DESCRIPTION, "Den Artikel hinzuf�gen");
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int index = af.getcBox_artikel().getSelectedIndex();
			int menge = Integer.parseInt(af.getTxtField_menge().getText());
			if(menge > 0 ) {
				kb.addEintrag(al.getListe().get(index), menge);
				af.dispose();
			} else {
				JOptionPane.showMessageDialog(af, "Bitte eine Menge �ber 0 eingeben!");
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
			putValue(SHORT_DESCRIPTION, "Neuen Artikel hinzuf�gen");
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
			putValue(SHORT_DESCRIPTION, "Den Artikel zu der Artikelliste hinzuf�gen");
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			int artNummer = Integer.parseInt(naf.getTxt_artNum().getText());
			String artBez = naf.getTxt_artBez().getText();
			double preis = Double.parseDouble(naf.getTxt_artPreis().getText());
			al.addArtikel(artNummer, artBez, preis);
			naf.dispose();
//			DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>(al.getListe().toArray());
//			af.getcBox_artikel().setModel(model);
			setComboBoxModel();
		}
	}
}
