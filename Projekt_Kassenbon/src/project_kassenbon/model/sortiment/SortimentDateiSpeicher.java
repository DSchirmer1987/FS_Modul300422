package project_kassenbon.model.sortiment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortimentDateiSpeicher implements ISortimentSpeicher {
	private Produkt[] sortiment;
	private File file;
	
	public SortimentDateiSpeicher(String file) {
		List<Produkt> tmpList = new ArrayList<Produkt>();
		BufferedReader br;
		this.file = new File(file);
		try {
			// Prüfen ob die Datei schon existiert.  
			//File.createNewFile() gibt ein boolean zurück - 
			//True wenn die Datei erstellt worden ist, False wenn die Datei schon vorhanden ist
			if(this.file.createNewFile()) {
				br = new BufferedReader(new FileReader(this.file));
			} else {
				br = new BufferedReader(new FileReader(file));
			}
			String line;
			while(( line  = br.readLine()) != null) {
				// Aufsplitten der gelesenen Zeile anhand des Zeichen und erstellen eines Arrays.
				String[] values = line.split(";");
				int id = Integer.parseInt(values[0]);
				double preis = Double.parseDouble(values[2]);
				tmpList.add(new Produkt(values[1], preis, id));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.sortiment = tmpList.toArray(new Produkt[0]);
	}
	
	@Override
	public Produkt[] getSortiment() {
		return this.sortiment;
	}
	
	/**
	 * Schreibt das gesamte Sortiment in die CSV-Datei.
	 */
	@Override
	public void sortimentSpeichern(Produkt[] sortiment) {
		try {
			FileWriter fw = new FileWriter(this.file);
			// Für jedes Produkt eine Zeile
			for (Produkt produkt : sortiment) {
				fw.append(String.valueOf(produkt.getId()));
				fw.append(";");
				fw.append(produkt.getBezeichnung());
				fw.append(";");
				fw.append(String.valueOf(produkt.getPreis()));
				fw.append(System.lineSeparator());
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void produktHinzufuegen(Produkt produkt) {
		List<Produkt> tmpList = new ArrayList<Produkt>(Arrays.asList(this.sortiment));
		tmpList.add(produkt);
		this.sortiment = tmpList.toArray(new Produkt[0]);
		this.sortimentSpeichern(this.sortiment);
	}

	@Override
	public void produktAktualisieren(Produkt produkt) {

	}

	@Override
	public void produktEntfernen(Produkt produkt) {
		List<Produkt> tmpList = new ArrayList<Produkt>(Arrays.asList(this.sortiment));
		tmpList.remove(produkt);
		this.sortiment = tmpList.toArray(new Produkt[0]);
		this.sortimentSpeichern(this.sortiment);
	}

	@Override
	public int getLastId() {
		int lastId = 0;
		for (Produkt produkt : sortiment) {
			if(lastId < produkt.getId()) {
				lastId = produkt.getId();
			}
		}
		return lastId + 1;
	}

}
