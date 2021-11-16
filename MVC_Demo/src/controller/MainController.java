package controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Kunde;
import model.Kundenspeicher;
import view.MainFrame;

public class MainController {
	private MainFrame mainFrame;
	private Kundenspeicher kundenspeicher;
	private int counter = 0;
	
	public MainController() {
//		this.init();
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					mainFrame = new MainFrame();
					init();
					mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void init() {
		kundenspeicher = new Kundenspeicher();
		for(int i = 0; i <= 10; i++) {
			kundenspeicher.addKunde(new Kunde("Kunde_"+i, "Muster", "Musterweg " + i * 2));
		}
		
		mainFrame.getContentPanel().getBtn_east().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.getContentPanel().getTxtF_center_vorname().setText(kundenspeicher.getKunden().get(counter).getVorname());
				mainFrame.getContentPanel().getTxtF_center_name().setText(kundenspeicher.getKunden().get(counter).getNachname());
				mainFrame.getContentPanel().getTxtF_center_addresse().setText(kundenspeicher.getKunden().get(counter).getAddresse());
				counter++;
				if(counter == kundenspeicher.getKunden().size()) {
					counter = 0;
				}
			}
		});
		mainFrame.getContentPanel().getBtn_east().setText("Next");
	}
}
