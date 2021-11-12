package messageDialog;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MessageDialogDemo {
	/*
	 * MessageDialog
	 * 
	 * JOptionPane.showMessageDialog
	 *  - Das Dialogfenster zum einfachen Anzeigen von Nachrichten
	 *  
	 *  JOptionPane.showMessageDialog(Component, Object)
	 *   - Das einfachste Dialogfenster zum Anzeigen einer Nachricht (Component = Fenster, Object = Nachricht)
	 *   
	 *  JOptionPane.showMessageDialog(Component, Object, String, int)
	 *   - Das einfachste Dialogfenster zum Anzeigen einer Nachricht und einen Titel, sowie MessageType (Component = Fenster, Object = Nachricht, String = Titel, int = MessageType)
	 *   
	 *  JOptionPane.showMessageDialog(Component, Object, String, int, Icon)
	 *   - Das einfachste Dialogfenster zum Anzeigen einer Nachricht und einen Titel, sowie MessageType und Icon (Component = Fenster, Object = Nachricht, String = Titel, int = MessageType, Icon = Icon)
	 */
	
	public static void simpleMessage() {
		JOptionPane.showMessageDialog(null, "Eine Nachricht");
	}
	
	public static void simpleMessageTitelMessageType() {
		JOptionPane.showMessageDialog(null, "Ein Nachricht", "Ein Titel", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void simpleMessageTitelMessageTypeIcon() {
		ImageIcon icon = new ImageIcon("src/icon.png");
		Image image = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		icon = new ImageIcon(image);
		JOptionPane.showMessageDialog(null, "Ein Nachricht", "Ein Titel", JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
}
