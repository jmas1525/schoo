// 読み込んだ整数値の符号（正／負／０）を判定して表示

import java.util.Scanner;

class ex_3_5 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("正の整数値：");
		int n = stdIn.nextInt();
		
		if(n <= 0)
			System.out.println("正でない値が入力されました。");
		else if(n % 5 == 0)
			System.out.println("その値は5で割り切れます。");
		else
			System.out.println("その値は5で割り切れません。");
	}
}