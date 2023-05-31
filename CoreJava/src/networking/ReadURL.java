package networking;
import java.net.*;
import java.io.*;
public class ReadURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data=null;
		try {
			URL url =new URL("https://gmail.com/");
			URLConnection urlcon=url.openConnection();
			BufferedReader br =new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 // try {
//			  System.out.println("Local host address");
//			InetAddress ip=InetAddress.getLocalHost();
//			System.out.println(ip.getHostAddress());
//			System.out.println("Google host address");
//			InetAddress ipout=InetAddress.getByName("google.com");
//			System.out.println(ipout.getHostAddress());
//			System.out.println("Yahoo All host address");
//			InetAddress ipall[]=InetAddress.getAllByName("yahoo.com");
//			for(InetAddress a:ipall) {
//				System.out.println(a);
//			}
//			
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		  
		}
}
