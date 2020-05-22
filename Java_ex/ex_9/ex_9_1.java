// 2020/5/15
// Humanクラスを使用
import java.util.Scanner;

public class ex_9_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("何人分の情報を入力しますか？(1人目は固定データ)：");
		int num = stdIn.nextInt();

		Human[] human = new Human[num];
		Day d0 = new Day(1998, 3, 9);

		if(num != 0)	human[0] = new Human("hirose", d0, 168.0, 48.6, 0);

		for (int i = 1; i < num; i++) {
			int s = -1;
			System.out.println((i + 1) + "人目の情報を入力してください。");
			System.out.print("名前：");		String n = stdIn.next();
			System.out.println("生年月日(西暦)");
			System.out.print("年：");		int y = stdIn.nextInt();
			System.out.print("月：");		int m = stdIn.nextInt();
			System.out.print("日：");		int d = stdIn.nextInt();
			Day birth = new Day(y, m, d);
			System.out.print("身長(cm)：");		double h = stdIn.nextDouble();
			System.out.print("体重(kg)：");		double w = stdIn.nextDouble();
			do {
				System.out.print("性別（0…男, 1…女）：");
				s = stdIn.nextInt();
			} while (s < 0 || s > 1);
			human[i] = new Human(n, birth, h, w, s);
		}


		// データの表示
		if(num != 0) {
				System.out.println("入力されたデータを表示します。");
			for(int i = 0; i < num; i++) {
				System.out.println((i + 1) + "人目：");
				System.out.println(human[i]);
			}
		}

		stdIn.close();
	}
}