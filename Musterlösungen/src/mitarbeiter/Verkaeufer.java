package mitarbeiter;

public class Verkaeufer implements IMitarbeiterUniversal {

	private int personalNr;
	private String name;
	private String datumEintritt;
	private double monatsLohn;
	private double fixGehalt;
	private double provision;
	private double umsatz;
	

	public Verkaeufer(int personalNr, String name, String datumEintritt, double monatsLohn, double fixGehalt,
			double provision, double umsatz) {
		super();
		this.personalNr = personalNr;
		this.name = name;
		this.datumEintritt = datumEintritt;
		this.monatsLohn = monatsLohn;
		this.fixGehalt = fixGehalt;
		this.provision = provision;
		this.umsatz = umsatz;
	}

	@Override
	public int getPersonalNr() {
		return personalNr;
	}

	@Override
	public void setPersonalNr(int personalNr) {
		this.personalNr = personalNr;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getDatumEintritt() {
		return datumEintritt;
	}

	@Override
	public void setDatumEintritt(String datumEintritt) {
		this.datumEintritt = datumEintritt;

	}

	@Override
	public double getMonatsLohn() {
		monatsLohn = (fixGehalt+umsatz*provision/100);
		return monatsLohn;
	}

	@Override
	public void setMonatsLohn(double monatsLohn) {
		this.monatsLohn = monatsLohn;

	}

	// should be used?
	@Override
	public double calcMonatsLohn() {
		return 0;
		
	}

	public double getFixGehalt() {
		return fixGehalt;
	}

	public void setFixGehalt(double fixGehalt) {
		this.fixGehalt = fixGehalt;
	}

	public double getProvision() {
		return provision;
	}

	public void setProvision(double provision) {
		this.provision = provision;
	}

	public double getUmsatz() {
		return umsatz;
	}

	public void setUmsatz(double umsatz) {
		this.umsatz = umsatz;
	};
	
}
