// 読み込んだ整数値の符号（正／負／０）を判定して表示

import java.util.Scanner;

class ex_3_10 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int a = stdIn.nextInt();
		
		System.out.print("整数値：");
		int b = stdIn.nextInt();
		
		System.out.println("それらの値の差は" + (a > b ? a - b : b - a) + "です。");
	}
}