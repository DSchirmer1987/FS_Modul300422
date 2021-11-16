package schneckenrennen;

public class Wette {
	private String schneckenName;
	private int wettEinsatz;
	private String spieler;
	
	public Wette(String schneckenName, int wettEinsatz, String spieler) {
		this.schneckenName = schneckenName;
		this.wettEinsatz = wettEinsatz;
		this.spieler = spieler;
	}

	public String getSchneckenName() {
		return schneckenName;
	}

	public void setSchneckenName(String schneckenName) {
		this.schneckenName = schneckenName;
	}

	public int getWettEinsatz() {
		return wettEinsatz;
	}

	public void setWettEinsatz(int wettEinsatz) {
		this.wettEinsatz = wettEinsatz;
	}

	public String getSpieler() {
		return spieler;
	}

	public void setSpieler(String spieler) {
		this.spieler = spieler;
	}

	@Override
	public String toString() {
		return "Wetten [schneckenName=" + schneckenName + ", wettEinsatz=" + wettEinsatz + ", spieler=" + spieler
				+ ", getSchneckenName()=" + getSchneckenName() + ", getWettEinsatz()=" + getWettEinsatz()
				+ ", getSpieler()=" + getSpieler() + "]";
	}

}
