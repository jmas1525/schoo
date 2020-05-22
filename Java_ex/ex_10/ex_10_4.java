// Dayクラスを利用
import java.util.Scanner;

public class ex_10_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("日付を2つ入力してください。");
		Day[] d = new Day[2];
		d[0] = new Day();
		d[1] = new Day();

		for(int i = 0; i < 2; i++) {
			System.out.println((i + 1) + "つめの日付を入力してください。");
			System.out.print("年(西暦)：");
			int year =  stdIn.nextInt();
			System.out.print("月：");
			int month =  stdIn.nextInt();
			System.out.print("日：");
			int date =  stdIn.nextInt();

			d[i] = new Day(year, month, date);
		}

		System.out.print("1つ目の日付：");
		System.out.println(d[0].toString());
		System.out.print("2つ目の日付：");
		System.out.println(d[1].toString());

		if(d[0].isLeap())	System.out.println("一つ目の日付はうるう年です。");
		else				System.out.println("一つ目の日付はうるう年ではありません。");

		System.out.print("1つ目の日付を1日後ろにずらします。");
		d[0].addDay();
		System.out.println(d[0].toString());

		System.out.print("1つ目の日付を2日後ろにずらします。");
		d[0].addDayN(2);
		System.out.println(d[0].toString());

		if(d[0].equalTo(d[1]))		System.out.println("1つ目の日付と2つ目の日付は同じです。");
		else		System.out.println("1つ目の日付と2つ目の日付は異なります。");

		System.out.println("1つ目の日付の年始からの経過日数は" + d[0].lapsedDays() + "日です。");
		System.out.println("1つ目の日付の年末までの残り日数は" + d[0].daysLeft() + "日です。");

		if(d[0].ifAfter(d[1]))	System.out.println("1つ目の日付は2つ目の日付より後です。");
		else		System.out.println("1つ目の日付は2つ目の日付より後ではありません。");

		System.out.print("1つ目の日付を1日後ろにずらした日付を作成します。");
		Day day = new Day(d[0].nextDay());
		System.out.println(day.toString());

		stdIn.close();
	}
}
