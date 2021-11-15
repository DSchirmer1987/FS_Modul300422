import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo extends JFrame{
	
	public BoxLayoutDemo() {
		this.setTitle("Box Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 480);
		this.setLocationRelativeTo(null);
		/*
		 * BoxLayout
		 * 
		 * BoxLayout(target, axis) - BoxLayout mit dem Ziel auf dem es wirken soll und in welcher Richtung
		 * 
		 * - BoxLayout benötigt immer ein Ziel(target) auf dem es angewendet werden soll
		 */
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));
		
		for(int i = 1; i <= 10; i++) {
			this.add(new JButton("Button " + i));
		}
		
		this.setVisible(true);
	}
}
