package update_operation;

import java.sql.*;

public class update_query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// edit this for insertion in table
			String t_name = "employee"; 
			String upd_col = "E_post";
			String upd_data = "Director";
			String whr_col = "E_id";
			int whr_data = 2511;
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/omdb11?useSSL=false","root","Vadher@2004");
			
			 PreparedStatement ps = conn.prepareStatement("update "+t_name+" set "+upd_col+" = '"+upd_data+"' where "+whr_col+" = '"+whr_data+"' ");
			 // add column name 
			 
			 // use executeUpdate with DML function
			 ps.executeUpdate();
			 System.out.println("Data Updated Successfully");
			 
			 
			
			
		}
		
		catch(Exception e){
			e.printStackTrace();	
		}
	}

}
