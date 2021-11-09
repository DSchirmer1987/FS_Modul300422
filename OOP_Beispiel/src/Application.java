
public class Application {

	public static void main(String[] args) {
		// Rechteck mit A = 5, B = 10
		Rechteck r1 = new Rechteck();
		// Rechteck mit A = 10, B = 20
		Rechteck r2 = new Rechteck(10, 20);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("----------------------------------------------------------------");
		// Programmieren mit Objekten
		System.out.println("Rechteck r1 hat die Fläche " + r1.getSeiteA() * r1.getSeiteB() + "cm²");
		System.out.println("Rechteck r1 hat den Umfang " + ((r1.getSeiteA() * 2 ) + (r1.getSeiteB() * 2)) + "cm");
		System.out.println("Rechteck r2 hat die Fläche " + r2.getSeiteA() * r2.getSeiteB() + "cm²");
		System.out.println("Rechteck r2 hat den Umfang " + ((r2.getSeiteA() * 2 ) + (r2.getSeiteB() * 2)) + "cm");
		
		System.out.println("--------------------------------------------------------------s");
		// OOP - Objektorientieres Programmieren
		System.out.println("Rechteck r1 hat die Fläche " + r1.getFlaeche() + "cm²");
		System.out.println("Rechteck r1 hat den Umfang " + r1.getUmfang() + "cm");
		System.out.println("Rechteck r2 hat die Fläche " + r2.getFlaeche() + "cm²");
		System.out.println("Rechteck r2 hat den Umfang " + r2.getUmfang() + "cm");
		r2.setSeiteA(25);
	}

}
