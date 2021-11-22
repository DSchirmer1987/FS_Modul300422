import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class DemoSorted {

	public static void main(String[] args) {
		SortedSet<Integer> zahlen = new TreeSet<>();
		zahlen.add(42);
		zahlen.add(66);
		zahlen.add(4);
		zahlen.add(25);	
		System.out.println(zahlen);
			
		SortedMap<Integer, String> zahlenMap = new TreeMap<>();
		zahlenMap.put(42, "Welt");
		zahlenMap.put(24, "Hallo");
		zahlenMap.put(78, "Java");
		System.out.println(zahlenMap);
		
		SortedSet<String> strings = new TreeSet<>();
		strings.add("Anna");
		strings.add("anna");
		strings.add("Christian");
		strings.add("Annika");
		System.out.println(strings);
		System.out.println("A = " + (int)'A');
		System.out.println("a = " + (int)'a');
	}

}
