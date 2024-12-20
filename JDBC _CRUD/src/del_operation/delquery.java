package del_operation;

import java.sql.*;

public class delquery {

	public static void main(String[] args) {
		try {
			// edit this for deletion
			String t_name = "user"; 
			String whr_col = "userid";
			String whr_data = "ShrivastavShukla";
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/omdb11?useSSL=false","root","Vadher@2004");
			
			 PreparedStatement ps = conn.prepareStatement("delete from "+t_name+" where "+whr_col+" = '"+whr_data+"' ");
			 // add column name 
			 
			 // use executeUpdate with DML function
			 ps.executeUpdate();
			 System.out.println("Delete the data Successfully");
			
			
		}
		
		catch(Exception e){
			e.printStackTrace();	
		}

	}

}
