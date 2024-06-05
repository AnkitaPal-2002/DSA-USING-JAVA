package Prgrm3;
/*
 * (b) The following server program listen for clients on a port, receives a request and sends back the 
current date and time on server.

 */

import java.util.*;
import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//Create server socket
		ServerSocket server = new ServerSocket(1345);
		
		System.out.println("The server reserve the port address "+server.getLocalPort());
		
		Socket client = server.accept();
		
		System.out.println("The client with ip address "+client.getInetAddress()+" is communicating with the port address "+client.getLocalPort());
		
		Date d = new Date();
		String s = "Current data and time on server is "+d;
		
		PrintStream p1 = new PrintStream(client.getOutputStream());
		p1.println(d);
		

	}

}
