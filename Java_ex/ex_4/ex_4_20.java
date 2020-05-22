import java.util.Scanner;

class ex_4_20 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("正方形を作ります。");
		
		do {
			System.out.print("段数：");
			n = stdIn.nextInt();
			
			if (n <= 0)
				System.out.println("正の整数を入力してください。");
		} while (n <= 0);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)  System.out.print("*");
			System.out.println();
		}
	}
}
		