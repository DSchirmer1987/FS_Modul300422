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

public class GUI_Controller {
	
	private final Action artikelFrameAction = new ArtikelFrameAction();
	private final Action addArtikelKassenbon = new AddArtikelKassenbon();
	private final Action showKassenbonFrame = new ShowKassenbonFrame();
	private Kassenbon kb;
	private Artikelliste al;
	private KassenFrame kf;
	private ArtikelFrame af;
	private KassenbonFrame kbf;
	
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
		DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>(al.getListe().toArray());
		af.getcBox_artikel().setModel(model);
		
		kbf = new KassenbonFrame();
	}
	
	private void generateArtikels() {
		this.al.addArtikel(new Artikel(123, "Banane", 1.99));
		this.al.addArtikel(new Artikel(456, "Kaffee", 4.99));
	}
	
	private void setKassenText() {
		kf.getTxtPane_kassenbon().setText("Anzahl Artikel: " + kb.getListe().size() + System.lineSeparator()+ System.lineSeparator() + "Gesamtsumme €: " + kb.getFormattedSumme());
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
				kb.addEintrag(al.getListe().get(index), menge);
				af.setVisible(false);
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
}
