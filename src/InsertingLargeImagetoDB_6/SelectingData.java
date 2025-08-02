package InsertingLargeImagetoDB_6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectingData {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionProvide_6.getConnection();
			String query = "select * from table2";
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(query);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);
				System.out.println(id + " : " + name + " : " + city);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
