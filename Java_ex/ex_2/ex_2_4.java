import java.util.Scanner;

class ex_2_4 {
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");			// xの値の入力を促す
		int x = stdIn.nextInt();			// xに整数値を読み込む
		
		System.out.println("10を加えた値は" + (x + 10) + "です。");
		System.out.println("10を減じた値は" + (x - 10) + "です。");
	}
}