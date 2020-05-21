// 入力のためのメソッド群
// 予想外の値が入力された場合に再入力させる

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	static Scanner stdIn = new Scanner(System.in);

	// 整数nはa以上b以下の値か？
	static boolean isValid(int n, int a, int b) {
		return n >= a && n <= b;
	}

	static int inputInt(int min, int max) {
		int n = -1;
		while(true) {
			try {
				n = stdIn.nextInt();
				if(!isValid(n, min, max)) {
					throw new RangeError(n);
				}
			} catch (RangeError e) {
				System.out.println(e.getMessage());
				System.out.println("再入力してください");
				continue;
			}
				catch (InputMismatchException e) {
				System.out.println("入力値の型が違います：" + stdIn.next());
				System.out.println("再入力してください");
				continue;
			}
			break;
		}
		return n;
	}


}