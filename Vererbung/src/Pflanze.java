
public class Pflanze implements IFressbar{
	private String bluetenfarbe;
	private String blattform;
	private boolean essbar;
	
	// Konstruktor mit Parametern - Der Konstruktor ohne  Parameter nicht mehr verfügbar
	public Pflanze(String farbe, String form, boolean essbar) {
		this.bluetenfarbe = farbe;
		this.blattform = form;
		this.essbar = essbar;
	}

	@Override
	public void wirdGefressen() {
		System.out.println(this.getClass().getName() + " wird gefressen");
		
	}
}
