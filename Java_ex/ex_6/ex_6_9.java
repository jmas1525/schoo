import java.util.Scanner;
import java.util.Random;

class ex_6_9 {
	
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
		
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10) + 1;
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}