package jdbc_ch2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CollableSt {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn= DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
					"mef190570107124","mef190570107124");

			CallableStatement cs = cn.prepareCall("{call inserData(?,?,?)}");
			cs.setInt(1, 69);
			cs.setString(2,"demoEntry");
			cs.setString(3,"demo Address");
			cs.execute();
			cn.close();
		}
	     catch(Exception e) {
		System.out.println("An error occur: " +e);

 }
		
	}

}
