package selectQuery;
import java.sql.*;

public class selectQuery1 {

	public static void main(String[] args) {
		try {
			
			String table_name = "user"; 
			// edit student name
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/omdb11?","root","Vadher@2004");
			Statement st = conn.createStatement();
			
			//also use execute()
			ResultSet rst = st.executeQuery("select * from "+table_name+" ");
			System.out.println("Emp_Id \t\t Emp_name \t\t Dept_no ");
			System.out.println("------------------------------------------------------------------");
			while(rst.next()) {
				System.out.println(rst.getString(1) + "\t" + rst.getString(2)+ "\t" );
				
				// changes on this line (add column)
			}
			conn.close();
		}
		
		catch(Exception e){
			e.printStackTrace();	
		}
		

	}

}
