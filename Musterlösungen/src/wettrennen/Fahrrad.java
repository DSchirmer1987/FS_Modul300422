package wettrennen;


public class Fahrrad extends Fahrzeug{
	
	public Fahrrad() {
		super(30, 2);
	}

	@Override
	public String toString() {
		return "Fahrrad [toString()=" + super.toString() + "]";
	}
		
}
