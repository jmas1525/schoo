// 2020/05/04
// シャッフルのアルゴリズムを修正
// 交換する要素番号を2つランダムに選ぶのではなく、Fisher-Yatesの方法を使用する

import java.util.Scanner;
import java.util.Random;

class ex_6_12_r01 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;		// 配列の要素数 = 入れ替えの回数
		int x;
		int y;
		int t;
		
		do {
			System.out.print("配列の要素数(0で終了)：");
			n = stdIn.nextInt();
			if (n == 0)		System.exit(0);
			if (n < 0)		System.out.println("正の値を入力してください。");
		} while (n < 0);
		
		int[] a = new int[n];
		
		System.out.println("元の配列");
		for (int i = 0; i < n; i++) {
			a[i] = i;
			System.out.println("a[" + i +"] = " + a[i]);
		}
		
		System.out.println("シャッフル後の配列");
		for (int i = n - 1; i > 0; i--) {
			x = rand.nextInt(i + 1);
			
			t = a[x];
			a[x] = a[i];
			a[i] = t;
		}
		
		for (int i = 0; i < n; i++) System.out.println("a[" + i +"] = " + a[i]);
	}
}