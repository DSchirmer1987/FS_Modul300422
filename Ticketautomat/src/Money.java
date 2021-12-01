
public enum Money {
	OneCent(0.01), TwoCent(0.02), FiveCent(0.05), TenCent(0.10), TwentyCent(0.20), FiftyCent(0.50), OneEuro(1),
	TwoEuro(2), FiveEuro(5), TenEuro(10), TwentyEuro(20);

	private final double value;

	private Money(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

}
