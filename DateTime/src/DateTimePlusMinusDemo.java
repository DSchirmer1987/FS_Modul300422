import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTimePlusMinusDemo {
	public static void timePlus() {
		LocalTime jetzt = LocalTime.now();
		//plusHours, plusMinutes, plusSeconds, plusNanos
		System.out.println(jetzt + " bis: " + jetzt.plusHours(14));
	}
	
	public static void datePlus() {
		LocalDate heute = LocalDate.now();
		// plusDays, plusMonths, plusWeeks, plusDays
		System.out.println(heute + " bis: " + heute.plusDays(5));
	}
	
	public static void datetimePlus() {
		LocalDateTime heute = LocalDateTime.now();
		// Alles von time und date möglich
		System.out.println(heute + " bis: " + heute.plusHours(200));
	}
	
	public static void datePlusPeriod() {
		LocalDate heute = LocalDate.now();
		// Period = Zeiträume von Jahren, Tagen, Wochen oder tagen  - Nur für LocalDate oder LocalDateTime
		Period woche = Period.of(2, 3, 24);
		System.out.println(heute.plus(woche));
	}
	
	public static void timePlusDuration() {
		LocalTime jetzt = LocalTime.now();
		// Duration = Zeiträume kleiner als 1 tag - Nur für LocalTime oder LocalDateTime
		Duration mittagessen = Duration.ofHours(1);
		System.out.println(jetzt.plus(mittagessen));
	}
}
