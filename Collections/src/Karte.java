
public class Karte {
	private String farbe;
	private int wert;
	
	public Karte(String farbe, int wert) {
		super();
		this.farbe = farbe;
		this.wert = wert;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
	}
	
	public String toString() {
		return farbe + "-" +  wert;
	}
}
