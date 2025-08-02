package InsertingImagetoDB_5;
import java.sql.*;
import java.io.*;
public class InsertingImagetoDB_5 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/student", "root", "India#639232");
			String q = "insert into images(pic) values(?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			FileInputStream fis = new FileInputStream("/Users/swechchhasingh/Downloads/flower-with-laptop-bg.jpeg");
			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.executeUpdate();
			System.out.println("done...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
