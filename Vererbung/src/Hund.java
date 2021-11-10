
public class Hund extends Tier{
	
	// implizit in jeder Klassen vorhanden:
	// Konstruktor ohne Parameter
	// public Klassenname(){}
	
	// Jetzt explizit auffgeführt - aber eigentlich automatisch vorhanden
	public Hund() {
		super();
	}

	@Override
	public void fressen() {
		System.out.println("Der Hund frisst.");
		this.getNahrung().wirdGefressen();
	}
}
