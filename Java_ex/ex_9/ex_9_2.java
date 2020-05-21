// 2020/5/15
// Dayクラス（第3版）の動作を確認
import java.util.Scanner;

public class ex_9_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("日付を入力してください。");
		System.out.print("年（西暦）：");
		int y = stdIn.nextInt();
		System.out.print("月：");
		int m = stdIn.nextInt();
		System.out.print("日：");
		int d = stdIn.nextInt();
		Day day = new Day(y, m, d);
		Day day0 = new Day(2000, 1, 1);

		System.out.println("入力された日付：" + day.getYear() + "年" + day.getMonth() + "月" + day.getDate() + "日");

		System.out.println("日付を変更します。");
		System.out.print("年（西暦）：");
		day.setYear(stdIn.nextInt());
		System.out.print("月：");
		day.setMonth(stdIn.nextInt());
		System.out.print("日：");
		day.setDate(stdIn.nextInt());

		System.out.println("入力された日付：" + day);

		if(day.equalTo(day0))	System.out.println("入力された日付は" + day0 + "です。");
		else					System.out.println("入力された日付は" + day0 + "ではありません。");

		stdIn.close();
	}
}
