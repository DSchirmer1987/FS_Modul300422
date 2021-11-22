import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		// Sets lassen keine doppelten Elemente zu.
		TreeSet<Integer> meinSet = new TreeSet<>();
		
		meinSet.add(5);
		meinSet.add(6);
		meinSet.add(42);
		meinSet.add(2+3);
		meinSet.add(5);
		System.out.println(meinSet);
		
		TreeSet<String> meineStrings = new TreeSet<>();
		meineStrings.add("Hallo");
		meineStrings.add("Hallo");
		System.out.println(meineStrings);
		
		// Maps - Schneller zugriff über den Schlüssel
		TreeMap<Integer, String> meineMap = new TreeMap<>();
		meineMap.put(123, "Hallo");
		meineMap.put(456, "Welt");
		meineMap.put(456,  "World");
		
		System.out.println(meineMap);
		// Bei Maps wird beim .get() der Key erwartet und nicht die Position
		System.out.println(meineMap.get(123));
	}

}
