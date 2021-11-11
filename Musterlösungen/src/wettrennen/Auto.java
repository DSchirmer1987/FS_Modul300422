package wettrennen;


public class Auto extends Fahrzeug{
	
	public Auto() {
		super(140, 4);
	}
	
	public Auto(double maxGeschwindigkeit) {
		super(maxGeschwindigkeit, 4);
	}

	@Override
	public String toString() {
		return "Auto [toString()=" + super.toString() + "]";
	}
	
	
}
