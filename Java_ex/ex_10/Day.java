
// 日付クラスDay
import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class Day {
	private int year = 1; // 年
	private int month = 1; // 月
	private int date = 1; // 日

	//--- y年は閏年か？ ---//
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}

	static GregorianCalendar today = new GregorianCalendar();
	static int y = today.get(YEAR); // 年
	static int m = today.get(MONTH) + 1; // 月
	static int d = today.get(DATE); // 日

	//--- コンストラクタ ---//
	public Day(int year) {
		this.year = year;
	}

	public Day(int year, int month) {
		this(year);
		if (month < 1)
			month = 1;
		else if (month > 12)
			month = 12;
		this.month = month;
	}

	public Day(int year, int month, int date) {
		this(year, month);

		if (date < 1)
			date = 1;
		else if (date > 30 && (month == 4 || month == 6 || month == 9 || month == 11))
			date = 30;
		else if (date > 31 && !(month == 2 || month == 4 || month == 6 || month == 9 || month == 11))
			date = 31;
		else if (date > 29 && isLeap(year) && month == 2)
			date = 29;
		else if (date > 28 && !(isLeap(year)) && month == 2 )
			date = 28;
		this.date = date;
	}

	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	public Day() {
		this(y, m, d);
	}

	//--- GregorianCalendarに変換 ---//
	public GregorianCalendar toGregorianCalendar() {
		GregorianCalendar todate = new GregorianCalendar(year, month - 1, date);
		return todate;
	}

	//--- Dayに変換 ---//
	static Day toDay(GregorianCalendar d) {
		Day day = new Day(d.get(YEAR), d.get(MONTH) + 1, d.get(DATE));
		return day;
	}

	//--- 年・月・日を取得 ---//
	public int getYear() {
		return year;
	} // 年を取得

	public int getMonth() {
		return month;
	} // 月を取得

	public int getDate() {
		return date;
	} // 日を取得

	//--- 年・月・日を設定 ---//
	public void setYear(int year) {
		this.year = year;
	} // 年を設定

	public void setMonth(int month) {
		this.month = month;
	} // 月を設定

	public void setDate(int date) {
		this.date = date;
	} // 日を設定

	public void set(int year, int month, int date) {
		this.year = year; // 年
		this.month = month; // 月
		this.date = date; // 日
	}

	//--- 閏年か？ ---//
	public boolean isLeap() {
		return isLeap(year);
	}

	//--- 曜日を求める ---//
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	//--- 日付dと等しいか ---//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	//--- 文字列表現を返却 ---//
	public String toString() {
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}

	//--- 年内での経過日数を求める ---//
	public int lapsedDays() {
		GregorianCalendar today = toGregorianCalendar();
		GregorianCalendar NewYearDay = new GregorianCalendar(year, 0, 1);
		int lapsed = (int)((today.getTimeInMillis() - NewYearDay.getTimeInMillis()) / (1000 * 60 * 60 * 24) );
		return lapsed;
	}

	//--- 年内の残り日数を求める ---//
	public int daysLeft() {
		GregorianCalendar today = toGregorianCalendar();
		GregorianCalendar YearEndDay = new GregorianCalendar(year, 11, 31);
		return (int)((YearEndDay.getTimeInMillis() - today.getTimeInMillis()) / (1000 * 60 * 60 * 24) );
	}

	//--- 他の日付との前後関係を判定する ---//
	// このインスタンスの日付の方が後なら、trueを返す //
	public boolean ifAfter(Day d) {
		GregorianCalendar today = this.toGregorianCalendar();
		GregorianCalendar oneday = d.toGregorianCalendar();

		return today.after(oneday);
	}

	//--- 二つの日付の前後関係を判定する ---//
	// 第1引数の日付の方が後なら、trueを返す //
	static boolean ifAfter(Day d1, Day d2) {
		GregorianCalendar day1 = d1.toGregorianCalendar();
		GregorianCalendar day2 = d2.toGregorianCalendar();

		return day1.after(day2);
	}

	//--- 日付を一つ後ろに進める ---//
	public void addDay() {
		GregorianCalendar today = this.toGregorianCalendar();
		today.add(DATE, 1);
		year = today.get(YEAR);
		month = today.get(MONTH) + 1;
		date = today.get(DATE);
	}

	//--- 次の日の日付を返却する ---//
	public Day nextDay() {
		GregorianCalendar nextday = this.toGregorianCalendar();
		nextday.add(DAY_OF_MONTH, 1);
		return toDay(nextday);
	}

	//--- 日付を一つ前に戻すメソッド ---//
	public void backDay() {
		GregorianCalendar today = this.toGregorianCalendar();
		today.add(DAY_OF_MONTH, -1);
		year = today.get(YEAR);
		month = today.get(MONTH) + 1;
		date = today.get(DATE);
	}

	//--- 前の日の日付を返却するメソッド ---//
	public Day beforeDay() {
		GregorianCalendar beforeday = this.toGregorianCalendar();
		beforeday.add(DAY_OF_MONTH, -1);
		return toDay(beforeday);
	}

	//--- 日付をn日後ろに進めるメソッド ---//
	public void addDayN(int n) {
		GregorianCalendar today = this.toGregorianCalendar();
		today.add(DAY_OF_MONTH, n);
		year = today.get(YEAR);
		month = today.get(MONTH) + 1;
		date = today.get(DATE);
	}

	//--- n日後の日付を返却するメソッド ---//
	public Day nextDayN(int n) {
		GregorianCalendar nextday = this.toGregorianCalendar();
		nextday.add(DAY_OF_MONTH, n);
		return toDay(nextday);
	}

	//--- 日付をn日前に戻すメソッド ---//
	public void backDayN(int n) {
		GregorianCalendar today = this.toGregorianCalendar();
		today.add(DAY_OF_MONTH, -n);
		year = today.get(YEAR);
		month = today.get(MONTH) + 1;
		date = today.get(DATE);
	}

	//--- n日前の日付を返却するメソッド ---//
	public Day beforeDayN(int n) {
		GregorianCalendar beforeday = this.toGregorianCalendar();
		beforeday.add(DAY_OF_MONTH, -n);
		return toDay(beforeday);
	}
}