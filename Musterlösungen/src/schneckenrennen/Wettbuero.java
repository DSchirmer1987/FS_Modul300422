package schneckenrennen;

import java.util.ArrayList;

public class Wettbuero {
	private Rennen rennen = new Rennen();
	private ArrayList<Wette> wette = new ArrayList<Wette>();
	private double factor = 2.0;
	
	public void wetteAnnehmen(String schneckenName, int wettEinsatz, String spieler) {
		wette.add(new Wette(schneckenName, wettEinsatz, spieler));
	}

	public void rennenDurchfuehren() {
		Rennschnecke[] rs1 = new Rennschnecke[5];
		for (int i = 0; i < rs1.length; i++) {
			rs1[i] = new Rennschnecke(i);
			rennen.addRennschnecke(rs1[i]);
		}
		
		
		rennen.durchfuehren();
	}

	public Rennen getRennen() {
		return rennen;
	}

	public void setRennen(Rennen rennen) {
		this.rennen = rennen;
	}

	public ArrayList<Wette> getWette() {
		return wette;
	}

	public void setWette(ArrayList<Wette> wette) {
		this.wette = wette;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	@Override
	public String toString() {
		return "Wettbuero [rennen=" + rennen + ", wette=" + wette + ", factor=" + factor + ", getRennen()="
				+ getRennen() + ", getWette()=" + getWette() + ", getFactor()=" + getFactor() + "]";
	}
	
}
