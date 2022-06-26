package jdbc_ch2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransManag {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn= DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
					"mef190570107124","mef190570107124");
			cn.setAutoCommit(false);
			PreparedStatement ps = cn.prepareStatement("update BANK set BALANCE  =BALANCE+? where ACCNO = ? ");
			ps.setInt(1, 5000);
			ps.setInt(2,13);
			int i =ps.executeUpdate();
			
			ps.setInt(1, -5000);
			ps.setInt(2,12);
			int j=ps.executeUpdate();
			
			if(i==1 && j==1) {
				cn.commit();
				System.out.println("TRANSFER SUCCESSFULLY");
			}else {
				cn.rollback();
				System.out.println("CANT BE TRANSFER");
			}
		}
		catch(Exception e) {
			System.out.println("An error occur");
			
			e.printStackTrace();	
		}

	}

}
