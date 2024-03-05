/*
 * 2. Write a menu driven program to implement a circular queue (use an array to store
the elements of the queue).
You can follow any one of the schemes A circular list with front and rear indices and
one position left vacant. Or, A circular list with front and rear indices and an integer
variable counting entries.

 */

package Pdf4;
import java.util.*;
class CircularQueue{
	private int maxsize;
	private int front;
	private int rear;
	private int[] queuearr;
	private int itemCount;
	CircularQueue(int size){
		this.maxsize = size;
		this.front = -1;
		this.rear = -1;
		this.queuearr = new int[maxsize];
		this.itemCount = 0;
	}
	
	public void enqueue(int x) {
		if(front == -1 && rear == -1) {
			front = rear = 0;
			this.queuearr[rear] = x;
			this.itemCount++;
		}else if(((rear+1) % maxsize)==front){
			System.out.println("Queue is full..");
		}else {
			rear = (rear+1)%maxsize;
			queuearr[rear] = x;
			this.itemCount++;
		}
	}
	
	public void dequeue() {
		if(front == -1 && rear==-1) {
			System.out.println("Queue is empty..");
		}else if(front == rear) {
			int x = queuearr[front];
			front = rear = -1;
			System.out.println("Deleted element is : "+x);
			this.itemCount--;
		}else {
			int x = queuearr[front];
			System.out.println("Deleted element is : "+x);
			front = (front+1) % maxsize;
			this.itemCount--;
		}
	}
	
	public void display() {
		int i = front;
		if(front == -1 & rear == -1) {
			System.out.println("Queue is empty..");
		}else {
			System.out.println("Queue is : ");
			while(i!= rear) {
				System.out.print(queuearr[i]+" ");
				i = (i+1) % maxsize;
			}
			System.out.println(queuearr[rear]);
		}
	}
	
}
public class Pdf4_qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maxsize of the queue : ");
		int size = sc.nextInt();
		CircularQueue queue = new CircularQueue(size);
		while(true) {
			System.out.println("Circular queue operations : ");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter the element which you want to insert : ");
			 		int x = sc.nextInt();
			 		queue.enqueue(x);
			 		break;
			case 2: queue.dequeue();
					break;
			case 3: queue.display();
					break;
			case 4: System.out.println("Thank you for using this programme.....");
			 		System.exit(0);
			default : System.out.println("Invalid choice ......");
			}
			
		}
		

	}

}



/*Output:

Enter the maxsize of the queue : 
5
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
1
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
2
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
3
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
4
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
5
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
6
Queue is full..
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
3
Queue is : 
1 2 3 4 5
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
2
Deleted element is : 1
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
3
Queue is : 
2 3 4 5
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
2
Deleted element is : 2
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
3
Queue is : 
3 4 5
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
6
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
3
Queue is : 
3 4 5 6
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
7
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
3
Queue is : 
3 4 5 6 7
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
8
Queue is full..
Circular queue operations : 
1. Enqueue
2. Dequeue
3. Display
4. Exit
Enter your choice : 
4
Thank you for using this programme.....
*/