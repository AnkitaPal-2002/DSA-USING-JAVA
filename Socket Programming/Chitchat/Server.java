package ChitChat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.io.*;


public class Server {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String msgfromclient, msgtoclient;

		
		ServerSocket server = new ServerSocket(1350);
		
		System.out.println("The server reserves "+server.getLocalPort());
		
		Socket client = server.accept();
		
		System.out.println("The server is ready fot chatting....");
		
		Scanner s1 = new Scanner(client.getInputStream());
		Scanner s2 = new Scanner(System.in);
		PrintStream p1 = new PrintStream(client.getOutputStream());
		
		while(true) {
			msgfromclient = s1.nextLine();
			if(msgfromclient != null) {
				System.out.println(msgfromclient);
			}
			msgtoclient = s2.nextLine();
			p1.println(msgtoclient);
			
		}
		
		
	}

}
