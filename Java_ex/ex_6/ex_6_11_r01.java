// 1～10の値をランダムな順に入れ替える。というのはex6-11でやるので、この問題はそれ以外の方法で

import java.util.Scanner;
import java.util.Random;

class ex_6_11_r01 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;
		
		do {
			System.out.print("10以下の配列の要素数(0で終了)：");
			n = stdIn.nextInt();
			if (n == 0)		System.exit(0);
			if (n < 0 || n > 10)		System.out.println("10以下の正の値を入力してください。");
		} while (n < 0 || n > 10);
		
		int[] a = new int[n];
		int j;
		int check;			//以前の要素に被りがあるかの判定。被りあり = 0、なし = 1

		for (int i = 0; i < n; i++) {
			
			do {
				a[i] = rand.nextInt(10) + 1;	// 配列にランダムな値を代入する。
				check = 1;
				j = 0;
				//　被りチェックのループ。被りありの場合はcheck = 0に更新。
				while (j < i) {
					if (a[j] == a[i]) {
						check = 0;
						break;
					}
					j++;
				}
				
			} while (check == 0);	// 被りがなくなるまで繰り返す。（要素数がたったの10だからこんなことができる）
			
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}