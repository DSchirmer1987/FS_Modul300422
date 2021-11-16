package schneckenrennen;

import java.util.Random;

public class Rennschnecke {
	private String name;
	private String rasse;
	private double vMax;
	private double weg;

	public Rennschnecke(int i) {
		this.name = "TurboSchnecki_" + (i+1);
		this.rasse = "Weinbergschnecke";
		this.vMax = 1.2;
		this.weg = 0.0;
	}

	public void krieche() {
		double strecke;
		do {
			strecke = Math.random();
		} while (strecke >= vMax);
		weg += strecke;
		
		// Schnecke kriecht immer in vMax + Zufall
//		weg = weg + Math.random() * vMax;
		
		// Schnecke kriecht zwischen 1.0 und vMax
//		boolean repeat = true;
//		while(repeat) {
//			strecke = Math.random() + 1.0;
//			if(strecke <= vMax) {
//				weg += strecke;
//				repeat = false;
//			}
//		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	public double getvMax() {
		return vMax;
	}

	public void setvMax(double vMax) {
		this.vMax = vMax;
	}

	public double getWeg() {
		return weg;
	}

	public void setWeg(double weg) {
		this.weg = weg;
	}

	@Override
	public String toString() {
		return "Rennschnecke [name=" + name + ", rasse=" + rasse + ", vMax=" + vMax + ", weg=" + weg + ", getName()="
				+ getName() + ", getRasse()=" + getRasse() + ", getvMax()=" + getvMax() + ", getWeg()=" + getWeg()
				+ "]";
	}
}
