import java.util.Scanner;

class ex_2_10 {
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("姓：");			// 姓の入力を促す
		String sei = stdIn.next();			// seiに実数値を読み込む
		
		System.out.print("名：");			// 名の入力を促す
		String mei = stdIn.next();			// meiに実数値を読み込む
		
		System.out.println("こんにちは" + sei + mei + "さん。");
	}
}