// 読み込んだ整数値の符号（正／負／０）を判定して表示

import java.util.Scanner;

class ex_3_12 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int A = stdIn.nextInt();
		
		System.out.print("整数値：");
		int B = stdIn.nextInt();
		
		System.out.print("整数値：");
		int C = stdIn.nextInt();
		
		int min = A;
		if(min > B)    min = B;
		if(min > C)    min = C;
		
		System.out.println("最小値は" + min + "です。");
	}
}