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
	// 整数nはa以上の値か？
	static boolean isOver(int n, int a) {
		return n >= a;
	}
	// 整数nはa以下の値か？
	static boolean isUnder(int n, int a) {
		return n <= a;
	}

	// 範囲指定入力
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

	// min以上の値を入力
	static int inputIntOver(int min) {
		int n = -1;
		while(true) {
			try {
				n = stdIn.nextInt();
				if(!isOver(n, min)) {
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

	// max以下の値を入力
	static int inputIntUnder(int max) {
		int n = -1;
		while(true) {
			try {
				n = stdIn.nextInt();
				if(!isUnder(n, max)) {
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