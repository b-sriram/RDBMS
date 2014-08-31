package net.vsspl.db.tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;

public class Tours {
	public static void displayData ( ResultSet rs) throws SQLException{
		while(rs.next()){
			StringBuffer buffer = new StringBuffer();
			buffer.append("Tour "+ rs.getInt("tourId")+ ": ");
			buffer.append(rs.getString("tourName"));
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			String formattedPrice = nf.format(rs.getDouble("price"));
			buffer.append(" (" + formattedPrice + " )");
			
			System.out.println(buffer.toString());
		}
	}
}
