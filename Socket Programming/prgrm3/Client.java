package Prgrm3;
/*
 * 3. Program in which client requests date and time on server, and in the response of the same server 
will give answer as current date and time on server.
(a) The following is a client program that connects to a server by using a socket, requests date and 
time on server.

 */

import java.util.*;
import java.net.*;
import java.io.*;

public class Client {
	public static void main(String[] args) throws Exception{
		
		String msgfromserver1;
		
		//Create client socket
		Socket client = new Socket("127.0.0.1", 1345);
		
		//To confirm the client is connecting with the port address
		System.out.println("The client with ip address "+client.getInetAddress()+" is communicating with the port address "+client.getLocalPort());
		
		//Receive msg from the server
		Scanner s2 = new Scanner(client.getInputStream());
		msgfromserver1 = s2.next();
		System.out.println("Message from the server is : ");
		System.out.println(" "+msgfromserver1);
	}

}
