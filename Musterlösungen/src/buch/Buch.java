package buch;

public class Buch {
	private String titel;
	private String autor;
	private String verlag;
	private short seitenAnzahl;
	
	public Buch(String titel, String autor, String verlag, short seitenAnzahl) {
		super();
		this.titel = titel;
		this.autor = autor;
		this.verlag = verlag;
		this.seitenAnzahl = seitenAnzahl;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getVerlag() {
		return verlag;
	}

	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}

	public int getSeitenAnzahl() {
		return seitenAnzahl;
	}

	public void setSeitenAnzahl(short seitenAnzahl) {
		this.seitenAnzahl = seitenAnzahl;
	}

	@Override
	public String toString() {
		return "Buch [titel=" + titel + ", autor=" + autor + ", verlag=" + verlag + ", seitenAnzahl=" + seitenAnzahl
				+ "]";
	}
}
