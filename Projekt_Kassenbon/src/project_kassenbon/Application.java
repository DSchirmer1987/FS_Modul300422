package project_kassenbon;

import java.util.Arrays;

import project_kassenbon.controller.ConsoleController;
import project_kassenbon.controller.GUI_Controller;
import project_kassenbon.controller.GUI_ControllerSortiment;
import project_kassenbon.model.sortiment.Produkt;
import project_kassenbon.model.sortiment.Sortiment;
import project_kassenbon.model.sortiment.SortimentDateiSpeicher;
import project_kassenbon.model.sortiment.SortimentSim;

public class Application {

	public static void main(String[] args) {
//		ConsoleController cc = new ConsoleController();
//		GUI_Controller gc = new GUI_Controller();
		GUI_ControllerSortiment gcs = new GUI_ControllerSortiment();
//		SortimentSim sm = new SortimentSim();
//		Sortiment sort = new Sortiment(sm);
//		System.out.println(Arrays.toString(sm.getSortiment()));
//		sort.hinzufuegen(new Produkt("Buch", 5.99, 134));
//		System.out.println(Arrays.toString(sm.getSortiment()));
//		Sortiment sortDatei = new Sortiment(new SortimentDateiSpeicher("src/sortiment.csv"));
	}

}
