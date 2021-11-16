package model;

import java.util.ArrayList;

public class Kundenspeicher {
	private ArrayList<Kunde> kunden;
	
	public Kundenspeicher() {
		this.kunden = new ArrayList<>();
	}
	
	public Kundenspeicher(ArrayList<Kunde> kunden) {
		this.kunden = kunden;
	}

	public ArrayList<Kunde> getKunden() {
		return kunden;
	}

	public void setKunden(ArrayList<Kunde> kunden) {
		this.kunden = kunden;
	}
	
	public void addKunde(Kunde kunde) {
		this.kunden.add(kunde);
	}
}
