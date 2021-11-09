
public class Application {
	
	public static void main(String args[]) {
		Katze.rufen();
		
		Katze k1 = new Katze("Miezi", "Schwarz");
		k1.miauen();
		System.out.println(k1);
		Katze k2 = new Katze("Pauli", "Weiss");
		System.out.println(k1);
		System.out.println(k2);
	}
}
