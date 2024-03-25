
public class Pdf6_qs1 {
	
	public static void towerOfHanoi(int n, char src,char aux, char dest) {
		if(n == 1) {
			System.out.println(src+" -> "+dest);
			return;
		}
		towerOfHanoi(n-1, src, dest, aux);
		towerOfHanoi(1, src, aux, dest);
		towerOfHanoi(n-1, aux, src, dest);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Solution of Tower of Hanoi when disk = 3");
		towerOfHanoi(3, 'A', 'B', 'C');
		System.out.println("Solution of Tower of Hanoi when disk = 4");
		towerOfHanoi(4, 'A', 'B', 'C');

	}

}

/*
 * Output
 * 
 * Solution of Tower of Hanoi when disk = 3
A -> C
A -> B
C -> B
A -> C
B -> A
B -> C
A -> C
Solution of Tower of Hanoi when disk = 4
A -> B
A -> C
B -> C
A -> B
C -> A
C -> B
A -> B
A -> C
B -> C
B -> A
C -> A
B -> C
A -> B
A -> C
B -> C

 * **/
