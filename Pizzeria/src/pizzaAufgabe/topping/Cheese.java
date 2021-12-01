package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public class Cheese extends Topping {

	public Cheese(Pizza below) {
		super(below, true, false);
	}

	@Override
	public int getPrice() {
		return getBelow().getPrice() + 195;
	}

}
