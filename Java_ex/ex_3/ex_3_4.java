// 読み込んだ整数値の符号（正／負／０）を判定して表示

import java.util.Scanner;

class ex_3_4 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数値a：");
		double a = stdIn.nextDouble();
		
		System.out.print("実数値b：");
		double b = stdIn.nextDouble();
		
		if(a - b > 0)
			System.out.println("aの方が大きいです。");
		else if(a - b < 0)
			System.out.println("bの方が大きいです。");
		else
			System.out.println("aとbは同じ値です。");
	}
}