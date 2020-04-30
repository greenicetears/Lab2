package mypackage;

public class Driver{
	
public static void main(String [] args){
	WebServices webservices = new WebServices(1, "Web Services", "Knowledge about Web Servicing", "IT");
	ComputerGraphics computergraphics = new ComputerGraphics(2, "Computer Graphics", "Learning Computer Graphics", "IT");
	SignalProcessing signalprocessing = new SignalProcessing(3, "Signal Processing", "Subject about python, and processing signals", "IT");

	System.out.print(webservices.getTitle());
	
}
}