package create_table;

import java.sql.*;

public class Table_create {

	public static void main(String[] args) {
		
		try {
			// add here columns 
			String t_name = "Employee";
			String C_1 = "E_id int";
			String C_2 = "E_name varchar(50)";
			String C_3 = "E_post varchar(50)";
			String C_4 = "E_city varchar(50)";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/omdb11?useSSL=false","root","Vadher@2004");
			
			String sql ="create table "+t_name+" ("+C_1+", "+C_2+", "+C_3+","+C_4+")";
			//add columns 
			Statement stmt = conn.createStatement();
			
			boolean result = stmt.execute(sql);
			System.out.println("Table has been Created!");
			conn.close();
		
		
		
		
		}
		
		
		
		catch(Exception ex) {
			System.out.println("Error : "+ ex.getMessage());		
		}
	}

}
