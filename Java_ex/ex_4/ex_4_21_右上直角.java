import java.util.Scanner;

class ex_4_21_右上直角 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("右上直角の三角形を表示します。");
		System.out.print("段数は：");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				
				if (j <= i - 1)  System.out.print(" ");
				else         System.out.print('*');
			}
			System.out.println();
		}
	}
}