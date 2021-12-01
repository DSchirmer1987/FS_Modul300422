package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public class Onions extends Topping {
	
	public Onions(Pizza below) {
		super(below, true, false);
	}

	@Override
	public int getPrice() {
		return getBelow().getPrice() + 65;
	}

}
