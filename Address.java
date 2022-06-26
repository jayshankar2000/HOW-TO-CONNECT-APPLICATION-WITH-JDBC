package jdbc_ch2;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {
	public static void main(String[] args) throws IOException {
		try {
			InetAddress ip = InetAddress.getByName("www.google.com");
			System.out.println("the host Address is"+ ip.getHostAddress());
			System.out.println("the host Name is"+ ip.getHostName());
			
   }  
		catch(UnknownHostException ue) {
		 System.out.println("website not found");
	}
	 
	}
	

}
