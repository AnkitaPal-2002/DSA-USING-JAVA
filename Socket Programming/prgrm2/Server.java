package prgrm2;
/*]
 * Server side
 * 
 * (b) The following server program listen for clients on a port, receives a greeting and sends back a 
response.
 */

import java.util.*;
import java.net.*;
import java.io.*;


public class Server {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String msgfromclient, msgtoclient="The server is responding...";
		
		//Create server socket
		ServerSocket server = new ServerSocket(1340);
		
		//Confirming servet port reservation
		System.out.println("The server reserves the port no "+server.getLocalPort());
		
		//Accepting client connection
		Socket client = server.accept();
		
		//Confirming client connection
		System.out.println("The client with ip address "+client.getInetAddress()+"is  connecting with port address"+client.getPort());
		
		//Receive msg from client
		Scanner s1 = new Scanner(client.getInputStream());
		msgfromclient = s1.nextLine();
		
		//Sending msg to client
		PrintStream p1 = new PrintStream(client.getOutputStream());
		p1.println(msgtoclient);
		
		
	}

}
