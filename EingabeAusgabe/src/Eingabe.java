import java.util.Scanner;

import javax.swing.JOptionPane;

public class Eingabe {

	public static void main(String[] args) {
		/*
		 * Erste Möglichkeit zur Eingabe
		 */
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Bitte geben Sie etwas ein: ");
		String text = "";
		text = eingabe.nextLine();
		System.out.println("Sie haben " + text + " eingegeben");
		
		System.out.println("Bitte eine Zahl eingeben");
		int zahl = 0;
		zahl = eingabe.nextInt();
		System.out.println("Ihre Zahl ist: " + zahl);
		
		
		/*
		 * Zweite Möglichkeit zur Eingabe
		 */
		String input = JOptionPane.showInputDialog("Bitte etwas eingeben!", "Hallo");
		
		/*
		 * Weitere Möglichkeit zur Ausgabe
		 */
		JOptionPane.showMessageDialog(null, input);
	}

}
