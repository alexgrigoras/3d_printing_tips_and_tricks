package tutorials3d.webservices.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tutorials3d.webservices.core.Tutorial;
import tutorials3d.webservices.core.Utilizator;

public class DBManager {
	private static final String URL = "jdbc:mysql://localhost:3306/my_database";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final DBManager instance = new DBManager();
	private Connection conn;
	
	public static DBManager getInstance() {
		return instance;
	}
	private DBManager() {
		System.out.println("Loading driver...");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException(
					"Cannot find the driver in the classpath!", e);
		}
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<Utilizator> getUtilizatorList() {
		try (Statement st = conn.createStatement()) {
			
			List<Utilizator> utilizatorList = new ArrayList<Utilizator>();
			
			st.execute("select * from utilizator;");
			ResultSet rs = st.getResultSet();
			
			while (rs.next()) {
				
				Utilizator utilizator = new Utilizator(rs.getInt("ID"),
					rs.getString("Nume_utilizator"), rs.getString("Email"),
					rs.getString("Parola"));
				utilizatorList.add(utilizator);
			}
			// st.close();
			return utilizatorList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Tutorial> getTestList() {
		try (Statement st = conn.createStatement()) {
			
			List<Tutorial> tutorialList = new ArrayList<Tutorial>();
			
			st.execute("select * from teste;");
			ResultSet rs = st.getResultSet();

			while (rs.next()) {
				
				Tutorial tutorial = new Tutorial(rs.getInt("Nr_intrebare"),
					rs.getString("Enunt"), rs.getString("Rasp1"),
					rs.getString("Rasp2"),rs.getString("Rasp3"),rs.getString("Rasp4"),rs.getString("Solutie"));
				tutorialList.add(tutorial);
			}
			// st.close();
			return tutorialList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}