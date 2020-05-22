import java.util.Scanner;

class ex_4_3 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”AF");
		int A = stdIn.nextInt();
		
		System.out.print("®”BF");
		int B = stdIn.nextInt();
		
		if(A > B){
			int t = A;
			A = B;
			B = t;
		}
		
		do {
			System.out.print(A + " ");
			A += 1;
		} while (A <= B);
		
	}
}