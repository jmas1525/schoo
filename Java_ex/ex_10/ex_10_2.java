// ExIdクラスを利用
import java.util.Scanner;

public class ex_10_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ExId[] id;
		int n = 0;
		int select = 0;

		System.out.println("いくつのIDを作成しますか。");
		do {
			System.out.print("個数：");
			n = stdIn.nextInt();
		} while (n < 0);

		id = new ExId[n];
		int i = 0;
		
		do {
			System.out.println("操作を選択してください。");
			System.out.println("1：新しいIDの作成");
			System.out.println("2：ID一覧の表示");
			System.out.println("3：識別番号の割り当てに関する設定");
			System.out.println("4：操作の終了");
			do {
				select = stdIn.nextInt();
			} while (select < 1 || select > 4);

			switch (select) {

			//--- 新しいIDの作成 ---//
			case 1:
				if (i < n) {
					id[i] = new ExId();
					System.out.println("IDの作成に成功しました。");
					i++;
				}
				else {
					System.out.println("IDの作成限界数を超えています。");
					System.out.println("IDの作成に失敗しました。");
				}
				break;

			//--- ID一覧の表示 ---//
			case 2:
				if (i > 0) {
					for (int j = 0; j < i; j++)
						System.out.println("ID：" + id[j].getId());
				}
				else	System.out.println("IDがありません。");
				break;

			//--- 識別番号の割り当てに関する設定 ---//
			case 3:
				ExId.changeN();
				break;

			//--- 操作の終了 ---//
			case 4:
				System.out.println("操作を終了します。");
				break;
			default:
				break;
			}
			System.out.println();
		} while (select != 4);
	}
}

//連番クラス
class ExId {
	static Scanner stdIn = new Scanner(System.in);
	static int counter = 0;		// 何番までの識別番号を与えたか
	static int n = 1;				// 識別番号をnずつ増やす
	private int id;				// 識別番号

	//--- コンストラクタ ---//
	public ExId() {
		counter += n;
		id = counter;
	}

	//--- 識別番号を取得 ---//
	public int getId() {
		return id;
	}

	//--- 識別番号の割り当て間隔を取得 ---//
	public static int getN() {
		return n;
	}

	//--- 識別番号の割り当て間隔を更新 ---//
	public static void changeN() {
		System.out.println("識別番号はnずつ増やして与えることができます。");
		System.out.println("現在のnは" + n + "です。");
		do {
			System.out.print("更新後のn(1以上)：");
			n = stdIn.nextInt();
		} while (n < 1);

		System.out.println("更新完了しました。現在のnは" + n + "です。");
	}

	//--- 最後に与えた識別番号を取得 ---//
	public static int getMaxId() {
		return counter;
	}
}