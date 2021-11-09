
public class Katze {
	private String name;
//	Static Attribute sind an keine Instanz(Objekt) gebunden und gelten für ALLE Instanzen(Objekte) der Klasse
	private static String fellfarbe;
	
	public Katze(String name, String farbe) {
		this.name = name;
		fellfarbe = farbe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static String getFellfarbe() {
		return fellfarbe;
	}

	public static void setFellfarbe(String fellfarbe) {
		Katze.fellfarbe = fellfarbe;
	}

	public static void rufen() {
		System.out.println("Die Katzen rufen. Die Katzen haben die Fellfarbe: " + fellfarbe);
	}
	
	public void miauen() {
		System.out.println("Die Katze miaut.");
	}

	@Override
	public String toString() {
		return "Katze [name=" + name + " fellfarbe=" + fellfarbe + "]";
	}
	
}
