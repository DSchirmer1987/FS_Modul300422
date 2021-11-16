package model;

public class Kunde {
	private String vorname;
	private String nachname;
	private String addresse;
	
	public Kunde(String vorname, String nachname, String addresse) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.addresse = addresse;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	
	
}
