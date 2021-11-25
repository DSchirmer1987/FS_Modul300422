package project_kassenbon;

import java.util.Arrays;

import project_kassenbon.controller.ConsoleController;
import project_kassenbon.controller.GUI_Controller;
import project_kassenbon.model.sortiment.Sortiment;
import project_kassenbon.model.sortiment.SortimentSim;

public class Application {

	public static void main(String[] args) {
//		ConsoleController cc = new ConsoleController();
//		GUI_Controller gc = new GUI_Controller();
		SortimentSim sm = new SortimentSim();
		Sortiment sort = new Sortiment(sm);
		System.out.println(Arrays.toString(sm.getSortiment()));
	}

}
