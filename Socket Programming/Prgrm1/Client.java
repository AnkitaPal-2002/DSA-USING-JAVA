package Prgrm1;

/*
 * 1. Program to send an integer from the client to the server and return the modified integer from the 
server to the client
(a) The following is a client program that connects to a server by using a socket, sends an integer, 
and waits for a response.

 */

import java.net.Socket;
import java.io.PrintStream;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) throws Exception{
		int number, altered;
		
		//Create socket for client
		Socket client = new Socket("127.0.0.1", 1342);
		
		//To confirm client is communiucating through the port
		System.out.println("Client "+client.getInetAddress()+"is communicating with port no : "+client.getPort());
		
		//User input
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a no to the client : ");
		number = s1.nextInt();
		
		//sending data to the server
		PrintStream p1 = new PrintStream(client.getOutputStream());
		p1.println(number);
		
		//Receiving Data from the server
		Scanner s2 = new Scanner(client.getInputStream());
		altered = s2.nextInt();
		
		System.out.println("Number altered by the server is : "+altered);
		
		s1.close();
		p1.close();
		s2.close();
		
}

}
