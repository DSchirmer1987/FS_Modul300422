
public class Katze extends Tier{
	
	public Katze() {
		super("Mieze", 5, 6.0);
		System.out.println("Katze-Objekt erstellt.");
	}
	
	public void miauen() {
		System.out.println("Katze miaut");
	}

	@Override
	public void fressen() {
		System.out.println("Die Katze frisst");
		
	}
}
