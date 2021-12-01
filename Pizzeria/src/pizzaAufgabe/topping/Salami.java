package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public class Salami extends Topping {

	public Salami(Pizza below) {
		super(below, false, true);
	}

	@Override
	public int getPrice() {
		return getBelow().getPrice() + 225;
	}
}
