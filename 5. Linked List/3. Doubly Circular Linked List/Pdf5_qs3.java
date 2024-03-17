/*
 * 2. Write a menu driven program to implement a doubly circular linked list with the
following operations
a. Insert an element at any position (front, end or intermediate)
b. Delete an element from any position (front, end or intermediate)
c. Display the list
 */

package DCL;

import java.util.*;




class Node{
	int data;
	Node prev;
	Node next;
	
	Node(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

class DoublyCircularLinkedList{
	Node head = null;
	Node tail = null;
	int count = 0;
	
	//Display the list
	void display() {
		if(head == null) {
			System.out.println("The list is empty....");
		}else {
			Node temp = head;
			System.out.println("The list is : ");
			while(temp!=tail) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println(temp.data);
			
		}
	}
	
	//Add the element at the end
	void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			head.next = head;
			head.prev = head;
			
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			newNode.next = head;
			head.prev = newNode;
			tail = newNode;
		}
		
		count++;
		this.display();
	}
	
	//Add element at the beginning
	void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
			newNode.prev = head;
			newNode.next = head;
		}else {
			newNode.next = head;
			newNode.prev = tail;
			head.prev = newNode;
			tail.next = newNode;
			head = newNode;
		}
		
		count++;
		this.display();
	}
	
	//Add element at any position
		void addatanypos(int index, int data) {
			if(index<1 || index>count) {
				System.out.println("Invalid position");
			}else if(index == 1){
				this.addFirst(data);
			}else {
				Node newNode = new Node(data);
				int i = 1;
				Node temp = head;
				while(i<index-1) {
					temp = temp.next;
					i++;
					
				}
				
				newNode.prev = temp;
				newNode.next = temp.next;
				temp.next.prev = newNode;
				temp.next = newNode;
				count++;
			}
		}
		
		//Delete from beginning
		void removeFirst() {
			if(head == null) {
				System.out.println("The list is empty....");
			}else {
				Node temp = head;
				temp.next.prev = tail;
				tail.next = head.next;
				head = temp.next;
				temp.next = null;
				temp.prev = null;
				System.out.println("The deleted element is : "+temp.data);
				count--;
			}
		}
		
		//Delete from end
		void removeEnd() {
			if(head == null) {
				System.out.println("The list is empty....");
			}else {
				Node temp = head;
				while(temp!=tail) {
					temp = temp.next;
				}
				
				temp.prev.next = head;
				head.prev = temp.prev;
				tail = head.prev;
				System.out.println("The deleted element is : "+temp.data);
				count--;
			}
		}
		
		//delete from any position
		void removefromanypos(int index) {
			if(index<1 || index>count) {
				System.out.println("Invalid position....");
			}else if(index == 1) {
				this.removeFirst();
			}else if(index == count) {
				this.removeEnd();
			}
			else {
				Node temp =  head;
				int i = 1;
				if(i<index-1) {
					temp =  temp.next;
					i++;
					
				}
				//System.out.println(count);
				Node curr = temp.next;
				temp.next= curr.next;
				curr.next.prev = temp;
				curr.next=null;
				curr.prev=null;
				count--;
				System.out.println("Deleted element is : "+curr.data);
			}
		}
}

public class Pdf5_qs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DoublyCircularLinkedList l1 = new DoublyCircularLinkedList();
		
		while(true) {
			System.out.println("Doubly Circular Linked List Operations :");
			System.out.println("****MENU****");
			System.out.println("1. Insert the element at the beginning ");
			System.out.println("2. Insert the element at the end");
			System.out.println("3. Insert the element at any position");
			System.out.println("4. Delete element from beginning");
			System.out.println("5. Delete element from end");
			System.out.println("6. Delete element from any position");
			System.out.println("7. Display the list");
			System.out.println("8. Exit");
			
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter the element : ");
				int data =  sc.nextInt();
				l1.addFirst(data);
				break;
			case 2:
				System.out.println("Enter the element : ");
				data =  sc.nextInt();
				l1.add(data);
				break;
			case 3:
				System.out.println("Enter the position in which you want to insert the element : ");
				int pos = sc.nextInt();
				System.out.println("Enter the element : ");
				data =  sc.nextInt();
				l1.addatanypos(pos, data);
				break;
			case 4:
				l1.removeFirst();
				break;
			case 5:
				l1.removeEnd();
				break;
			case 6:
				System.out.println("Enter the value of the index : ");
				pos = sc.nextInt();
				l1.removefromanypos(pos);
				break;
			case 7:
				l1.display();
				break;
			case 8:
				System.out.println("Thank you for using this program....");
				System.exit(0);
			default:
				System.out.println("Invalid input.....");
			}
			
		}
	}

}


/*Output
 * 
 * Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
1
Enter the element : 
10
The list is : 
10
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
1
Enter the element : 
20
The list is : 
20 10
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
2
Enter the element : 
30
The list is : 
20 10 30
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
2
Enter the element : 
40
The list is : 
20 10 30 40
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
2
Enter the element : 
50
The list is : 
20 10 30 40 50
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
3
Enter the position in which you want to insert the element : 
60
Enter the element : 
60
Invalid position
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
3
Enter the position in which you want to insert the element : 
3
Enter the element : 
60
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
7
The list is : 
20 10 60 30 40 50
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
4
The deleted element is : 20
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
5
The deleted element is : 50
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
7
The list is : 
10 60 30 40
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
6
Enter the value of the index : 
2
Deleted element is : 60
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
7
The list is : 
10 30 40
Doubly Circular Linked List Operations :
****MENU****
1. Insert the element at the beginning 
2. Insert the element at the end
3. Insert the element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
8
Thank you for using this program....

 */
