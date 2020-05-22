// Accountクラスを上位とするTimeAccountクラスを使用

/* 5/14修正（修正箇所：compBalanceメソッド ）
 * compBalanceメソッドの仮引数がaccount型のみでも実行できるように修正。
 * 第1版では、compBalanceの仮引数について上位クラス、
 * 下位クラスの組み合わせでメソッドを4通り作成していた。*/

public class ex_12_2_r01 {
	public  static void main(String[] args) {

		Account adachi = new Account("足立幸一", "123456", 1000);
		TimeAccount nakata = new TimeAccount("仲田真二", "654321", 700, 500);

		switch (compBalance(adachi, nakata)) {
		case 0:		System.out.println("足立君と仲田君の預金残高は同じ。");	break;
		case 1:		System.out.println("足立君の方が預金残高が多い。");		break;
		case -1:	System.out.println("仲田君の方が預金残高が多い。");		break;
		}
	}

	public static int compBalance(Account a, Account b) {
		long A = a.getBalance();
		long B = b.getBalance();

		if(a instanceof TimeAccount)  {
			A += ((TimeAccount)a).getTimeBalance();
		}

		if(b instanceof TimeAccount)  {
			B += ((TimeAccount)b).getTimeBalance();
		}

		if(A > B)			return 1;
		else if(A == B)		return 0;
		else				return -1;
	}

}
