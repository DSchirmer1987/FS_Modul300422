package optionDialog;

import javax.swing.JOptionPane;

public class OptionDialogDemo {
	/*
	 * OptionDialog
	 * JOption.showOptionDialog
	 * 
	 * Erweitert den ConfirmDialog um die Möglichkeit für eigene Buttons(Optionen).
	 * 
	 * Syntax:
	 * JOptionPane.showOptionDialog(Component, Object, String, OptionType, MessageType, icon, options[], option)
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
	 * 
	 * options[]
	 * 	- Das Array der anzuzeigenden Optionen
	 * 
	 * option
	 *  - Die Standartauswahl
	 */
	
	public static void optionDialogStringOptions() {
		String options[] = {"abc", "def", "ghi", "jkl"};
		int input = JOptionPane.showOptionDialog(null, "Wählen Sie etwas aus", "Klicken Sie einen button", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
		System.out.println(input);
	}
	
	public static void optionDialogIntegerOptions() {
		Integer options[] = {1,2,3,4,5};
		int input = JOptionPane.showOptionDialog(null, "Wählen Sie etwas aus", "Klicken Sie einen button", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
		System.out.println(options[input]);
	}
	
	public static void optionDialogObjectOptions() {
		Object options[] = {'a', "Hallo", 1, 45.4};
		int input = JOptionPane.showOptionDialog(null, "Wählen Sie etwas aus", "Klicken Sie einen button", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
		System.out.println(options[input]);
	}
}
