import java.util.Scanner;

class ex_4_23 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("ピラミッドを表示します。");
		System.out.print("段数は：");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + i - 1; j++) {
				
				if (j <= n - i)  System.out.print(" ");
				else         System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}