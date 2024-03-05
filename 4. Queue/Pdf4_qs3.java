/*
 * 3. Write a menu driven program to implement a deque using list.
Call the two ends of the deque left and right and write four C functions, remvLeft,
remvRight, insrtLeft, insrtRight to remove and insert elements at the left and right
ends of the deque. Make sure that the routines work properly for empty deque and
that they detect overflow and underflow

 */
package Pdf4;
import java.util.ArrayList;
import java.util.Scanner;
class DeQue<T>{
	private ArrayList<T> deque;
	private int maxSize;
	
	public DeQue(int size){
		this.maxSize = size;
		this.deque = new ArrayList<T>();
	}
	
	public boolean isEmpty() {
		return this.deque.isEmpty();
	}
	
	public boolean isFull () {
		return this.deque.size() == this.maxSize;
	}
	
	public void insertAtLeft (T ele) {
		if(isFull()) {
			System.out.println("Deque overflow. Cannot insert at left end.");
		} else {
			this.deque.add(0, ele);
			 System.out.println("Inserted " + ele + " at left end.");
		}
	}
	
	public void insertAtRight (T ele) {
		if (isFull()) {
            System.out.println("Deque overflow. Cannot insert at right end.");
        } else {
            this.deque.add(ele);
            System.out.println("Inserted " + ele + " at right end.");
        }
	}
	
	public void removeAtLeft () {
		if (isEmpty()) {
            System.out.println("Deque underflow. Cannot remove from left end.");
        } else {
            T removed = this.deque.remove(0);
            System.out.println("Removed " + removed + " from left end.");
        }
	}
	
	public void removeAtRight () {
		if(isEmpty()) {
			System.out.println("Deque is underflow. Cannot remove from right");
		} else {
			T removedElement = this.deque.remove(this.deque.size()-1);
			System.out.println("Removed "+ removedElement + " from right end.");
		}
	}
	
	 public void display() {
	        if (isEmpty()) {
	            System.out.println("Deque is empty.");
	        } else {
	            System.out.println("Deque elements:");
	            for (T data : this.deque) {
	                System.out.print(data + " ");
	            }
	            System.out.println();
	        }
	    }
}	

public class Pdf4_qs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the deque: ");
		int size = scanner.nextInt();
		DeQue<Integer> deque = new DeQue<Integer>(size);

		int choice;
		do {
			System.out.println("\nDeque Operations:");
			System.out.println("1. Insert at left");
			System.out.println("2. Insert at right");
			System.out.println("3. Remove from left");
			System.out.println("4. Remove from right");
			System.out.println("5. Display");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter element to insert at left: ");
				int leftData = scanner.nextInt();
				deque.insertAtLeft(leftData);
				break;
			case 2:
				System.out.print("Enter element to insert at right: ");
				int rightData = scanner.nextInt();
				deque.insertAtRight(rightData);
				break;
			case 3:
				deque.removeAtLeft();
				break;
			case 4:
				deque.removeAtRight();
				break;
			case 5:
				deque.display();
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		} while (choice != 6);
		scanner.close();

	}

}

/*
 * Output
 * Enter the size of the deque: 5

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 1
Enter element to insert at left: 5
Inserted 5 at left end.

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 1
Enter element to insert at left: 78
Inserted 78 at left end.

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 5
Deque elements:
78 5 

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 2
Enter element to insert at right: 99
Inserted 99 at right end.

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 5
Deque elements:
78 5 99 

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 2
Enter element to insert at right: 66
Inserted 66 at right end.

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 4
Removed 66 from right end.

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 5
Deque elements:
78 5 99 

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 3
Removed 78 from left end.

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 4
Removed 99 from right end.

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 5
Deque elements:
5 

Deque Operations:
1. Insert at left
2. Insert at right
3. Remove from left
4. Remove from right
5. Display
6. Exit
Enter your choice: 6
Exiting...
 */
