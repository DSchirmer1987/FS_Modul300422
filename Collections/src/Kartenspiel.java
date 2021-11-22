import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Kartenspiel {

	public static void main(String[] args) {
		Karte k1 = new Karte("Herz", 2);
		Karte k2 = new Karte("Pik", 3);
		Karte k3 = new Karte("Karo", 5);
		Karte k4 = new Karte("Kreuz", 1);
		
		// Kartenspiel als Stack - LiFo
		Stack<Karte> Kartenstapel = new Stack<>();
		Kartenstapel.push(k3);
		Kartenstapel.push(k4);
		Kartenstapel.push(k1);
		Kartenstapel.push(k2);
		System.out.println("Kartenstapel: " + Kartenstapel);
		System.out.println("Gebe Karte: " + Kartenstapel.pop());
		System.out.println("Gebe Karte: " + Kartenstapel.pop());
		System.out.println("Gucke Karte an: " + Kartenstapel.peek());
		System.out.println("Kartenstapel: " + Kartenstapel);
		
		System.out.println("==================");
		
		// Kartenspiel Queue - FiFo
		Queue<Karte> Kartenschlange = new LinkedList<Karte>();
		Kartenschlange.add(k3);
		Kartenschlange.add(k4);
		Kartenschlange.add(k1);
		Kartenschlange.add(k2);
		System.out.println("Kartenschlange: " + Kartenschlange);
		System.out.println("Gebe Karte: " + Kartenschlange.poll());
		System.out.println("Gebe Karte: " + Kartenschlange.poll());
		System.out.println("Gucke Karte an: " + Kartenschlange.peek());
		System.out.println("Kartenschlange: " + Kartenschlange);
	}

}
