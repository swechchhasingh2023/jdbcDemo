package InsertingLargeImagetoDB_6;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvide_6 {
	private static Connection con;
	
	public static Connection getConnection() {
		try {
		if(con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/student", "root", "India#639232");	
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	

}
