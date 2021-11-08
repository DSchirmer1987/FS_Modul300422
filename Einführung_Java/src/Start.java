
public class Start {

	public static void main(String[] args) {
		System.out.println("Hallo Welt");
		System.out.println("Hello World");
		
		Stuhl stuhl1 = new Stuhl();
		Stuhl stuhl2 = new Stuhl();
		Stuhl stuhl3 = new Stuhl(5, "Plastik", true);
		Stuhl stuhl4 = new Stuhl(3);
		
		stuhl1.setAnzahlBeine(12);
		stuhl4.setMaterial("Holz");
		
		System.out.println("Stuhl 1 = " + stuhl1);
		System.out.println("Stuhl 2 = " + stuhl2);
		System.out.println("Stuhl 3 = " + stuhl3);
		System.out.println("Stuhl 4 = " + stuhl4);
		System.out.println(stuhl1.getMaterial());
		int x = 5;
	}
	
	public static void machSieben(int x) {
		x = 7;
	}
	
	public static int machAcht(int x) {
		x = 8;
		return x;
	}

}
