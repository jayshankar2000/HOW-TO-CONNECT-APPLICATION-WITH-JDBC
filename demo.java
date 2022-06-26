

package jdbc_ch2;
import java.sql.*;

public class demo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
					"mef190570107124","mef190570107124");
			Statement smt=con.createStatement();
			ResultSet rs = smt.executeQuery("select * from STUDENT");
			while (rs.next()) {
				System.out.println("Name is : "+ rs.getString("SNAME"));
			}
		}catch(Exception e) {
			System.out.println("An error occur: " +e);
		}
	}
		
		// TODO Auto-generated method stub

	}
