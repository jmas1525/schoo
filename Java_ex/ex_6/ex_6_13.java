// 配列の全要素を逆順にコピーして表示

import java.util.Scanner;

class ex_6_13 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		//  配列の要素数の入力
		do {
			System.out.print("配列の要素数(0で終了)：");
			n = stdIn.nextInt();
			if (n == 0)		System.exit(0);
			if (n < 0)		System.out.println("正の値を入力してください。");
		} while (n < 0);
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		System.out.println("各要素の値(整数)を入力してください。");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i +"] = ");
			a[i] = stdIn.nextInt();
		}
		
		for (int i = 0; i < n; i++)
			b[n - i - 1] = a[i];
		
		System.out.println("\naの全要素をbに逆順でコピーしました。");
		
		for (int i = 0; i < n; i++)
			System.out.println("b[" + i +"] = " + b[i]);
	}
}