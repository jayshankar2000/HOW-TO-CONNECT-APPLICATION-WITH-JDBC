package jdbc_ch2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PStatement2_insert {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn= DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
					"mef190570107124","mef190570107124");
			//PreparedStatement pst = cn.prepareStatement("select * from employee");
			PreparedStatement   pst = cn.prepareStatement("select * from employee where dept= ?");
			pst.setString(1,"CE");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				//System.out.println ("Name is : "+ rs.getString("NAME"));
				System.out.println(rs.getString(1) +"  "+ rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4));
				
			}
			PreparedStatement pst1 = cn.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?)");
			
			cn.close();
			pst1.setInt(1, 5);
			pst1.setString(2, "Tejas");
			pst1.setString(3, "IT");
			pst1.setInt(4, 25000);
		}
	     catch(Exception e) {
		System.out.println("An error occur: " +e);

  }
		
		
	
		
		
		
}
	

}


