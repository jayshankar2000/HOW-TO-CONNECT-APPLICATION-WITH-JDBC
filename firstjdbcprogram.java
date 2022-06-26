package jdbc_ch2;

   import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class firstjdbcprogram {

	public static void main(String[] args) {
		
		
	try {   
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
					"mef190570107124","mef190570107124");
			Statement smt=con.createStatement();
			ResultSet rs = smt.executeQuery("select * from STUDENT1");
			while (rs.next()) {
				//System.out.println ("Name is : "+ rs.getString("NAME"));
				System.out.println(rs.getString(1) +"  "+ rs.getString(2)+"   "+rs.getString(3));
				
				}
			
			  smt.executeUpdate("INSERT INTO STUDENT1 VALUES(4,'JAY1','INDIA')");
			  smt.executeUpdate("UPDATE STUDENT1 SET name='jay2' where rollno =4");
			
			  smt.executeUpdate("DELETE FROM STUDENT1 WHERE rollno=1");
			  rs = smt.executeQuery("select * from STUDENT1");
			  System.out.println("------AFTER UPDATE--------");
			  
			  while (rs.next()) {
					//System.out.println ("Name is : "+ rs.getString("NAME"));
					System.out.println(rs.getString(1) +"  "+ rs.getString(2)+"   "+rs.getString(3));
					
					}
				
			  
				
			  con.close();
			
		}
	     catch(Exception e) {
			System.out.println("An error occur: " +e);
			
		}

	}

}
 