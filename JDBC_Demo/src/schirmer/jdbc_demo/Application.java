package schirmer.jdbc_demo;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		Database database = new Database("mariadb", "127.0.0.1:3306", "hr", "root", null);
		System.out.println(Arrays.toString(database.getEmployees()));
		Employee emp1 = new Employee(988, "Paul", "Mustermann", 19000.00);
		database.insertEmployee(emp1);
	}
}
