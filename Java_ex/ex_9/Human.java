// 2020/5/15
// 人間クラス(演習9-1、演習9-4で使用)

/* 演習8-1からの変更点
 * ・生年月日フィールドの型をDayに変更（また、それに合わせた他メソッド、コンストラクタの変更）
 * ・printDataメソッドの表示内容から、「情報を表示します」を削除（不必要であったため）
 * ・printDataメソッドについて、身長と体重の表示が逆になっていた部分の修正
 * ・toStringメソッドのオーバーライドを追加
 * ・全メソッドをpublicに変更
 */


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Human {
	static Scanner stdIn = new Scanner(System.in);
	private String name;		// 名前
	private Day birthDay; 		// 生年月日
	private double height;		// 身長(cm)
	private double weight;		// 体重(kg)
	private int sex;			// 性別
	private int age;			// 年齢

	// コンストラクタ
	Human(String n, Day d, double h, double w, int s) {
		name = n;
		birthDay = d;
		height = h;
		weight = w;
		sex = s;
		age = calcAge();
	}

	// 誕生日を調べる
	public Day getBirthDay() {
		return birthDay;
	}

	// 登録情報の変更
	public void changeData() {
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
				birthDay.setYear(stdIn.nextInt());
				System.out.print("月：");
				birthDay.setMonth(stdIn.nextInt());
				System.out.print("日：");
				birthDay.setDate(stdIn.nextInt());
				age = calcAge();
				break;
			case 3:
				System.out.print("変更後の身長(cm)：");
				height = stdIn.nextDouble();
				break;
			case 4:
				System.out.print("変更後の体重(kg)：");
				weight = stdIn.nextDouble();
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
	public int calcAge() {
		// 現在の日付をdate型変数に格納
		Calendar c1 = Calendar.getInstance();
		Date date = new Date();
		date = c1.getTime();

		// 誕生日のデータを年齢計算用に変換
		int birth = birthDay.getYear() * 10000 + birthDay.getMonth() * 100 + birthDay.getDate();

		// 年齢計算
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return (Integer.parseInt(sdf.format(date)) - birth) / 10000;
	}

	// 個人情報を表示
	public void printData() {
		String[] s = {"男", "女"};
		System.out.println("名前：" + name);
		System.out.println("生年月日：" + birthDay.getYear() + "年" + birthDay.getMonth() + "月" + birthDay.getDate() + "日");
		System.out.println("年齢：" + age + "歳");
		System.out.printf("身長：%.1fkg\n", height);
		System.out.printf("体重：%.1fcm\n", weight);
		System.out.println("性別：" + s[sex]);
		System.out.println();
	}

	// toString(表示するものはprintDataに、区切りの横線を足したもの)
	public String toString() {
		String[] s = {"男", "女"};
		return "--------------------------\n"
				+ "名前：" + name + "\n"
				+ "生年月日：" + birthDay + "\n"
				+ "年齢：" + age + "歳\n"
				+ "身長：" + height + "cm\n"
				+ "体重：" + weight + "kg\n"
				+ "性別：" + s[sex] + "\n"
				+ "--------------------------\n";
	}
}