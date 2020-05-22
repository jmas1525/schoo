// 2020/5/15
// 期間を表すクラス(Dayクラスを利用)(演習9-5)

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class Period {
	private Day from;			// 開始日
	private Day to;				// 終了日

	public Period(Day from, Day to) {
		this.from = from;
		this.to = to;
	}

	//--- GregorianCalendarに変換 ---//
	public static GregorianCalendar toGregorianCalendar(Day d) {
		return new GregorianCalendar(d.getYear(), d.getMonth() - 1, d.getDate());
	}

	//--- Dayに変換 ---//
	public static Day toDay(GregorianCalendar d) {
		Day day = new Day(d.get(YEAR), d.get(MONTH) + 1, d.get(DATE));
		return day;
	}

	// 開始日を調べる
	public Day getFrom() {
		return from;
	}

	// 終了日を調べる
	public Day getTo() {
		return to;
	}

	// 期間（日）を調べる
	public int getDayPeriod() {
		GregorianCalendar greFrom = toGregorianCalendar(from);
		GregorianCalendar greTo = toGregorianCalendar(to);
		int lapsed = (int)((greTo.getTimeInMillis() - greFrom.getTimeInMillis()) / (1000 * 60 * 60 * 24) );
		return lapsed;
	}

	// toStrongメソッドをオーバーライド
	public String toString() {
		return "--------------------------\n"
				+ "開始日：" + from + "\n"
				+ "終了日：" + to + "\n"
				+ "期間（日数）：" + getDayPeriod() + "日\n"
				+ "--------------------------\n";
	}

}
