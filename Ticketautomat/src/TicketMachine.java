
import java.util.Scanner;

public class TicketMachine {
	private Zones kilo = Zones.Kilo, alpha = Zones.Alpha, beta = Zones.Beta, charlie = Zones.Charlie,
			delta = Zones.Delta;

	private Money oneCent = Money.OneCent, twoCent = Money.TwoCent, fiveCent = Money.FiveCent, tenCent = Money.TenCent,
			twentyCent = Money.TwentyCent, fiftyCent = Money.FiftyCent, oneEuro = Money.OneEuro,
			twoEuro = Money.TwoEuro, fiveEuro = Money.FiveEuro, tenEuro = Money.TenEuro, twentyEuro = Money.TwentyEuro;

	private static Scanner sc;
	private int input;

	static {
		sc = new Scanner(System.in);
	}
	//runs the actual program
	public void run() {
		while (true) {
			printPrices();
			payment(chooseRide(input()));
		}
	}
	
	//gives out the price list and options
	private void printPrices() {
		System.out.println("Guten Tag!\n");
		System.out.println("Ihre Fahrtmöglichkeiten:");
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("1: " + Zones.Kilo.getZone() + "  %.2f Euro\n", kilo.getPrice());
		System.out.printf("2: " + alpha.getZone() + "  %.2f Euro\n", alpha.getPrice());
		System.out.printf("3: " + beta.getZone() + "  %.2f Euro\n", beta.getPrice());
		System.out.printf("4: " + charlie.getZone() + "  %.2f Euro\n", charlie.getPrice());
		System.out.printf("5: " + delta.getZone() + " %.2f Euro\n", delta.getPrice());

		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	//decision maker, returns user input
	private int input() {
		System.out.println("Bitte wählen Sie eine Option!");
		return sc.nextInt();
	}

	//selects user choice and returns price
	private double chooseRide(int input) {
		Zones ride = null;
		switch (input) {
		case 1: {
			ride = kilo;
			break;
		}
		case 2: {
			ride = alpha;
			break;
		}
		case 3: {
			ride = beta;
			break;
		}
		case 4: {
			ride = charlie;
			break;
		}
		case 5: {
			ride = delta;
			break;
		}
		case 187:{
			System.out.println("Freifahrt!");
			System.exit(0);
		}

		}
		System.out.println("Sie haben Zone " + ride.getZone() + " gewählt!");
		return ride.getPrice();
	}
	
	//gets price by selected ride
	private void payment(double price) {
		System.out.printf("Zu zahlen %.2f Euro\n", price);
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf(" 1:  %.2f Euro\n", oneCent.getValue());
		System.out.printf(" 2:  %.2f Euro\n", twoCent.getValue());
		System.out.printf(" 3:  %.2f Euro\n", fiveCent.getValue());
		System.out.printf(" 4:  %.2f Euro\n", tenCent.getValue());
		System.out.printf(" 5:  %.2f Euro\n", twentyCent.getValue());
		System.out.printf(" 6:  %.2f Euro\n", fiftyCent.getValue());
		System.out.printf(" 7:  %.2f Euro\n", oneEuro.getValue());
		System.out.printf(" 8:  %.2f Euro\n", twoEuro.getValue());
		System.out.printf(" 9:  %.2f Euro\n", fiveEuro.getValue());
		System.out.printf("10: %.2f Euro\n", tenEuro.getValue());
		System.out.printf("11: %.2f Euro\n", twentyEuro.getValue());
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();

		while (price > 0) {
			input = sc.nextInt();
			switch (input) {
			case 1:
				price -= oneCent.getValue();
				break;
			case 2:
				price -= twoCent.getValue();
				break;
			case 3:
				price -= fiveCent.getValue();
				break;
			case 4:
				price -= tenCent.getValue();
				break;
			case 5:
				price -= twentyCent.getValue();
				break;
			case 6:
				price -= fiftyCent.getValue();
				break;
			case 7:
				price -= oneEuro.getValue();
				break;
			case 8:
				price -= twoEuro.getValue();
				break;
			case 9:
				price -= fiveEuro.getValue();
				break;
			case 10:
				price -= tenEuro.getValue();
				break;
			case 11:
				price -= twentyEuro.getValue();
				break;
			case 187:
				System.out.println("Freifahrt!");
				System.exit(0);				
			default:
				System.out.println("Zahlungsmittel ungültig! Bitte entnehmen!");
			}
			if (price > 0)
				System.out.printf("Noch zu zahlen: %.2f Euro.", price);
		}
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Ihr Fahrschein wird gedruckt!");
		System.out.printf("Bitte entnehmen Sie Ihr Wechselgeld: %.2f Euro\n", Math.abs(price));
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println();
	}

}
