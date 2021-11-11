package confirmDialog;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConfirmDialogDemo {
	/*
	 * JOptionPane.showConfirmDialog
	 * 
	 * Ist ein Dialog mit verschiedenen vorgegeben Buttons zum bestätigen.
	 * 
	 * Syntax:
	 * JOptionPane.showConfirmDialog(Component, Object);
	 * JOptionPane.showConfirmDialog(Component, Object, String, int);
	 * JOptionPane.showConfirmDialog(Component, Object, String, int, int);
	 * JOptionPane.showConfirmDialog(Component, Object, String, int, int, Icon);
	 * 
	 * Component:
	 *  - Ist das Fenster in dem der Dialog angezeigt werden soll. Kann auch 'null' sein
	 *  
	 * Object: 
	 *  - Die Message die angezeigt werden soll. Kann alles sein, dass vom Typ Object ist
	 *  
	 * String:
	 *  - Der Titel des OptionPane ConfirmDialog
	 *  
	 * int:
	 *  - Ist der OptionType für JOptionPane
	 * 		- OptionTypes:
	 * 			- DEFAULT_OPTION - Standart
	 * 			- YES_NO_OPTION - Ja/Nein Buttons
	 * 			- YES_NO_CANCEL_OPTION - Ja/Nein/Abbrechen Buttons
	 * 			- OK_CANCEL_OPTION - Ok/Abbrechen Buttons
	 *
	 * int:
	 *  - Ist der MessageType (Das Icon / Nachrichtentyp)
	 *  	- MessageTypes:
	 *  		- ERROR_MESSAGE
	 *  		- INFORMATION_MESSAGE
	 *  		- WARNING_MESSAGE
	 *  		- QUESTION_MESSAGE
	 *  		- PLAIN_MESSAGE
	 *  
	 * icon:
	 * 	- Das Icon das angezeigt werden soll. Überschreibt dann den MessageType
	 */
	
	public static void simpleConfirmDialog() {
		int input = JOptionPane.showConfirmDialog(null, "Mögen Sie Java?");
		System.out.println(input);
	}
	
	public static void confirmDialogTitleButtons() {
		int input = JOptionPane.showConfirmDialog(null, "Mögen Sie Java", "Java-Frage", JOptionPane.DEFAULT_OPTION);
		System.out.println(input);
	}
	
	public static void confirmDialogTitleButtonsMessageType() {
		int input = JOptionPane.showConfirmDialog(null, "Mögen Sie Java?", "Java-Frage", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		System.out.println(input);
	}
	
	public static void confirmDialoogTitleButtonsMessageTypeIcon() {
		ImageIcon icon = new ImageIcon("src/icon.png");
		// Resize in Java
		Image image = icon.getImage();
		Image newImage = image.getScaledInstance(64, 64, Image.SCALE_SMOOTH);
		icon = new ImageIcon(newImage);

		int input = JOptionPane.showConfirmDialog(null, "Mögen Sie Java?", "Java-Frage", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
		System.out.println(input);
	}
}
