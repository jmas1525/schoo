//--- 銀行口座クラス ---//
public class Account {
	private static int counter = 0;
	private String name;		// 口座名義
	private String no;			// 口座番号
	private long balance;		// 預金残高
	private int id;			// 識別番号

	//--- コンストラクタ ---//
	public Account(String n, String num, long z) {
		name = n;				// 口座名義
		no = num;				// 口座番号
		balance = z;			// 預金残高
		id = ++counter;			// 識別番号
	}

	{
		System.out.println("明解銀行での口座開設ありがとうございます。");
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

	//--- 識別番号を取得 ---//
	public int getId() {
		return id;
	}

	//--- k円預ける ---//
	public void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	public void withdraw(long k) {
		balance -= k;
	}

	//--- 口座情報の表示 ---//
	public void printAccount() {
		System.out.println("口座名義：" + name);
		System.out.println("口座番号" + no);
		System.out.println("預金残高" + balance);
		System.out.println("識別番号" + id);
	}
}