// Accountクラスをスーパー（上位）クラスとするクラス
public class TimeAccount extends Account {
	private long timeBalance;

	// コンストラクタ
	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);			// クラスAccountのコンストラクタの呼出し
		this.timeBalance = timeBalance;		// 預金残高（定期預金）


		}
	// 定期預金残高を調べる
	public long getTimeBalance() {
		return timeBalance;
	}

	// 定期預金を解約して全額を普通預金に移す
	public void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}

}
