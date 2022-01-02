package address;
import java.io.*;
import java.net.*;

public class address {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("-------------------------ENTER THE SITE AND SEE IP---------------------");
String site=in.readLine();
try {
	InetAddress ip=InetAddress.getByName(site);
	System.out.println("------>THE IP ADDRESS IS===>"+ip);
	
}
catch(Exception e) {
	System.out.println("----SORRY------!!!!!!website not found");
	
}
}

}
