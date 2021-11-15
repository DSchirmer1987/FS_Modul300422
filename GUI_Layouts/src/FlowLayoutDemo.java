import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame{
	
	public FlowLayoutDemo() {
		this.setTitle("Flow Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 480);
		this.setLocationRelativeTo(null);
		/*
		 * FlowLayout
		 * 
		 * FlowLayout() - Einfaches dynamisch anpassendes Layout - Alignmet CENTER
		 * FlowLayout(alignment) - Alignment= RIGHT, LEFT, CENTER, LEADING, TRAILING - Für die Ausrichtung der Elemente
		 * FlowLayout(alignment, hgap, vgap) - Ausrichtung und Horizontaler und Vertikaler Abstand
		 */
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		for(int i = 1; i <= 10; i++) {
			this.add(new JButton("Button " + i));
		}
		
		this.setVisible(true);
	}
}
