import java.util.Scanner;

class ex_4_10 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();
		
		for (int i = 0; i < n; i++){
			System.out.print('*');
			if(i == n - 1)
				System.out.println();
		}
	}
}