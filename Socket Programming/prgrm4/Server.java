package prgrm4;
/*
 * (b) The following server program listen for clients on a port, receives a message and echoes that 
message back to the client

 */

import java.util.*;
import java.util.*;
import java.io.*;
import java.net.*;


public class Server {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ServerSocket server = new ServerSocket(1348);
		
		System.out.println("The server reserves "+server.getLocalPort());
		
		Socket client = server.accept();
		
		Scanner s1 = new Scanner(client.getInputStream());
		String msg = s1.nextLine();
		
		PrintStream p1 = new PrintStream(client.getOutputStream());
		p1.println(msg);
	}

}
