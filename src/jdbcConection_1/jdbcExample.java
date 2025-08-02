package jdbcConection_1;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcExample {
    public static void main(String[] args) {
    	try {
    		// step : 1 Register the driver
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
    		// Establish the connection
    		Connection con = DriverManager
    				.getConnection("jdbc:mysql://localhost:3306/student", "root", "India#639232");
    		System.out.println("Contection done");
    	    con.close();
    	}
    	catch(Exception e){
    		 e.printStackTrace();
    	}
    }
}
