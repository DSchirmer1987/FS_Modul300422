package inputDialog;

import javax.swing.JOptionPane;

public class InputDialogDemo {
	/*
	 * InputDialog
	 * JOptionPane.showInputDialog
	 * 
	 * Für Eingabe über einen Dialog
	 * 
	 * Syntax:
	 * JOptionPane.showInputDialog(Object) :
	 *  - Einfaches Inputfeld mit einer Nachricht (Object = Nachricht)
	 *  
	 * JOptionPane.showInputDialog(Object, Object)
	 *  - Einfaches Inputfeld mit einer Nachricht und einen InitialWert(Object = Nachricht, InitialWert)
	 *  
	 * JOptionPane.showInputDialog(Component, Object)
	 *  - Einfaches Inputfeld mit einer Nachricht innerhalb eines Fensters(Component = Fenster ,Object = Nachricht)
	 * 
	 * JOptionPane.showInputDialog(Component, Object, Object)
	 *  - Einfaches Inputfeld mit einer Nachricht und einem InitialWert innerhalb eines Fensters(Component = Fenster ,Object = Nachricht, InitialWert)
	 *  
	 * JOptionPane.showInputDialog(Component, Object, String, MessageType)
	 * - Einfaches Inputfeld mit einer Nachricht und einem Titel innerhalb eines Fensters und des MessageTypes (Component = Fenster ,Object = Nachricht)
	 * 
	 * JOptionPane.showInputDialog(Component, Object, String, MessageType, Icon, Object[], Object)
	 * - Inputfeld mit vorgegebenen Werten - Sozusagen ein Dropdown Input mit den Optionen als Object[] und die Startwahl als Object
	 * 
	 */
	
	public static void simpleInput() {
		String input = JOptionPane.showInputDialog("Bitte etwas eingeben.");
		int a;
		try {
			a = Integer.parseInt(input);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ungültige Eingabe");
		}
		System.out.println(input);
	}
	
	public static void simpleInputInital() {
		String input = JOptionPane.showInputDialog("Bitte etwas eingeben", "42");
		System.out.println(input);
	}
	
	public static void simpleDropdownInput() {
		String options[] = {"42", "Hallo Welt", "Java ist toll", "Ich mag Kekse"};
		String input = (String) JOptionPane.showInputDialog(null, "Wähle etwas aus", "Auswahl", 0, null, options, options[0]);
		System.out.println(input);
	}
	
	public static void simpleDropdownInputInteger() {
		Integer options[] = {123, 456, 789, 134, 584};
		Integer input = (Integer) JOptionPane.showInputDialog(null, "Wähle etwas aus", "Auswahl", 0, null, options, options[0]);
		System.out.println(input);
	}
}
