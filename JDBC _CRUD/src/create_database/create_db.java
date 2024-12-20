package create_database;
import java.sql.*;


public class create_db {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String db_name = "Ser_om";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false","root","Vadher@2004");
			Statement stm = conn.createStatement();
			
			
			String query = "create database "+db_name+"";
			stm.execute(query);
			System.out.println("Created Database Successfully");
			
			conn.close();
			
		}
		catch(Exception e) {
			
			System.out.println("Error : "+ e.getMessage());
			
		}
	}

}
