package insert_operations;
import java.sql.*;
import java.util.*;

public class Insert_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String t_name = "user";
		String userid,password;
		//int ;
		
		//String userid = "Om Dave";
		//String password = "Proffessor";
		//String E_city = "Vadodara";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter UserId: ");
		userid = sc.nextLine();
		System.out.print("Enter password : ");
		password = sc.nextLine();
		System.out.print("\n\n");
//		System.out.print("Enter Employee post : ");
//		E_post = sc.next();
//		System.out.print("Enter Employee city : ");
//		E_city = sc.next();
		
		Connection conn = null;
		
		
				try {
					
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/omdb11?useSSL=false","root","Vadher@2004");
					
					 PreparedStatement ps = conn.prepareStatement("insert into "+t_name+" values(?,?)");
					 
					 //set the value to each parameters
					 //ps.setInt(1, E_id);
					 ps.setString(1,userid);
					 ps.setString(2,password);
					 //ps.setString(4,E_city);
					 
					 
					// use executeUpdate with DML function
					int i = ps.executeUpdate();
					 
					 if(i>0) {
						 System.out.println("inserted Successfully\n\n");
						 ResultSet rst = ps.executeQuery("select * from "+t_name+" ");
						 System.out.println("UserId \t\t Password ");
						 System.out.println("------------------------------------------------------------------");
							while(rst.next()) {
								System.out.println(rst.getString(1) + "\t" + rst.getString(2));
								
								// changes on this line (add column)
							}
						 
					 }
					 else {
						 System.out.println("Inserted Failed");				 
					 }
					 conn.close();
					
				}
				
				catch(Exception e){
					e.printStackTrace();	
				}

			}

		

	}


