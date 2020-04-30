package mypackage;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Client {

	public static void main(String[] args) throws IOException
	{
	System.out.println("Enter Your name: ");
	Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();
	System.out.println("Enter Your Surname: ");
	String surname = scan.nextLine();
	System.out.println("Enter Your age: ");
	int age = scan.nextInt();
	User u = new User(name, surname, age);
	
	Socket s = new Socket("localhost", 5000);	
	PrintWriter pr = new PrintWriter(s.getOutputStream());
	pr.println(u);
	pr.flush();

	
	InputStreamReader in = new InputStreamReader(s.getInputStream());
	BufferedReader bf = new BufferedReader(in); 
	
	String str = bf.readLine();
	System.out.println("Server: " + str);
	}

}
