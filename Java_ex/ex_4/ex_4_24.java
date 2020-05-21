import java.util.Scanner;

class ex_4_24 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("素数判定を行います。");
		
		do {
			System.out.print("正の整数値：");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int divisor = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				divisor++;
		}
		
		if (divisor == 2)  System.out.println("その値は素数です。");
		else               System.out.println("その値は素数ではありません。");
	}
}