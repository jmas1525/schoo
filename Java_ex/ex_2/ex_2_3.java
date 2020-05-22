import java.util.Scanner;

class ex_2_3 {
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("");
		
		System.out.print("整数値：");			// xの値の入力を促す
		int x = stdIn.nextInt();			// xに整数値を読み込む
		
		System.out.println( x + "と入力しましたね。");
	}
}