package prgrm4;
/*
 * 4. Program in which client sends a message to the server and in response the server echo that 
message back to the client

 */

import java.util.*;
import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Socket client = new Socket("127.0.0.1",1348);
		
		System.out.println("The client with port address "+client.getInetAddress()+" is communicating with port address "+client.getPort());
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Greeting to server");
		String msg = s1.nextLine();
		
		PrintStream p1 = new PrintStream(client.getOutputStream());
		p1.println(msg);
		
		Scanner s2 = new Scanner(client.getInputStream());
		String response = s2.nextLine();
		System.out.println("Response from the server is :");
		System.out.println(response);
		
		

	}

}

/*
 * The client with port address /127.0.0.1 is communicating with port address 1348
Greeting to server
hello
Response from the server is :
hello

 * 
 * 
 */
