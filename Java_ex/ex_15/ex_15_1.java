// 入力された文字列を逆順に表示する
import java.util.Scanner;

public class ex_15_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列を入力してください：");
		String s = stdIn.next();

		System.out.println("文字列を逆順に表示します");

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		stdIn.close();
	}
}
