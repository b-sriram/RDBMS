package net.vsspl.db.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HsqlTest {
	private static final String	USERNAME = "root";
	private static final String	PASSWORD = "";
	private static final String	H_CONN_STRING = 
			"jdbc:hsqldb:data/explorecalifornia";
	
	public static void main(String[] args) throws SQLException {
			
		try (	
				Connection conn = DriverManager.getConnection(H_CONN_STRING, USERNAME, PASSWORD); 
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt.executeQuery("SELECT * FROM states");
			 ){
				rs.last();
				System.out.println("Number of Records: "+ rs.getRow());
			} catch (SQLException e) {
			System.out.println("DB Connection failed");
			System.err.println(e);
		} 

	}

}
