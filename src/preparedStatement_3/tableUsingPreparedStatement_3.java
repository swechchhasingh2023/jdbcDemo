package preparedStatement_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class tableUsingPreparedStatement_3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/student", "root", "India#639232");
			
			// create query
			String q = "insert into table1(tName, tCity) VALUES(?, ?)";
			
			// get the PreparedStatement object
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// set the value to query
			pstmt.setString(1, "Abhi");
			pstmt.setString(2, "Odia");
			pstmt.executeUpdate();
			System.out.println("Inserted");
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
