package project_kassenbon.model.sortiment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortimentDBSpeicher implements ISortimentSpeicher {
	private Connection db_conn;
	private Produkt[] sortiment;
	
	public SortimentDBSpeicher() {
		try {
			this.db_conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/kasse", "root", null);
			if(this.db_conn != null) {
				System.out.println("Connected to the Database");
			} else {
				System.out.println("Connection failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.sortiment = this.getDBData();
	}
	
	public Produkt[] getDBData() {
		String sql = "SELECT * FROM Produkt";
		List<Produkt> tmpList = new ArrayList<>();
		try {
			PreparedStatement query = this.db_conn.prepareStatement(sql);
			ResultSet result = query.executeQuery();
			while(result.next()) {
				String bezeichnung = result.getString("Bezeichnung");
				int id = result.getInt("ID");
				double preis = result.getDouble("Preis");
				tmpList.add(new Produkt(bezeichnung, preis, id));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tmpList.toArray(new Produkt[0]);
	}
	
	@Override
	public Produkt[] getSortiment() {
		return this.sortiment;
	}

	@Override
	public void sortimentSpeichern(Produkt[] sortiment) {
		
	}

	@Override
	public void produktHinzufuegen(Produkt produkt) {
		String sql = "INSERT INTO produkt (ID, Bezeichnung, Preis) VALUES (?,?,?)";
		try {
			PreparedStatement statement = this.db_conn.prepareStatement(sql);
			statement.setInt(1, produkt.getId());
			statement.setString(2, produkt.getBezeichnung());
			statement.setDouble(3, produkt.getPreis());
			int rowsAffected = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		List<Produkt> tmpList = new ArrayList<Produkt>(Arrays.asList(this.sortiment));
		tmpList.add(produkt);
		this.sortiment = tmpList.toArray(new Produkt[0]);
	}

	@Override
	public void produktAktualisieren(Produkt produkt) {
		String sql = "UPDATE Produkt SET Bezeichnung=?, Preis=? WHERE ID=?";
		try {
			PreparedStatement statement = this.db_conn.prepareStatement(sql);
			statement.setString(1, produkt.getBezeichnung());
			statement.setDouble(2, produkt.getPreis());
			statement.setInt(3, produkt.getId());
			int rowsAffected = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.sortiment = this.getDBData();
	}

	@Override
	public void produktEntfernen(Produkt produkt) {
		List<Produkt> tmpList = new ArrayList<Produkt>(Arrays.asList(this.sortiment));
		tmpList.add(produkt);
		this.sortiment = tmpList.toArray(new Produkt[0]);
		String sql = "DELETE FROM Produkt WHERE ID=?";
		try {
			PreparedStatement statement = this.db_conn.prepareStatement(sql);
			statement.setInt(1, produkt.getId());
			int row = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public int getLastId() {
		String sql = "SELECT MAX(ID) FROM Produkt";
		int lastID = 0;
		try {
			PreparedStatement query = this.db_conn.prepareStatement(sql);
			ResultSet result = query.executeQuery();
			while(result.next()) {
				lastID = result.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lastID;
	}

}
