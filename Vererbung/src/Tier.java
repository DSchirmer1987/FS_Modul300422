
public class Tier {
	private String name;
	private int alter;
	private double gewicht;
	
	public Tier(String name, int alter, double gewicht) {
		super();
		this.name = name;
		this.alter = alter;
		this.gewicht = gewicht;
		System.out.println("Tier-Objekt erstellt.");
	}
	
	public Tier() {
		this("Eberhart", 3, 15.5);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	@Override
	public String toString() {
		return "Tier [name=" + name + ", alter=" + alter + ", gewicht=" + gewicht + "]";
	}
	
	
}
