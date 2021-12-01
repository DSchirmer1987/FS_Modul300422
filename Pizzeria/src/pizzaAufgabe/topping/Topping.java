package pizzaAufgabe.topping;

import pizzaAufgabe.Pizza;

public abstract class Topping implements Pizza {
	
	private final Pizza below;
	private static boolean vegetable = true;
	private static int hot;
	
	public Topping(Pizza below, boolean vegetable, boolean hot) {
		this.below = below;
		if(vegetable == false) {
			Topping.vegetable = false;
		}
		if(hot == true) {
			Topping.hot++;
		}
	}

	public Pizza getBelow() {
		return below;
	}

	@Override
	public boolean isVegetable() {
		return vegetable;
	}

	@Override
	public boolean isHot() {
		if(Topping.hot >= 2) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
