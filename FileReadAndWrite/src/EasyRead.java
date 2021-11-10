import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EasyRead {

	public static void main(String[] args) {
		File file = new File("c:\\files\\log.txt");
		
		try {
			Scanner fileScanner = new Scanner(file);
			
			while(fileScanner.hasNext()) {
				System.out.println(fileScanner.nextLine());
			}
			
			fileScanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
