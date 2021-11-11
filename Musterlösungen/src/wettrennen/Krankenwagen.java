package wettrennen;


public class Krankenwagen extends Auto{
	private boolean blaulicht;
	
	public Krankenwagen() {
		super();
		this.blaulicht = false;
	}

	public boolean isBlaulicht() {
		return blaulicht;
	}

	public void setBlaulicht(boolean blaulicht) {
		this.blaulicht = blaulicht;
	}

	@Override
	public String toString() {
		return "Krankenwagen [blaulicht=" + blaulicht + ", toString()=" + super.toString() + "]";
	}
	
	
}
