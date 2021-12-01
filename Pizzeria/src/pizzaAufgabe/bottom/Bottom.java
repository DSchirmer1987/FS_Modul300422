package pizzaAufgabe.bottom;

import pizzaAufgabe.Pizza;

public abstract class Bottom implements Pizza {

	@Override
	public boolean isVegetable() {
		return true;
	}

	@Override
	public boolean isHot() {
		return false;
	}

}
