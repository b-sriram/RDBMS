package net.vsspl.db.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBUtil {
	private static final String	USERNAME = "root";
	private static final String	PASSWORD = "";
	private static final String	H_CONN_STRING = 
			"jdbc:hsqldb:data/explorecalifornia";
	private static final String	M_CONN_STRING = 
			"jdbc:mysql://localhost/explorecalifornia";
	
	public static Connection getConnection(DBType dbType)throws SQLException {
		
		switch (dbType) {
		case MYSQL:
			return DriverManager.getConnection(M_CONN_STRING, USERNAME, PASSWORD);
		case HSQL:
			return DriverManager.getConnection(H_CONN_STRING, USERNAME, PASSWORD);  
		default:
			return null;
		}
	}
}
