import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
	
	public static void LocalDateDemonstration() {
		LocalDate heute = LocalDate.now();
		//LocalDate.of(Jahr, Monat, Tag) - Jahr als 4-stellige Zahl
		LocalDate datum = LocalDate.of(87, 12, 26);
		LocalDate datum2 = LocalDate.of(1956, 4, 25);
		//LocalDate.of(Jahr, Monat, Tag) - Monat als Monat
		LocalDate datum3 = LocalDate.of(2021, Month.NOVEMBER, 18);
		
		System.out.println(heute);
		System.out.println(datum);
		System.out.println(datum2);
		System.out.println(datum3);
	}
}
