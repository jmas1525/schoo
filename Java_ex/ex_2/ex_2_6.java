//三角形の面積を求める

import java.util.Scanner;

class ex_2_6 {
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("三角形の面積を求めます。");
		
		System.out.print("底辺：");			// xの値の入力を促す
		double x = stdIn.nextDouble();			// xに実数値を読み込む
		
		System.out.print("高さ：");			// yの値の入力を促す
		double y = stdIn.nextDouble();			// yに実数値を読み込む
		
		System.out.println("面積は" + x * y / 2 + "です。");
	}
}