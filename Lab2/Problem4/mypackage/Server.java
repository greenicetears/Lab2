package mypackage;
import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) throws IOException{
	ServerSocket ss = new ServerSocket(5000);
	Socket s = ss.accept();
	
	System.out.println("Client connected");
	
	InputStreamReader in = new InputStreamReader(s.getInputStream());
	BufferedReader bf = new BufferedReader(in);
	
	String str = bf.readLine();
	System.out.println("Client: " + str);
	
	OutputStream os = s.getOutputStream();
	PrintWriter pr = new PrintWriter(os);
	pr.println("Hello, Your data has been saved");
	pr.flush();
	}

}
