package mitarbeiter;

public abstract class Mitarbeiter {
	
	private int personalNr;
	private String name;
	private String datumEintritt;
	private double monatsLohn;
	
	public Mitarbeiter(int personalNr, String name, String datumEintritt, double monatsLohn) {
		super();
		this.personalNr = personalNr;
		this.name = name;
		this.datumEintritt = datumEintritt;
		this.monatsLohn = monatsLohn;
	}

	public int getPersonalNr() {
		return personalNr;
	}

	public void setPersonalNr(int personalNr) {
		this.personalNr = personalNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDatumEintritt() {
		return datumEintritt;
	}

	public void setDatumEintritt(String datumEintritt) {
		this.datumEintritt = datumEintritt;
	}

	public double getMonatsLohn() {
		return monatsLohn;
	}

	public void setMonatsLohn(double monatsLohn) {
		this.monatsLohn = monatsLohn;
	}
	
	@Override
	public String toString() {
		return "Mitarbeiter [personalNr=" + personalNr + ", name=" + name + ", datumEintritt=" + datumEintritt
				+ ", monatsLohn=" + monatsLohn + ", getPersonalNr()=" + getPersonalNr() + ", getName()=" + getName()
				+ ", getDatumEintritt()=" + getDatumEintritt() + ", getMonatsLohn()=" + getMonatsLohn() + "]";
	}

	
	
}
