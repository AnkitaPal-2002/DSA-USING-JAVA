/*
 * Write a menu driven program to implement a singly linked list with the following
operations
a. Insert an element at any position (front, end or intermediate)
b. Delete an element from any position (front, end or intermediate)
c. Display the list
d. Perform a linear search on the list
e. Insert an element after a specified element
f. Delete a specified element
g. Count the number of nodes
h. Reverse the list, so that the last element becomes the first, and so on
i. Concatenate two lists

 */

package Linked_list;

import java.util.*;


class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedList{
	Node head = null;
	
	//Display the linked list
	void printLinkedList() {
		
		if(head == null) {
			System.out.println("The list is empty..");
		}else {
			System.out.println("The linked list is : ");
			Node curr = this.head;
			
			while(curr != null) {
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
			
			System.out.println();
		}
		
		
	}
	
	
	//Add the element at the end of the list
	void add(int e) {
		Node temp =  new Node(e);
		//If the list is empty
		if(head == null) { 
			head = temp;
		}else { // If the list is not empty
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			
			curr.next = temp;
		}
	}
	
	//Add element at the beginning of the list
	void addFirst(int e) {
		Node temp = new Node(e);
		
		//If the list is empty
		if(head == null) {
			head = temp;
		}
		
		//If the list is not empty
		else {
			temp.next = head;
			head = temp;
		}
	}
	
	//Add element using index
	void addatanyindex(int index, int e) {
		Node temp = new Node(e);
		
		if(head == null) {
			head = temp;
		}else if(index == 1) {
			this.addFirst(e);
		}else {
			int count = 1;
			 Node mover = head;
			 while(count != index - 1) {
				 mover = mover.next;
				 count++;
			 }
			 
			 Node curr = mover.next;
			 
			 temp.next = curr;
			 mover.next = temp;
		}
	}
	
	// Remove the first element 
		void removeFirst() {
			if(head == null) {
				System.out.println("The list is empty....");
			}else {
				Node curr = head;
				head = head.next;
				curr.next = null;
				System.out.println("The data of the deleted node is : "+curr.data);
			}
		}
		//Remove the last element
		void removeLast() {
			//Zero element
			if(head == null) {
				System.out.println("The list is empty..");
			}else if(head.next == null) {
				//If the list has only one element
				Node curr = head;
				head = null;
				System.out.println("The data of the deleted node is : "+curr.data);
				
			}else {
				//If the list has more than one elements
				Node curr = head;
				while(curr.next.next!=null) {
					curr = curr.next;
					
				}
				
				Node temp = curr.next;
				curr.next = null;
				System.out.println("The data of the deleted node is : "+temp.data);
			}
		}
		
		
		
		//Remove the element from the any position
		void removefromanypos(int index) {
			//if the list is empty
			if(head == null) {
				System.out.println("The list is empty");
			}else if(index == 1) {
				this.removeFirst();
			}else if(head.next == null) {
				System.out.println("The list has only 1 element...");
			}else {
				Node mover = head;
				int count = 1;
				while(count != index-1) {
					mover = mover.next;
					count++;
				}
				
				Node temp = mover.next;
				mover.next = temp.next;
				temp.next = null;
				System.out.println("The data of the deleted node is : "+temp.data);
				
			}
		}
	
		
		//linear search on linked list
		void linear_search(int key) {
			if(head == null) {
				System.out.println("The list is empty....");
			}else {
				int flag = 0;
				int index = 0;
				Node curr = head;
				for(int i=1;curr!=null;i++) {
					if(curr.data == key) {
						flag = 1;
						index = i;
					}
					curr = curr.next;
				}
				
				if(flag == 1)
					System.out.println(key+" is found at index "+index);
				else {
					System.out.println(key+" is not found....");
				}
			}
		}
		
		
		//insert an element after a specific element
		void insertafterelement(int key, int data) {
			Node newNode = new Node(data);
			boolean found = false;
			Node curr = head;
			
			while(curr!=null) {
				if(curr.data == key) {
					newNode.next = curr.next;
					curr.next = newNode;
					found =  true;
					break;
				}
				
				curr = curr.next;
			}
			
			if(!found) {
				System.out.println("Element "+key+" is not found in the list");
			}
		}
		
		//Delete a specified element
		void deleteElement(int key) {
			Node curr = head;
			boolean found = false;
			
			
			while(curr!=null) {
				if(curr.next.data == key) {
					Node temp = curr.next;
					curr.next = temp.next;
					temp.next = null;
					found = true;
					System.out.println(temp.data+" is deleted successfully....");
					break;
				}
				
				curr = curr.next;
				
				
			}
			
			if(!found) {
				System.out.println("Element "+key+" is not found");
			}
		}
		
		//Count the nodes of the linked list
		void count() {
			if(head == null) {
				System.out.println("The list is empty....");
			}else {
				Node mover = head;
				int c = 0;
				while(mover!=null) {
					c++;
					mover = mover.next;
				}
				
				System.out.println("Count of nodes : "+c);
			}
		}
		
		//Reverse the list
		void reverse() {
			Node prev = null;
			Node front = null;
			Node temp = head;
			while(temp!=null) {
				front =temp.next;
				temp.next = prev;
				prev = temp;
				temp = front;
			}
			
			head = prev;
		}
		
		
		// concatenate two lists
		void concatenate(LinkedList l2) {
			if(this.head == null && l2.head==null) {
				System.out.println("Two lists are empty");
			}else if(this.head==null) {
				this.head = l2.head;
				System.out.println("After concatenation");
				this.printLinkedList();
			}else if(l2.head == null) {
				System.out.println("After concatenation");
				this.printLinkedList();
			}else {
				Node temp = head;
				while(temp.next!=null) {
					temp = temp.next;
					
				}
				
				temp.next = l2.head;
				System.out.println("After concatenation");
				this.printLinkedList();
			}
}
		
}

public class Pdf5_qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l2.add(15);
		l2.add(20);
		l2.add(25);
		l2.add(30);
		l2.add(40);
		
		
		while(true) {
			System.out.println("****MENU****");
			System.out.println("1. Insert an element at beginning");
			System.out.println("2. Insert an element at end");
			System.out.println("3. Insert an element at any index");
			System.out.println("4. Delete the element from beginning");
			System.out.println("5. Delete element from the last");
			System.out.println("6. Delete element from any position");
			System.out.println("7. Display the linked list");
			System.out.println("8. Perform linear search on the list");
			System.out.println("9. Insert an node after a specific element");
			System.out.println("10. Delete a specified element");
			System.out.println("11. Count the no of nodes");
			System.out.println("12. Reverse the linked list");
			System.out.println("13. Concatenate two linked list");
			System.out.println("14. Exit");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1: System.out.println("Enter the element : ");
			        int e = sc.nextInt();
			        l1.addFirst(e);
			        l1.printLinkedList();
			        break;
			case 2: System.out.println("Enter the element : ");
			        e = sc.nextInt();
			        l1.add(e);
			        l1.printLinkedList();
			        break;
			case 3: System.out.println("Enter the element : ");
			        e = sc.nextInt();
			        System.out.println("Enter the position : ");
			        int pos = sc.nextInt();
			        l1.addatanyindex(pos, e);;
			        l1.printLinkedList();
			        break;
			case 4: l1.removeFirst();
					break;
			case 5: l1.removeLast();
					break;
			case 6: System.out.println("Enter the position : ");
			        pos = sc.nextInt();
			        l1.removefromanypos(pos);
			        break;
			case 7: l1.printLinkedList();
					break;
			case 8: System.out.println("Enter the element which you want to search : ");
			        int key = sc.nextInt();
			        l1.linear_search(key);
			        break;
			case 9: System.out.println("Enter the data of the specific element : ");
			        key = sc.nextInt();
			        System.out.println("Enter the data part of the new node : ");
			        int data = sc.nextInt();
			        l1.insertafterelement(key, data);
			        l1.printLinkedList();
			        break;
			case 10: System.out.println("Enter the data of the specific element : ");
	        		 key = sc.nextInt();
	        		 l1.deleteElement(key);
	        		 l1.printLinkedList();
	        		 break;
			case 11: l1.count();
					 break;
			case 12: l1.reverse();
					 System.out.println("After reversing the list is : ");
					 l1.printLinkedList();
					 break;
			case 13: l1.concatenate(l2);
					break;
			case 14:
				System.out.println("Thank you for using this program.....");
				System.exit(0);
			default : 
				System.out.println("Invalid input...Please enter valid input again!!!!!");
					
			
					 
			
			
			}
		}
}

}


