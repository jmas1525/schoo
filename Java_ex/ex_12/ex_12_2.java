// Accountクラスを上位とするTimeAccountクラスを使用
// 5/12版
public class ex_12_2 {
	public  static void main(String[] args) {

		Account adachi = new Account("足立幸一", "123456", 1000);
		TimeAccount nakata = new TimeAccount("仲田真二", "654321", 500, 500);

		switch (compBalance(adachi, nakata)) {
		case 0:		System.out.println("足立君と仲田君の預金残高は同じ。");	break;
		case 1:		System.out.println("足立君の方が預金残高が多い。");		break;
		case -1:	System.out.println("仲田君の方が預金残高が多い。");		break;
		}
	}

	public static int compBalance(Account a, Account b) {
		long A = a.getBalance();
		long B = b.getBalance();

		if(A > B)			return 1;
		else if(A == B)		return 0;
		else				return -1;
	}

	public static int compBalance(TimeAccount a, Account b) {
		long A = a.getBalance() + a.getTimeBalance();
		long B = b.getBalance();

		if(A > B)			return 1;
		else if(A == B)		return 0;
		else				return -1;
	}
	public static int compBalance(Account a, TimeAccount b) {
		long A = a.getBalance();
		long B = b.getBalance() + b.getTimeBalance();

		if(A > B)			return 1;
		else if(A == B)		return 0;
		else				return -1;
	}
	public static int compBalance(TimeAccount a, TimeAccount b) {
		long A = a.getBalance() + a.getTimeBalance();
		long B = b.getBalance() + b.getTimeBalance();

		if(A > B)			return 1;
		else if(A == B)		return 0;
		else				return -1;
	}
}
