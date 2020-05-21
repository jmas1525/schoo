// Idクラスを利用

import java.util.Scanner;

public class ex_10_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Id[] id;
		int n = 0;

		System.out.println("いくつのIdを作成しますか。");
		do {
			System.out.print("個数：");
			n = stdIn.nextInt();
		} while (n < 0);

		id = new Id[n];

		for (int i = 0; i < n; i++)
			id[i] = new Id();

		System.out.println("最後に与えた識別番号は" + Id.getMaxId() + "です。");
	}
}


//連番クラス
class Id {
	static int counter = 0; // 何番までの識別番号を与えたか
	private int id; // 識別番号

	//--- コンストラクタ ---//
	public Id() {
		id = ++counter;
	}

	//--- 識別番号を取得 ---//
	public int getId() {
		return id;
	}

	//--- 最後に与えた識別番号を取得 ---//
	public static int getMaxId() {
		return counter;
	}
}