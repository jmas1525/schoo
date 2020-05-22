// DateIdクラスを利用
// 青本からは、パッケージのインポート宣言以外の変更点はない
import id.DateId;

public class DateIdTester {

	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();

		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("cの識別番号：" + c.getId());
	}
}