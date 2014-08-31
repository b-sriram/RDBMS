import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MysqlTest {
	private static final String	USERNAME = "root";
	private static final String	PASSWORD = "";
	private static final String	CONN_STRING = 
			"jdbc:mysql://localhost/explorecalifornia";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			System.out.println("DB Connected");
		} catch (SQLException e) {
			System.out.println("DB Connection failed");
			System.err.println(e);
		}

	}

}
