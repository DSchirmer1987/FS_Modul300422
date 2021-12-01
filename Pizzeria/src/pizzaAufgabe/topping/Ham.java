package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public class Ham extends Topping {

	public Ham(Pizza below) {
		super(below, false, false);
	}

	@Override
	public int getPrice() {
		return getBelow().getPrice() + 245;
	}

}
