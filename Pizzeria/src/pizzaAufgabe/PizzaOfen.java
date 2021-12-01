package pizzaAufgabe;

import pizzaAufgabe.bottom.Crusty;
import pizzaAufgabe.bottom.Munchy;
import pizzaAufgabe.topping.Cheese;
import pizzaAufgabe.topping.Chili;
import pizzaAufgabe.topping.Onions;
import pizzaAufgabe.topping.Salami;

public class PizzaOfen {

	public static void main(String[] args) {
		Pizza one = new Crusty();
		System.out.println("Boden");
		System.out.println(one.getPrice());
		System.out.println(one.isHot());
		System.out.println(one.isVegetable());
		
		one = new Salami(one);
		System.out.println("Mit Salami");
		System.out.println(one.getPrice());
		System.out.println(one.isHot());
		System.out.println(one.isVegetable());
		
		one = new Chili(one);
		System.out.println("Mit Chili");
		System.out.println(one.getPrice());
		System.out.println(one.isHot());
		System.out.println(one.isVegetable());
		
		Pizza two = new Crusty();
		two = new Onions(two);
		System.out.println("Zweite Pizza");
		System.out.println(two.isVegetable());
		System.out.println(two.isHot());
	}
}
