package ro.tutoriale3d.testmanager.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.ws.rs.PUT;
import javax.xml.ws.Response;

import ro.tutoriale3d.testmanager.core.*;

public class DBManager implements TestInterface{
	private static final String URL = "jdbc:mysql://localhost:3306/my_database";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final DBManager instance = new DBManager();
	private Connection conn;
	
	//private List<Test> testList = Collections.synchronizedList(new ArrayList<>());
	
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
	@Override
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
	@Override
	public List<Test> getTestList() {
		try (Statement st = conn.createStatement()) {
			
			List<Test> testList = new ArrayList<Test>();
			
			st.execute("select * from teste;");
			ResultSet rs = st.getResultSet();

			while (rs.next()) {
				
				Test test = new Test(rs.getInt("Nr_intrebare"),
					rs.getString("Enunt"), rs.getString("Rasp1"),
					rs.getString("Rasp2"),rs.getString("Rasp3"),rs.getString("Rasp4"),rs.getString("Solutie"));
				testList.add(test);
			}
			//st.close();
			return testList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean postTest(Test test) {
		// TODO Auto-generated method stub
		return false;
	}
	@PUT
    public Response<Test> putTest(List<Test> test) {
        //In this context having this method makes no sense, because usually one does not replace the entire book collection
        //return Response.status(Status.METHOD_NOT_ALLOWED).allow("GET", "POST").build();
		return null;
    }
	@Override
	public boolean deleteTest(Test test) {
		// TODO Auto-generated method stub
		return false;
	}

}