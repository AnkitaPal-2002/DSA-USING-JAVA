/*
 * 1. Write a program to implement a stack using linked list, such that the operations ‘push’
and ‘pop’ are performed in constant time.
 */

package Linked_list;
import java.util.*;
class Stack{
	Node top = null;
	
	//Display the stack
		void display() {
			
			if(top == null) {
				System.out.println("The stack is empty..");
			}else {
				System.out.println("The stack is : ");
				System.out.println();
				Node curr = this.top;
				
				while(curr != null) {
					System.out.println(" |_"+curr.data+"_|");
					curr = curr.next;
				}
				
				
			}
			
			
		}
		
		//push operation
		void push(int e) {
			Node temp = new Node(e);
			
			//If the list is empty
			if(top == null) {
				top = temp;
			}
			
			//If the list is not empty
			else {
				temp.next = top;
				top = temp;
			}
			
			System.out.println("Element "+e+" is added successfully...");
		}
		
		//pop operation
		void pop() {
			if(top == null) {
				System.out.println("The stack is empty....");
			}else {
				Node curr = top;
				top = top.next;
				curr.next = null;
				System.out.println("The deleted element is : "+curr.data);
			}
		}
}
public class Pdf5_qs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();
		while(true) {
			System.out.println("Stack operations : ");
			System.out.println("****MENU****");
			System.out.println("1. Push an element");
			System.out.println("2. Pop an element");
			System.out.println("3. Display the stack");
			System.out.println("4. Exit");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the element : ");
				int e = sc.nextInt();
				st.push(e);
				break;
			case 2:
				st.pop();
				break;
			case 3:
				st.display();
				break;
			case 4:
				System.out.println("thank you for using this program....");
				System.exit(0);
			default:
				System.out.println("Invalid choice....");
			}
		}

	}

}

/*
 * Output
 * Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
3
The stack is empty..
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
1
Enter the element : 
1
Element 1 is added successfully...
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
1
Enter the element : 
2
Element 2 is added successfully...
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
1
Enter the element : 
3
Element 3 is added successfully...
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
3
The stack is : 

 |_3_|
 |_2_|
 |_1_|
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
2
The deleted element is : 3
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
3
The stack is : 

 |_2_|
 |_1_|
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
2
The deleted element is : 2
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
3
The stack is : 

 |_1_|
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
2
The deleted element is : 1
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
3
The stack is empty..
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
2
The stack is empty....
Stack operations : 
****MENU****
1. Push an element
2. Pop an element
3. Display the stack
4. Exit
Enter your choice : 
4
thank you for using this program....

 */
