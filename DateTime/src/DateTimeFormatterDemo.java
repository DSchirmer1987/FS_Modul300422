import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterDemo {
	private static LocalDateTime heute = LocalDateTime.now();
	private static LocalDate datum = LocalDate.now();
	private static LocalTime zeit = LocalTime.now();
	
	public static void demoDateTimeFormatter() {
		DateTimeFormatter iso = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter basic_iso = DateTimeFormatter.BASIC_ISO_DATE;
		
		System.out.println("Normal: " + datum);
		System.out.println("ISO_DATE: " + datum.format(iso));
		System.out.println("BASIC_ISO_DATE: " + datum.format(basic_iso));
	}
	
	public static void demoDateTimeFormatterPattern() {
		// Pattern = Vorlage nach dem Formartiert werden soll.
		DateTimeFormatter d_datum = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		DateTimeFormatter d_zeit = DateTimeFormatter.ofPattern("HH:mm:ss");
		// Beim Pattern ist es möglich auch Text zu setzen. Der Text muss dann in Hochkommata stehen
		DateTimeFormatter s_datum = DateTimeFormatter.ofPattern("'Der 'dd'. Tag im 'MMMM' im Jahr 'yy'.'");
		
		System.out.println(datum.format(d_datum));
		System.out.println(zeit.format(d_zeit));
		System.out.println(datum.format(s_datum));
	}
	
	public static void demoDateTimeFormatterLocale() {
		DateTimeFormatter de_datum = DateTimeFormatter.ofPattern("EEEE dd-MMMM-yyyy", Locale.GERMAN);
		DateTimeFormatter fr_datum = DateTimeFormatter.ofPattern("EEEE dd-MMMM-yyyy", Locale.FRENCH);
		DateTimeFormatter us_datum = DateTimeFormatter.ofPattern("EEEE dd-MMMM-yyyy", Locale.US);
		
		System.out.println("Deutsch: " + datum.format(de_datum));
		System.out.println("French: " + datum.format(fr_datum));
		System.out.println("USA: " + datum.format(us_datum));
	}
}
