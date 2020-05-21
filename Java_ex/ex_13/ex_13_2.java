// 演習13-2、図形クラス群をテストするプログラム

import java.util.Scanner;

public class ex_13_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("図形の配列を作成します。");
		System.out.print("図形は何個：");
		int n = stdIn.nextInt();
		Shape[] shapes = new Shape[n];
		int select = 0;
		int select1 = 0;

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "番の図形の種類（1…点／2…水平直線／3…垂直直線／4…長方形／5…直角二等辺三角形）：");

			do {
				select = stdIn.nextInt();
			} while (select < 1 || select > 5);

			switch (select) {
			case 1:	shapes[0] = new Point();
					break;

			case 2:	System.out.print("長さ：");
					shapes[i] = new HorzLine(stdIn.nextInt());
					break;

			case 3:	System.out.print("長さ：");
					shapes[i] = new VertLine(stdIn.nextInt());
					break;

			case 4:	System.out.print("幅　：");	int width = stdIn.nextInt();
					System.out.print("高さ：");	int height = stdIn.nextInt();
					shapes[i] = new Rectangle(width, height);
					break;

			case 5:	System.out.println("直角の場所（1…右上／2…右下／3…左上／4…左下）");
					select1 = stdIn.nextInt();
					System.out.print("等辺の長さ");
					int length = stdIn.nextInt();
					switch (select1) {
					case 1: shapes[i] = new UpRiIsoTriangle(length); break;
					case 2: shapes[i] = new LowRiIsoTriangle(length); break;
					case 3: shapes[i] = new UpLeIsoRiTriangle(length); break;
					case 4: shapes[i] = new LowLeIsoRiTriangle(length); break;
					default: break;
					}

			default: break;
			}
		}

		System.out.println("図形を表示します。");
		System.out.println("-----------------------\n");
		for (int i = 0; i < n; i++) {
			shapes[i].print();
			System.out.println();
		}
		System.out.println("\n-----------------------");

		stdIn.close();
	}

}
