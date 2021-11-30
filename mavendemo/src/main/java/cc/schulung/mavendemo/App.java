package cc.schulung.mavendemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		try {
			Connection db_conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/kasse", "root", null);
			if (db_conn != null) {
				System.out.println("Connected to the Database");
			} else {
				System.out.println("Connection failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
