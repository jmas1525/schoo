// 読み込んだ整数値の符号（正／負／０）を判定して表示

import java.util.Scanner;

class ex_3_11 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値A：");
		int A = stdIn.nextInt();
		
		System.out.print("整数値B：");
		int B = stdIn.nextInt();
		
		int difference = A > B ? A - B : B - A;
		
		System.out.println("それらの値の差は" + (difference <= 10 ? "10以下" : "11以上") + "です。");
	}
}