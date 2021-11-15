import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame{
	
	public GridLayoutDemo() {
		this.setTitle("Grid Layout");
		/*
		 * GridLayout
		 * 
		 * GridLayout() - Einfaches Grid mit einer Zeile
		 * GridLayout(int, int) - Grid mit Angabe der Zeilen und Reihen
		 * GridLayout(int, int, int, int) - Grid mit Angabe der Zeilen/Reihen und Abstände vertikal und horizontal
		 */
		this.setLayout(new GridLayout(4, 4));
		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.PINK);
		this.setLocationRelativeTo(null);
		
		for(int i = 1; i <= 10; i++) {
			this.add(new JButton("Button " + i));
		}
		
		this.setVisible(true);
	}
}
