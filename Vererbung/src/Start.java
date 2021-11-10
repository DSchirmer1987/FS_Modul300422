
public class Start {

	public static void main(String[] args) {
//		Wenn Klassen abstrakt sind, können diese nicht instanziert werden!
//		Tier tier1 = new Tier();
		Hund hund1 = new Hund();
		Katze katze1 = new Katze();
		Pflanze pflanze1 = new Pflanze("Blau", "Stern", true);
		Blume blume1 = new Blume();
		IFressbar meinEssen;
		
		meinEssen = new Katze();
		Tier katze2 = new Katze();
		
		hund1.setName("Waldi");
		
//		System.out.println("Tier 1 - " + tier1);
		System.out.println("Hund 1 - " + hund1);
		System.out.println("Katze 1 - " + katze1);
		katze1.miauen();
		
//		Nicht möglich, da katze2 ein Tier zur Laufzeit ist
//		katze2.miauen();
		
		System.out.println("-----------");
		System.out.println("Interfaces: ");
		hund1.setNahrung(pflanze1);
		hund1.fressen();
		hund1.setNahrung(blume1);
		hund1.fressen();
		hund1.setNahrung(katze1);
		hund1.fressen();
		hund1.setNahrung(hund1);
		hund1.fressen();
		meinEssen.wirdGefressen();
	}

}
