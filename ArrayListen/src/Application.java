import java.util.ArrayList;
import java.util.Arrays;

public class Application {
	public static ArrayList<String> teilnehmer;

	public static void main(String[] args) {
		// Deklaration von Arrays
		int zahlen[];
		// Initialisierung von Arrays
		zahlen = new int[5];
		zahlen = new int[] {1, 3, 5, 7, 9};
		
		// Deklaration und Initialisierung
		int nummern[] = new int[5];
		
		for (int i = 0; i < nummern.length; i++) {
			nummern[i] = i;
		}
		
		int numbers[] = new int[6];
		for (int i = 0; i < nummern.length; i++) {
			numbers[i] = nummern[i];
		}
		numbers[5] = 5;
		
		System.out.println(Arrays.toString(nummern));
		System.out.println(Arrays.toString(numbers));
		
		/*
		 * ArrayList
		 * 
		 * ArrayList arbeitet wie ein Array, ist aber nicht auf eine fixe Länge beschränkt
		 */
		ArrayList<Integer> zahlenListe =  new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			zahlenListe.add(i);
		}
		System.out.println(zahlenListe);
		zahlenListe.add(5, 42);
		System.out.println(zahlenListe);
		zahlenListe.remove(8);
		System.out.println(zahlenListe);
		
		ArrayList<Object> liste = new ArrayList<>();
		liste.add("Hallo");
		liste.add(123);
		liste.add(true);
		liste.add(3.1415);
		liste.set(1, "Welt");
		System.out.println(liste);
		
		ArrayList<ArrayList> doppelteListe = new ArrayList<>();
		doppelteListe.add(zahlenListe);
		doppelteListe.add(liste);
		System.out.println(doppelteListe);
		doppelteListe.get(0).add(5);
		System.out.println(doppelteListe);
	}
	
	public static void addRennschnecke(String schnecke) {
		teilnehmer.add(schnecke);
	}
}
