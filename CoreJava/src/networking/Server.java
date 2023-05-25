package networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class SocketServer {
	ServerSocket ss;
	Socket s;
	InputStream is;
	OutputStream os;
	BufferedReader brkey;
	BufferedReader dataclient;
	PrintWriter out;
	String clientdata,keydata;
	boolean check=true;
	SocketServer(){
		try {
			ss =new ServerSocket(9090);
			System.out.println("Lisening on port 9090");
			s =ss.accept();			
			if (s!=null) {
				System.out.println("Connected on port 9090");
				brkey=new BufferedReader(new InputStreamReader(System.in));
				dataclient=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out =new PrintWriter(s.getOutputStream(),true);
				while(check) {
					clientdata=dataclient.readLine();
					System.out.println("Client<<"+clientdata);
					keydata=brkey.readLine();
					out.println(keydata);
					if (clientdata.equalsIgnoreCase("bye")) {
						check=false;
					}
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class Server {
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new SocketServer();
	}

}
