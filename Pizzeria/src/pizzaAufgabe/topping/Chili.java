package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public class Chili extends Topping {

	public Chili(Pizza below) {
		super(below, true, true);
	}

	@Override
	public int getPrice() {
		return getBelow().getPrice() + 95;
	}
}
