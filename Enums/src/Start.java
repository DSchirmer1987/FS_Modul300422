
public class Start {

	public static void main(String[] args) {
		Color c;
		c = Color.Red;
		
		for(Color tmpC : Color.values()) {
			System.out.println(tmpC);
			System.out.println("Anteil Rot: " + tmpC.getRed());
			System.out.println("Anteil Grün: " + tmpC.getGreen());
			System.out.println("Anteil Blau: " + tmpC.getBlue());
		}
	}

}
