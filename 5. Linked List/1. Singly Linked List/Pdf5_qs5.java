/*
 * Write a program to implement a queue using linked list, such that the operations
‘enqueue’ and ‘dequeue’ are performed in constant time.

 */

package Linked_list;
import java.util.*;
class Queue{
	Node front = null;
	Node rear = null;
	
	//Enqueue operation
	void enqueue(int data) {
		Node newNode = new Node(data);
		if(front == null && rear == null) {
			front = rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		
		System.out.println("Element "+data+" is inserted successfully....");
	}
	
	//Dequeue operation
	void dequeue() {
		if(front == null && rear == null) {
			System.out.println("the queue is empty....");
		}else {
			Node temp = front;
			front = front.next;
			temp.next = null;
			System.out.println("the deleted element is : "+temp.data);
		}
	}
	
	//Display the queue
	void display() {
		if(front == null && rear==null) {
			System.out.println("Queue is empty....");
		}else {
			Node temp = front;
			System.out.println("The queue is : ");
			while(temp!=null) {
				System.out.print("|_"+temp.data+"_|");
				temp=temp.next;
			}
			System.out.println();
		}
	}
}

public class Pdf5_qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue();
		while(true) {
			System.out.println("Queue operations :");
			System.out.println("****MENU****");
			System.out.println("1. ENQUEUE");
			System.out.println("2. DEQUEUE");
			System.out.println("3. DISPLAY");
			System.out.println("4. EXIT");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter the element : ");
				int data = sc.nextInt();
				q.enqueue(data);
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				q.display();
				break;
			case 4:
				System.out.println("Thank you for using this programme....");
				System.exit(0);
			default:
				System.out.println("Invalid choice....");
			}
			
		}
		
		

	}

}

/*Output
 * Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
1
Enter the element : 
10
Element 10 is inserted successfully....
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
1
Enter the element : 
20
Element 20 is inserted successfully....
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
3
The queue is : 
|_10_||_20_|
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
1
Enter the element : 
30
Element 30 is inserted successfully....
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
3
The queue is : 
|_10_||_20_||_30_|
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
1
Enter the element : 
40
Element 40 is inserted successfully....
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
3
The queue is : 
|_10_||_20_||_30_||_40_|
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
2
the deleted element is : 10
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
3
The queue is : 
|_20_||_30_||_40_|
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
2
the deleted element is : 20
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
3
The queue is : 
|_30_||_40_|
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
3
The queue is : 
|_30_||_40_|
Queue operations :
****MENU****
1. ENQUEUE
2. DEQUEUE
3. DISPLAY
4. EXIT
Enter your choice : 
4
Thank you for using this programme....

 */
