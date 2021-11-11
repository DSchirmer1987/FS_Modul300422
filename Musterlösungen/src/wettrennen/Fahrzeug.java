package wettrennen;


public class Fahrzeug {
	private double position;
	private double geschwindigkeit;
	private double maxGeschwindigkeit;
	private int anzahlRader;
	
	public Fahrzeug() {
		this.position = 0;
		this.geschwindigkeit = 0;
		this.maxGeschwindigkeit = 0;
		this.anzahlRader = 0;
	}
	
	public Fahrzeug(double maxGeschwindigkeit, int anzahlRaeder) {
		this.position = 0;
		this.geschwindigkeit = 0;
		this.maxGeschwindigkeit = maxGeschwindigkeit;
		this.anzahlRader = anzahlRaeder;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(double geschwindigkeit) {
		if(geschwindigkeit > this.maxGeschwindigkeit) {
			this.geschwindigkeit = this.maxGeschwindigkeit;
		} else {
			this.geschwindigkeit = geschwindigkeit;
		}
	}

	public double getMaxGeschwindigkeit() {
		return maxGeschwindigkeit;
	}

	public void setMaxGeschwindigkeit(double maxGeschwindigkeit) {
		this.maxGeschwindigkeit = maxGeschwindigkeit;
	}

	public int getAnzahlRader() {
		return anzahlRader;
	}

	public void setAnzahlRader(int anzahlRader) {
		this.anzahlRader = anzahlRader;
	}

	@Override
	public String toString() {
		return "Fahrzeug [position=" + position + ", geschwindigkeit=" + geschwindigkeit + ", maxGeschwindigkeit="
				+ maxGeschwindigkeit + ", anzahlRader=" + anzahlRader + "]";
	}
	
	public void bewegen(double zeit) {
		this.position = this.position + (this.geschwindigkeit / 60) * zeit;
	}
}
