package net.vsspl.db.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UnifiedDBUtil {
	
	
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;		
		try {	
				conn = DBUtil.getConnection(DBType.HSQL);
				//conn = DBUtil.getConnection(DBType.MYSQL);
				stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				rs = stmt.executeQuery("SELECT * FROM states");
			 
				rs.last();
				System.out.println("Number of Records: "+ rs.getRow());
			
		} catch (SQLException e) {
			System.out.println("DB Connection failed");
			System.err.println(e);
		} finally {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}

	}

}
