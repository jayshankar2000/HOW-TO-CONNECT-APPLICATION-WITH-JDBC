package jdbc_ch2;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class GETBALANCE {
public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.oracledriver");
		Connection cn = DriverManager.getConnection("jdbc:oraclethin:@192.168.12.82:mefgi","mef190570107124","mef190570107124");
		CallableStatement cs= cn.prepareCall("{call GETBALANCE(?,?)}");
		cs.setInt(1,20);
		cs.registerOutParameter(2, Types.INTEGER);
		cs.execute();
		int balance=cs.getInt(2);
		System.out.println("balance:"+balance);
		cn.close();
	}catch(Exception e){
		e.printStackTrace();
		
	}
 }
}
