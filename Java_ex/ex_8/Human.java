/**
 * 2020/05/07
 */

/**
 * @author 廣瀬賢明
 *
 */
// 人間クラス

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Human {
	static Scanner stdIn = new Scanner(System.in);
	private String name;		// 名前
	private int year;			// 生年月日
	private int month;			// 生年月日
	private int day;			// 生年月日
	private float height;		// 身長(cm)
	private float weight;		// 体重(kg)
	private int sex;			// 性別
	private int age;			// 年齢

	// コンストラクタ
	Human(String n, int y, int m, int d, float h, float w, int s) {
		name = n;
		year = y;
		month = m;
		day = d;
		height = h;
		weight = w;
		sex = s;
		age = calcAge();
	}

	// 登録情報の変更
	void changeData() {
		System.out.println("変更するデータを選択してください。");
		int n = 0;
		int s = 0;
		do {
			System.out.println("1：名前");
			System.out.println("2：生年月日");
			System.out.println("3：身長");
			System.out.println("4：体重");
			System.out.println("5：性別");
			System.out.println("0：キャンセル");
			n = stdIn.nextInt();
		} while (n < 0 || n > 5);
		switch(n) {
			case 1:
				System.out.print("変更後の名前：");
				name = stdIn.next();
				break;
			case 2:
				System.out.println("変更後の生年月日：");
				System.out.print("年：");
				year = stdIn.nextInt();
				System.out.print("月：");
				month = stdIn.nextInt();
				System.out.print("日：");
				day = stdIn.nextInt();
				age = calcAge();
				break;
			case 3:
				System.out.print("変更後の身長(cm)：");
				height = stdIn.nextFloat();
				break;
			case 4:
				System.out.print("変更後の体重(kg)：");
				weight = stdIn.nextFloat();
				break;
			case 5:
				System.out.println("変更後の性別（0…男, 1…女）：");
				do {
					s = stdIn.nextInt();
				} while (s < 0 || s > 1);
			case 0:
				break;
			default:
				break;
		}
		System.out.println("更新が完了しました。");
	}

	// 年齢計算
	int calcAge() {
		// 現在の日付をdate型変数に格納
		Calendar c1 = Calendar.getInstance();
		Date date = new Date();
		date = c1.getTime();

		// 誕生日のデータを年齢計算用に変換
		int birth = year * 10000 + month * 100 + day;

		// 年齢計算
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return (Integer.parseInt(sdf.format(date)) - birth) / 10000;
	}

	// 個人情報を表示
	void printData() {
		String[] s = {"男", "女"};
		System.out.println("情報を表示します。\n");
		System.out.println("名前：" + name);
		System.out.println("生年月日：" + year + "年" + month + "月" + day + "日");
		System.out.println("年齢：" + age + "歳");
		System.out.printf("身長：%.1fkg\n", weight);
		System.out.printf("体重：%.1fcm\n", height);
		System.out.println("性別：" + s[sex]);
		System.out.println();
	}
}