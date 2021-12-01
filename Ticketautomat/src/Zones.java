
public enum Zones {

	Kilo(1.40, 'K'), Alpha(2.30, 'A'), Beta(4.70, 'B'), Charlie(9.60, 'C'), Delta(11.40, 'D');

	private final double price;
	private final char zone;

	private Zones(double price, char zone) {
		this.price = price;
		this.zone = zone;
	}

	public double getPrice() {
		return price;
	}

	public char getZone() {
		return zone;
	}

}
