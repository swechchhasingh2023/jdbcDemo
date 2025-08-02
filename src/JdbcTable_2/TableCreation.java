package JdbcTable_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class TableCreation {

	public static void main(String[] args) {
		
		try {
			// step -1 Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step -2 create connection
			String url = "jdbc:mysql://localhost:3306/student";
			String userName = "root";
			String password = "India#639232";
			Connection con = DriverManager
					.getConnection(url, userName, password);
			
			// step -3 create query
			String q = "create table table1(tId int(20) primary key auto_increment, tname varchar(200) not null, tCity varchar(400))";
			
			// step -4 create connection
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table created in database");
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
