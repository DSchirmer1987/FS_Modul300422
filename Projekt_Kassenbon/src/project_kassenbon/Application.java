package project_kassenbon;

import java.util.ArrayList;

import project_kassenbon.model.Kassenbon;
import project_kassenbon.model.KassenbonEintrag;

public class Application {

	public static void main(String[] args) {
		Kassenbon kb = new Kassenbon();
		System.out.println(kb.getFormattedLaden());
		
	}

}
