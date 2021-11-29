import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
	public static void LocalDateTimeDemonstration() {
		// LocalDateTime - Fusion aus Date und Time
		LocalDateTime jetzt = LocalDateTime.now();
		// LocalDateTime.of() nutzt Datum und Uhrzeit
		LocalDateTime heute = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		//LocalDateTime.of(Jahr, Monat, Tag, Stunde, Minute)
		//LocalDateTime.of(Jahr, Monat, Tag, Stunde, Minute, Sekunde)
		//LocalDateTime.of(Jahr, Monat, Tag, Stunde, Minute, Sekunde, Nanosekunde)
		
		System.out.println(jetzt);
		System.out.println(heute);
	}
}
