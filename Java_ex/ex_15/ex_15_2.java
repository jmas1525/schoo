// 入力された文字列の全文字の文字コードを表示する
import java.util.Scanner;

public class ex_15_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列を入力してください：");
		String s = stdIn.next();

		System.out.println("全文字の文字コード(16進数)を表示します");

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + " ： " + Integer.toHexString(s.charAt(i)));
		}
		System.out.println();
		stdIn.close();
	}
}
