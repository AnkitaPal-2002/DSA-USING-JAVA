/*
 * 1. Write a program to implement a Queue class (use a list to store the elements of the
Queue). [Implement Queue Overflow and Underflow by Exception]. Write a
method to check two Queue are carrying similar elements or not. (Repetition of the
elements are not consider)
 */

package Pdf4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Queue<T>{
	private List<T> MyQueue;
	private Integer maxSize;
	
	public Queue (Integer maxSize){
		this.maxSize = maxSize;
		this.MyQueue = new ArrayList<T>();
	}
	
	public void enqueue(T element) throws Exception {
		if(this.maxSize == this.MyQueue.size()) {
			throw new Exception("Queue OverFlow");
		}
		this.MyQueue.add(element);
	}
	
	public void dequeue () throws Exception {
		if(this.MyQueue.isEmpty()) {
			throw new Exception("Queue UnderFlow");
		}
		this.MyQueue.remove(0);
	}
	
	public void displayQueue () {
		 for (T i : this.MyQueue) {
         	System.out.println(i);
         }
	}
	
	public boolean isSimilar(Queue<T> otherQueue) {
		Set<T> uniqueElements1 = new HashSet<T>(this.MyQueue);
		Set<T> uniqueElements2 = new HashSet<T>(otherQueue.MyQueue);

		// Check if all elements in queue1 are present in queue2
		return uniqueElements2.containsAll(uniqueElements1);
	}
}

public class Pdf4_qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue1 = new Queue<Integer>(5);
		Queue<Integer> queue2 = new Queue<Integer>(5);
		try {
			queue1.enqueue(1);
			queue1.enqueue(2);
			queue1.enqueue(3);

			queue2.enqueue(3);
			queue2.enqueue(1);
			queue2.enqueue(2);

//            queue1.displayQueue();

			System.out.println("Queue 1 is similar to Queue 2: " + queue1.isSimilar(queue2));

			queue1.dequeue();
			queue1.enqueue(4);

//            queue1.displayQueue();
			System.out.println("Queue 1 is similar to Queue 2: " + queue1.isSimilar(queue2));

		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}

	}

}

/*Output
 * 
 * 
 * Queue 1 is similar to Queue 2: true
Queue 1 is similar to Queue 2: false

 * 
 */
