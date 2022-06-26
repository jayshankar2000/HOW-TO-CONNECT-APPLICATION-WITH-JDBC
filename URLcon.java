package jdbc_ch2;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
public class URLcon {
	public static void main(String[] args) throws IOException{
		URL obj = new URL("https://www.gtu.ac.in/");
		java.net.URLConnection
		 conn = obj.openConnection();
		int l = conn.getContentLength();
		System.out.println("length of content"+l);
		if(l==0) {
			System.out.println("content not found");
			return;
		}
		else {
			int ch;
			InputStream in = conn.getInputStream();
			while((ch=in.read())!=-1)
				System.out.print((char)ch);
		}
	}
	

}
