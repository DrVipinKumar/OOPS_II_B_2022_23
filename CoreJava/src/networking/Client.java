package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

class ClientSocket {
	Socket s;
	InputStream is;
	OutputStream os;
	BufferedReader brkey;
	BufferedReader dataserver;
	PrintWriter out;
	String serverdata,keydata;
	boolean check=true;
	ClientSocket(){
		try {
			s =new Socket(InetAddress.getLocalHost(),9090);
		//	s =new Socket("10.123.45.23",9090);
			if (s!=null) {
				System.out.println("Connected on port 9090");
				brkey=new BufferedReader(new InputStreamReader(System.in));
				dataserver=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out =new PrintWriter(s.getOutputStream(),true);
				while(check) {
					keydata=brkey.readLine();
					out.println(keydata);
					serverdata=dataserver.readLine();
					System.out.println("Server>>"+serverdata);					
					if (serverdata.equalsIgnoreCase("bye")) {
						check=false;
					}
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new ClientSocket();
	}

}
