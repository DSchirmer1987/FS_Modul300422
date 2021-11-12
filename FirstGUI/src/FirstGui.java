import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FirstGui {

	public static void main(String[] args) {
		/*
		 * GUI in Java
		 * 
		 * Swing - Standardweg in Java um GUI zu erstellen
		 * 
		 */
		
		// Oberstes Element ein Frame
		JFrame frame = new JFrame();
		
		// Framegröße festlegen
		frame.setSize(320, 320);
		
		// Standardverhalten beim schließen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * Setzen der Platzierung des Frame innerhalb des Monitores
		 */
		// 1. Option - Setzen der Position absolut (0,0) = obere linke Ecke.
//		frame.setLocation(300, 300);
		
		// 2. Option - Setzen des Frames in die Mitte des Bildschirmes
//		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//		frame.setLocation(dim.width /2 - (frame.getWidth()/2) , dim.height /2 - (frame.getHeight() /2));
		
		// 3. Option - bzw. 2te Möglichkeit zum setzen des Frames in die Mitte
		frame.setLocationRelativeTo(null);
		
		/*
		 * Frame befüllen
		 */
		// Layout setzen - Wie soll der Inhalt angeordnet werden
		frame.setLayout(new GridLayout(2, 2));
		
		// Label - Anzeige von Texten
		JLabel label = new JLabel("Lies mich!", SwingConstants.CENTER);
		JLabel labelTwo = new JLabel("Lies auch mich!");
		
		// Button - Ein Knopf zum drücken
		JButton button = new JButton("Drück mich!");
		
		// Den Button eine Funktion zufügen
		/*
		 * 1. Version - Über Innere Anonyme Klasse
		 */
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Der Button wurde gedrück!");
			}
		});
		/*
		 * 2. Version - Lambda
		 */
		button.addActionListener(e -> label.setText("Mit Lambda!"));
		/*
		 * 3. Version - Eigene Klasse
		 */
		button.addActionListener(new MyButtonListener());
		
		
		// Ein Label klickbar machen
		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Label geklickt");
			}
		});
		
		button.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar());
			}
		});
		
		
		// Elemente zum Fenster hinzufügen - Erst Elemente hinzufügen, dann sichtbarkeit setzen
		frame.add(label);
		frame.add(labelTwo);
		frame.add(button);
		
		// Anzeigen des Frames
		frame.setVisible(true);
		
		
	}

}
