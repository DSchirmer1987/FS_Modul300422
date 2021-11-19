package project_kassenbon;

import project_kassenbon.model.Kassenbon;

public class Application {

	public static void main(String[] args) {
		Kassenbon kb = new Kassenbon();
		System.out.println(kb.getFormattedLaden());
	}

}
