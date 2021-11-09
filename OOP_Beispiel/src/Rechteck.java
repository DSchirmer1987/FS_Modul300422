
public class Rechteck {
	private double seiteA, SeiteB;
	private double flaeche, umfang;
	
	public Rechteck(double a, double b) {
		this.seiteA = a;
		this.SeiteB = b;
		this.berechneFlaeche();
		this.berechneUmfang();
	}
	
	public Rechteck() {
		this(5, 10);
	}

	public double getSeiteA() {
		return seiteA;
	}

	public void setSeiteA(double seiteA) {
		this.seiteA = seiteA;
		this.berechneFlaeche();
		this.berechneUmfang();
	}

	public double getSeiteB() {
		return SeiteB;
	}

	public void setSeiteB(double seiteB) {
		SeiteB = seiteB;
		this.berechneFlaeche();
		this.berechneUmfang();
	}

	public double getFlaeche() {
		return flaeche;
	}

	public double getUmfang() {
		return umfang;
	}

	@Override
	public String toString() {
		return "Rechteck [seiteA=" + seiteA + ", SeiteB=" + SeiteB + ", flaeche=" + flaeche + ", umfang=" + umfang
				+ "]";
	}
	
	public void berechneFlaeche() {
		this.flaeche = this.seiteA * this.SeiteB;
	}
	
	public void berechneUmfang() {
		this.umfang = (this.seiteA * 2) + (this.SeiteB * 2);
	}
}
