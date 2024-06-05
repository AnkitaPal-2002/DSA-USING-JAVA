package ChitChat;
/*
 * 5. Program in which client and server chats continuously until one disconnects. Anyone can break 
the communication.
(a) The following is a client program that connects to a server by using a socket, sends a message, 
and then waits for a response
 */

import java.util.*;
import java.net.*;
import java.io.*;


public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String msgtoserver, msgfromserver;
		
		Socket client = new Socket("127.0.0.2", 1350);
		
		System.out.println("The client with ip address "+client.getInetAddress()+" is communicating with port address "+client.getPort());
		
		System.out.println("Start chitchat. Type your message....");
		
		Scanner s1 = new Scanner(System.in);
		PrintStream p1 = new PrintStream(client.getOutputStream());
		Scanner s2 = new Scanner(client.getInputStream());
		
		while(true) {
			msgtoserver = s1.nextLine();
			p1.println(msgtoserver);
			msgfromserver = s2.nextLine();
			if(msgfromserver != null) {
				System.out.println(msgfromserver);
			}
			
			
			
		}

	}

}

/*
 * The client with ip address /127.0.0.2 is communicating with port address 1350
Start chitchat. Type your message....
Hi
Hello
My name is Ankita
I am server
How do i help u
he he
I am Uma
I am Ankita

The server reserves 1350
The server is ready fot chatting....
Hi
Hello
My name is Ankita
I am server
How do i help u
he he
I am Uma
I am Ankita


Server pls respond
yes 

 */
