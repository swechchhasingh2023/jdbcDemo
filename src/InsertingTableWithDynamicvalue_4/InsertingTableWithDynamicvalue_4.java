package InsertingTableWithDynamicvalue_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.io.*;


public class InsertingTableWithDynamicvalue_4 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/student","root", "India#639232");
			
		
			
			String q1 = "insert into table2(tName, tCity) VALUES (?, ?)";
			PreparedStatement pstmt = con.prepareStatement(q1);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name : ");
			String name = br.readLine();
			System.out.println("Enter city : ");
			String city = br.readLine();
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.executeUpdate();
			
			System.out.println("Table created");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
