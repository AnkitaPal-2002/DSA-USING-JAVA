package prgrm2;
/*
 * 2. Program to send a greeting from the client to the server and return a response from the server to 
the client

(a) The following is a client program that connects to a server by using a socket, sends a greeting, 
and then waits for a response.

 */

import java.util.*;
import java.io.*;
import java.net.*;


public class Client {
	public static void main(String[] args) throws Exception{
		
		String msgtoserver, msgfromserver;
		
		//create client socket
		Socket client = new Socket("127.0.0.1", 1340);
		
		//To confirm client is communicating through port
		System.out.println("The client with ip address "+client.getInetAddress()+" is communicatiig with port address + "+client.getPort());
		
		//Input from the user
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the msg to the client : ");
		msgtoserver = s1.nextLine();
		
		//Send msg to server
		PrintStream p1 = new PrintStream(client.getOutputStream());
		p1.println(msgtoserver);
		
		//System.out.println("Hello");
		
		//Receive msg from server
		Scanner s2 = new Scanner(client.getInputStream());
		msgfromserver = s2.nextLine();
		System.out.println("Msg from the server is : "+msgfromserver);
		
		
		
		
	}

}
