import java.time.LocalTime;

public class LocalTimeDemo {
	public static void LocalTimeDemonstration() {
		//LocalTime nutzt die Stunden des Tages
		LocalTime jetzt = LocalTime.now();
		// Stunde und Minute
		LocalTime mittag = LocalTime.of(13, 0);
		// Stunde, Minute und Sekunden
		LocalTime frueh = LocalTime.of(9, 30, 16);
		//Stunde, Minute, Sekunden und Nanosekunden
		LocalTime pause = LocalTime.of(11, 30, 0, 25);
		
		System.out.println(jetzt);
		System.out.println(mittag);
		System.out.println(frueh);
		System.out.println(pause);
	}
}
