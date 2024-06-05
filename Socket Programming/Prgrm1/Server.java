package Prgrm1;
/*
 * (b) The following server program listen for clients on a port, receives an integer, modifies it and 
sends it back to the client

 */

import java.util.*;
import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//Create server socket
		ServerSocket server = new ServerSocket(1342);
		
		//confirming server port reservation
		System.out.println("The server has reserved port no "+server.getLocalPort());
		
		//Accepting client connection
		Socket client = server.accept();
		
		//Confirming client connection
		System.out.println("The client with ip address "+client.getInetAddress()+"connecting with "+client.getPort());
		
		//reading data from client
		Scanner s1 = new Scanner(client.getInputStream());
		int number = s1.nextInt();
		number = number *2;
		
		//sending data to client
		PrintStream p1 = new PrintStream(client.getOutputStream());
		p1.println(number);
		

	}

}
