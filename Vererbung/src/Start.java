
public class Start {

	public static void main(String[] args) {
		Tier tier1 = new Tier();
		Hund hund1 = new Hund();
		Katze katze1 = new Katze();
		Pflanze pflanze1 = new Pflanze("Blau", "Stern", true);
		
		Tier katze2 = new Katze();
		
		hund1.setName("Waldi");
		
		System.out.println("Tier 1 - " + tier1);
		System.out.println("Hund 1 - " + hund1);
		System.out.println("Katze 1 - " + katze1);
		katze1.miauen();
		
//		Nicht möglich, da katze2 ein Tier zur Laufzeit ist
//		katze2.miauen();

	}

}
