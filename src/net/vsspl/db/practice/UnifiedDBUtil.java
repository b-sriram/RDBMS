package net.vsspl.db.practice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import net.vsspl.db.tables.Tours;

public class UnifiedDBUtil {
	
	
	public static void main(String[] args) throws SQLException {
				
		try ( 
				Connection conn = DBUtil.getConnection(DBType.HSQL);
				//Connection conn = DBUtil.getConnection(DBType.MYSQL);
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt.executeQuery("SELECT * FROM tours");
			){	
				
//				rs.last();
//				System.out.println("Number of Records: "+ rs.getRow());
				Tours.displayData(rs);
				
		} catch (SQLException e) {
			System.out.println("DB Connection failed");
			System.err.println(e);
		} 

	}

}
