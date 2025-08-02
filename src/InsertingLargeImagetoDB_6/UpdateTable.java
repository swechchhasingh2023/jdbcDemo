package InsertingLargeImagetoDB_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateTable {

	public static void main(String[] args) {
		try {
		Connection con = ConnectionProvide_6.getConnection();
//		String q = "update table2 set tName=? tCity=? where tId=?";
		String q = "UPDATE table2 SET tName=?, tCity=? WHERE tId=?";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name : ");
		String name = br.readLine();
		
		System.out.println("Enter your city : ");
		String city = br.readLine();
		
		System.out.println("Enter your student id : ");
		int id =Integer.parseInt(br.readLine());
		
		PreparedStatement pstmt = con.prepareStatement(q);
		
		pstmt.setString(1, name);
		pstmt.setString(2, city);
		pstmt.setInt(3, id);
		pstmt.executeUpdate();
		System.out.println("Done............");
		con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
