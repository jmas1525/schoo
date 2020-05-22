import java.util.Scanner;
import java.util.Random;

class ex_6_10 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;
		
		do {
			System.out.print("配列の要素数(0で終了)：");
			n = stdIn.nextInt();
			if (n == 0)		System.exit(0);
			if (n < 0)		System.out.println("正の値を入力してください。");
		} while (n < 0);
		
		int[] a = new int[n];
		a[0] = rand.nextInt(10) + 1;
		
		for (int i = 1; i < n; i++) {
			do {
				a[i] = rand.nextInt(10) + 1;
			} while (a[i] == a[i - 1]);
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}