/*Output

****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
1
Enter the element : 
10
The linked list is : 
10 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
2
Enter the element : 
20
The linked list is : 
10 20 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
2
Enter the element : 
30
The linked list is : 
10 20 30 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
2
Enter the element : 
40
The linked list is : 
10 20 30 40 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
4
The data of the deleted node is : 10
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
7
The linked list is : 
20 30 40 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
1
Enter the element : 
10
The linked list is : 
10 20 30 40 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
5
The data of the deleted node is : 40
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
7
The linked list is : 
10 20 30 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
1
Enter the element : 
40
The linked list is : 
40 10 20 30 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
1
Enter the element : 
50
The linked list is : 
50 40 10 20 30 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
6
Enter the position : 
2
The data of the deleted node is : 40
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
7
The linked list is : 
50 10 20 30 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
8
Enter the element which you want to search : 
40
40 is not found....
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
8
Enter the element which you want to search : 
10
10 is found at index 2
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
9
Enter the data of the specific element : 
10
Enter the data part of the new node : 
60
The linked list is : 
50 10 60 20 30 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
10
Enter the data of the specific element : 
20
20 is deleted successfully....
The linked list is : 
50 10 60 30 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
11
Count of nodes : 4
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
1
Enter the element : 
70
The linked list is : 
70 50 10 60 30 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
11
Count of nodes : 5
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
12
After reversing the list is : 
The linked list is : 
30 60 10 50 70 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
13
After concatenation
The linked list is : 
30 60 10 50 70 15 20 25 30 40 
****MENU****
1. Insert an element at beginning
2. Insert an element at end
3. Insert an element at any index
4. Delete the element from beginning
5. Delete element from the last
6. Delete element from any position
7. Display the linked list
8. Perform linear search on the list
9. Insert an node after a specific element
10. Delete a specified element
11. Count the no of nodes
12. Reverse the linked list
13. Concatenate two linked list
14. Exit
Enter your choice : 
14
Thank you for using this program.....

*/