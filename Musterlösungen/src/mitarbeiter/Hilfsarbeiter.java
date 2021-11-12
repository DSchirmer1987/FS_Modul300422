package mitarbeiter;

public class Hilfsarbeiter extends Mitarbeiter {

	private double anzahlStunden;
	private double stundenLohn;
	private double ueberstundenZuschlag;
	
	public Hilfsarbeiter(int personalNr, String name, String datumEintritt, double monatsLohn) {
		super(personalNr, name, datumEintritt, monatsLohn);
	}

	public double getAnzahlStunden() {
		return anzahlStunden;
	}

	public void setAnzahlStunden(double anzahlStunden) {
		this.anzahlStunden = anzahlStunden;
	}

	public double getStundenLohn() {
		return stundenLohn;
	}

	public void setStundenLohn(double stundenLohn) {
		this.stundenLohn = stundenLohn;
	}

	public double getUeberstundenZuschlag() {
		return ueberstundenZuschlag;
	}

	public void setUeberstundenZuschlag(double ueberstundenZuschlag) {
		this.ueberstundenZuschlag = ueberstundenZuschlag;
	}

	@Override
	public String toString() {
		return "Hilfsarbeiter [anzahlStunden=" + anzahlStunden + ", stundenLohn=" + stundenLohn
				+ ", ueberstundenZuschlag=" + ueberstundenZuschlag + ", getAnzahlStunden()=" + getAnzahlStunden()
				+ ", getStundenLohn()=" + getStundenLohn() + ", getUeberstundenZuschlag()=" + getUeberstundenZuschlag()
				+ ", getPersonalNr()=" + getPersonalNr() + ", getName()=" + getName() + ", getDatumEintritt()="
				+ getDatumEintritt() + ", getMonatsLohn()=" + getMonatsLohn() + "]";
	}
	
	public void monatslohnHilfsarbeiter(double stundenlohn, double anzahlstunden, double ueberstundenzuschlag, double anzahlueberstunden) {
		this.setMonatsLohn( stundenlohn*anzahlstunden + ueberstundenzuschlag*anzahlueberstunden);	
	}

}
