/*
 * 1. Write a menu driven program to implement a doubly linked list with the following
operations
a. Insert an element at any position (front, end or intermediate)
b. Delete an element from any position (front, end or intermediate)
c. Display the list
 */

package DLL;

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

class DoublyLinkedList{
	Node head = null;
	
	
	//Display the linked list
	void printlinkedlist() {
		if(head == null) {
			System.out.println("List is empty....");
		}else {
			Node curr = head;
			System.out.println("The list is : ");
			while(curr!=null) {
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
			
			System.out.println();
		}
	}
	
	//Add element at the end
	void add(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			
			this.printlinkedlist();
		}else {
			Node curr = head;
			while(curr.next!=null) {
				curr = curr.next;
			}
			
			curr.next = newNode;
			newNode.prev = curr;
			
			this.printlinkedlist();
			
		}
	}
	
	//Add element at the beginning
		void addFirst(int data) {
			Node newNode = new Node(data);
			
			if(head == null) {
				head = newNode;
				this.printlinkedlist();
			}else {
				newNode.next = head;
				head.prev = newNode;
				head = newNode;
				this.printlinkedlist();
			}
		}
		
		
		//Add element at any position
		void addatanypos(int index, int data) {
			Node temp = new Node(data);
			
			if(head == null) {
				head = temp;
				this.printlinkedlist();
			}else if(index == 1) {
				this.addFirst(data);
			}else {
				Node curr = head;
				int count = 1;
				while(curr!=null) {
					if(count == index-1) {
						temp.next = curr.next;
						temp.prev = curr;
						temp.prev.next = temp;
						temp.next.prev = temp;
						this.printlinkedlist();
						break;
					}
					
					count++;
					curr = curr.next;
				}
			}
		}
		
		//Remove the element from the beginning
		void removeFirst() {
			if(head == null) {
				System.out.println("List is empty....");
			}else {
				Node temp = head;
				head = head.next;
				head.prev = null;
				temp.next = null;
				System.out.println("Deleted element is : "+temp.data);
			}
		}
		
		//Remove the element from the end
		void removeLast() {
			if(head == null) {
				System.out.println("List is empty....");
			}else {
				Node curr = head;
				while(curr.next!= null) {
					curr = curr.next;
				}
				
				Node temp = curr;
				temp.prev.next = null;
				curr.prev = null;
				System.out.println("Deleted element is : "+temp.data);
			}
		}
		
		
		// Remove element from any index
					void removefromanypos(int index) {
						int count = 1;
						if(head == null) {
							System.out.println("List is empty");
						}else if(index == 1){
							this.removeFirst();
						}
						else {
							Node curr = head;
							while(curr!=null) {
								if(count == index-1) {
									Node temp = curr.next;
									curr.next = temp.next;
									temp.next.prev = curr;
									temp.prev = null;
									temp.next = null;
									System.out.println("Deleted element is : "+temp.data);
								}
								
								count++;
								curr = curr.next;
							}
						}
					}
	
}

public class Pdf5_qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList l1 = new DoublyLinkedList();
		
		while(true) {
			System.out.println("Doubly Linked List Operations");
			System.out.println("****MENU****");
			System.out.println("1. Insert element at the beginning");
			System.out.println("2. Insert element at the end");
			System.out.println("3. Insert element at any position");
			System.out.println("4. Delete element from beginning");
			System.out.println("5. Delete element from end");
			System.out.println("6. Delete element from any position");
			System.out.println("7. Display the list");
			System.out.println("8. Exit");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter the element which you want to insert : ");
				int data = sc.nextInt();
				l1.addFirst(data);
				break;
				
			case 2:
				System.out.println("Enter the element which you want to insert : ");
				data = sc.nextInt();
				l1.add(data);
				break;
			case 3:
				System.out.println("Enter the value of index : ");
				int index = sc.nextInt();
				System.out.println("Enter the data :");
				data = sc.nextInt();
				l1.addatanypos(index, data);
				break;
			case 4:
				l1.removeFirst();
				break;
			case 5:
				l1.removeLast();
				break;
			case 6:
				System.out.println("Enter the value of the index : ");
				int pos =  sc.nextInt();
				l1.removefromanypos(pos);
				break;
			case 7:
				l1.printlinkedlist();
				break;
			case 8:
				System.out.println("Thank you for using this program....");
				System.exit(0);
			default : 
				System.out.println("Invalid choice!!!!");
			}
			
		}

	}

}


/*
Output:

Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
10
The list is : 
10 
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
20
The list is : 
20 10 
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
30
The list is : 
30 20 10 
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
1
Enter the element which you want to insert : 
40
The list is : 
40 30 20 10 
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
3
Enter the value of index : 
3
Enter the data :
50
The list is : 
40 30 50 20 10 
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
4
Deleted element is : 40
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
5
Deleted element is : 10
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
7
The list is : 
30 50 20 
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
2
Enter the element which you want to insert : 
40
The list is : 
30 50 20 40 
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
2
Enter the element which you want to insert : 
60
The list is : 
30 50 20 40 60 
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 

6
Enter the value of the index : 
4
Deleted element is : 40
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
7
The list is : 
30 50 20 60 
Doubly Linked List Operations
****MENU****
1. Insert element at the beginning
2. Insert element at the end
3. Insert element at any position
4. Delete element from beginning
5. Delete element from end
6. Delete element from any position
7. Display the list
8. Exit
Enter your choice : 
8
Thank you for using this program....


*/