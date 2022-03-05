package mydocsapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtils {
	
//	public void updateOnMYSQL() 
	private static final String URL="jdbc:mysql://localhost:3306/assesment";
	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, "root", "rajputaman3");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}