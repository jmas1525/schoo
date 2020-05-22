// 2020/5/15
// 銀行口座クラス【第2版】

/*演習9-3で利用。
 * 青本からの変更点
 * ・口座開設日のフィールド(Day型)を追加（それに付随したコンストラクタの変更やgetterの定義）
 * ・toStringメソッドをオーバーライド*/

public class Account {
	private String name;			// 口座名義
	private String no;				// 口座番号
	private long balance;			// 預金残高
	private Day openDay;				// 口座開設日

	//-- コンストラクタ --//
	public Account(String n, String num, long z, Day o) {
		name = n;					// 口座名義
		no = num;					// 口座番号
		balance = z;				// 預金残高
		openDay = o;					// 口座開設日
	}

	//--- 口座名義を調べる ---//
	public String getName() {
		return name;
	}

	//--- 口座番号を調べる ---//
	public String getNo() {
		return no;
	}

	//--- 預金残高を調べる ---//
	public long getBalance() {
		return balance;
	}

	//--- 口座開設日を調べる ---//
	public Day getOpenDay() {
		return openDay;
	}

	//--- k円預ける ---//
	public void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	public void withdraw(long k) {
		balance -= k;
	}

	public String toString() {
		return	"--------------------------\n"
				+ "口座名義：" + name + "\n"
				+ "口座番号：" + no + "\n"
				+ "預金残高：" + balance + "\n"
				+ "口座開設日：" + openDay + "\n"
				+ "--------------------------\n";
	}
}