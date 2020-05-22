// 2020/5/15
// 演習9-3、Accountクラスの動作を確認

public class ex_9_3 {

	public static void main(String[] args) {

		Account test = new Account("test", "test", 10000, new Day(2000, 1, 1));

		System.out.println(test);
	}
}
