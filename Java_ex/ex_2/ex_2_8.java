import java.util.Random;
import java.util.Scanner;


class ex_2_8 {
	
	public static void main(String args[]) {
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("整数値：");
		int x = stdIn.nextInt();			// xに整数値を読み込む
		
		int y = rand.nextInt(11) + -5;		// -5～5の値を生成
		
		System.out.println("その値の±5の乱数を生成しました。それは" + (x + y) + "です。");

	}
}