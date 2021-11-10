import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EasyWrite {

	public static void main(String[] args) {
		File file = new File("c:\\files\\log.txt");
		File newFile = new File("c:\\files\\log2.txt");
		
		try {
			FileWriter fw = new FileWriter(newFile);
			Scanner fileScanner = new Scanner(file);
			while(fileScanner.hasNext()) {
				String tempString = fileScanner.nextLine();
				System.out.println(tempString);
				fw.write(tempString + System.lineSeparator());
			}
			fileScanner.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
