import java.util.Scanner;

class ex_4_16 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����*��\�����܂����F");
		int n = stdIn.nextInt();
		
		for (int i = 0; i < n; i++){
			
			if(i != 0 && i % 5 == 0)
				System.out.println();
			
			System.out.print('*');
			
			if(i == n - 1)  
				System.out.println();
		}
	}
}