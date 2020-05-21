// Humanクラスを使用

import java.util.Scanner;

public class ex_8_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int s = -1;
		System.out.println("あなたの情報を入力してください。");
		System.out.print("名前：");		String n = stdIn.next();
		System.out.println("生年月日(西暦)");
		System.out.print("年：");		int y = stdIn.nextInt();
		System.out.print("月：");		int m = stdIn.nextInt();
		System.out.print("日：");		int d = stdIn.nextInt();
		System.out.print("身長(cm)：");		float h = stdIn.nextFloat();
		System.out.print("体重(kg)：");		float w = stdIn.nextFloat();
		do {
			System.out.print("性別（0…男, 1…女）：");
			s = stdIn.nextInt();
		} while (s < 0 || s > 1);
		Human myData = new Human(n, y, m, d, h, w, s);

		// データの操作
		int i = 0;
		do {
			System.out.println("操作を選択してください。");
			System.out.println("1：個人情報の表示");
			System.out.println("2：登録内容の変更");
			System.out.println("3：操作の終了");
			do {
				i = stdIn.nextInt();
			} while (i < 1 || i > 3);
			switch (i) {
			case 1:
				myData.printData();
				break;
			case 2:
				myData.changeData();
				break;
			case 3:
				System.out.println("終了します。");
				break;
			default:
				System.out.println("終了します。");
				break;
			}

		} while (i != 3);
	}
}