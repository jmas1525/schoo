// 読み込んだ整数値の符号（正／負／０）を判定して表示

import java.util.Scanner;

class ex_3_9 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数値：");
		double a = stdIn.nextDouble();
		
		System.out.print("実数値：");
		double b = stdIn.nextDouble();
		
		System.out.println("大きいほうの値は" + (a > b ? a : b) + "です。");
	}
}