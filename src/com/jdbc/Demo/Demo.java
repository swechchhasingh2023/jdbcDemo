//1. import ---> java.sql
//2. load and register the driver --> com.mysql.jdbc.Driver
//3. Create connection --> Connection
//4. create a statement ---> Statement
//5. execute the query ->
//6. process the results -›
//7. close


//package com.jdbc.Demo;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class Demo {
//
//	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager
//			.getConnection("jdbc:mysql://localhost:3306/student", "root", "India#639232");
//			Statement stmt = con.createStatement();
//			String q = "SELECT * from table2";
//			ResultSet set = stmt.executeQuery(q);
//			while(set.next()) {
//				int id = set.getInt(1);
//				String name = set.getString(2);
//				String city = set.getString(3);
//				System.out.println(id + " " + name + " " +city);	
//			}
//			stmt.close();
//			con.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//}

//package com.jdbc.Demo;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//class Demo{
//	public static void main(String args[]) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager
//			.getConnection("jdbc:mysql://localhost:3306/student", "root", "India#639232");
//			Statement stmt = con.createStatement();
//			String q= "insert into table2(tName, tCity) values('Ritesh', 'kanpur')";
//			stmt.executeUpdate(q);
//			System.out.println("Inserted");
//			con.close();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

//package com.jdbc.Demo;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//
//class Demo{
//	public static void main(String args[]) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.
//			getConnection("jdbc:mysql://localhost:3306/student", "root", "India#639232");
//			String q = "insert into table2(tName, tCity) VALUES (?,?)";
//			PreparedStatement pstmt = con.prepareStatement(q);
//			pstmt.setString(1, "TestName123");
//			pstmt.setString(2, "TestCity456");
//			pstmt.executeUpdate();
//			System.out.println("Inserted");
//			con.close();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//}


//package com.jdbc.Demo;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//
//class Demo{
//	public static void main(String args[]) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.
//			getConnection("jdbc:mysql://localhost:3306/student", "root", "India#639232");
//			String q = "insert into table2(tName, tCity) VALUES (?,?)";
//			PreparedStatement pstmt = con.prepareStatement(q);
//			pstmt.setString(1, "TestName123");
//			pstmt.setString(2, "TestCity456");
//			pstmt.executeUpdate();
//			System.out.println("Inserted");
//			con.close();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//}