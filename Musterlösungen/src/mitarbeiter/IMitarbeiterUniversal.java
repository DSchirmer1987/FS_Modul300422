package mitarbeiter;

public interface IMitarbeiterUniversal {
//	int personalNr = 0;
//	String name = "";
//	String datumEintritt = "";
//	double monatsLohn = 0;
	
	public int getPersonalNr();
	public void setPersonalNr(int personalNr);
	public String getName();
	public void setName(String name);
	public String getDatumEintritt();
	public void setDatumEintritt(String datumEintritt);
	public double getMonatsLohn();
	public void setMonatsLohn(double monatsLohn);
	public double calcMonatsLohn();


}
