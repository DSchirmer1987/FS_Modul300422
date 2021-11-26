package schirmer.jdbc_demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {
	private Connection db_conn;
	private String db_server;
	private String db_database;
	private String db_host;
	
	public Database(String server, String host, String database, String user, String pw) {
		/*
		 * JDBC String aufbauen
		 * Schema: jdbc:servertyp://ip/database
		 * Beispiel: jdbc:mariadb://127.0.0.1/test
		 */
		String jdbc = "jdbc:" + server + "://" + host + "/" + database;
		try {
			/*
			 * Aufbau der Datenbankverbindung über den DriverManager
			 * DriverManager lädt den korrekten Treiber und stellt die Verbindung her
			 */
			this.db_conn = DriverManager.getConnection(jdbc, user, pw);
			if(this.db_conn != null) {
				System.out.println("Connected to the Database");
			} else {
				System.out.println("Connection failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Employee[] getEmployees() {
		String sql = "SELECT * FROM employees";
		List<Employee> tmpList = new ArrayList<>();
		/*
		 * PreparedStatement = Vorbereinigtes SQL-Statement um SQL-Injection zu erschweren oder zu verhindern
		 * ResultSet = Speichern der Antwort von dem DB-Server
		 */
		PreparedStatement query;
		ResultSet result;
		try {
			// Erstellen des Statements
			query = this.db_conn.prepareStatement(sql);
			// Senden und Ausführen des Befehles
			result = query.executeQuery();
			
			// Durchlaufen durch das ResultSet
			while(result.next()) {
				// ResultSet.getDatatype(spalte) = Gibt aus dem Resultset die Spalte in den gegeben Datentypen aus
				// Beispiel result.getInt("employee_id") = Gibt die employee_id als Integer aus.
				int employee_id = result.getInt("employee_id");
				String first_name = result.getString("first_name");
				String last_name = result.getString("last_name");
				double salaray = result.getDouble("salary");
				// Hinzufügen zu einer List mit new Employee als Eintrag
				tmpList.add(new Employee(employee_id, first_name, last_name, salaray));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Umwandeln der List in ein Array und zurückgeben.
		return tmpList.toArray(new Employee[0]);
	}
	
	public void insertEmployee(Employee employee) {
		String sql = "INSERT INTO employees (employee_id, first_name, last_name, email, hire_date, job_id, salary) VALUES(?,?,?,?,?,?,?)";
		try {
			PreparedStatement statement = this.db_conn.prepareStatement(sql);
			// Befüllen der einzelnen Werte s.h. sql-String die Fragezeichen
			statement.setInt(1, employee.getEmployee_id());
			statement.setString(2, employee.getFirst_name());
			statement.setString(3, employee.getLast_name());
			statement.setString(4, "EMAIL");
			statement.setDate(5, new Date(System.currentTimeMillis()));
			statement.setString(6, "AC_ACCOUNT");
			statement.setDouble(7, employee.getSalary());
			
			// Anzahl der betroffenen Zeilen - Bei Insert sollte das 1 oder die Menge der eingefügten Daten sein.
			int rowsAffected = statement.executeUpdate();
			
			System.out.println("Rows Affected: " + rowsAffected);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
