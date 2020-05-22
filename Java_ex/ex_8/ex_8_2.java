// 自動車クラスの利用

import java.util.Scanner;

public class ex_8_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("車のデータを入力せよ。");
		System.out.print("名前は：");		String name = stdIn.next();
		System.out.print("車幅(mm)は：");		int width = stdIn.nextInt();
		System.out.print("高さ(mm)は：");		int height = stdIn.nextInt();
		System.out.print("長さ(mm)は：");		int length = stdIn.nextInt();
		System.out.print("ガソリン量は：");		double fuel = stdIn.nextDouble();
		System.out.println("燃費(%)は：");		double fuelEco = stdIn.nextDouble();

		Car myCar = new Car(name, width, height, length, fuel, fuelEco);

		// データの操作
		int i = 0;
		do {
			System.out.println("操作を選択してください。");
			System.out.println("1：情報の表示");
			System.out.println("2：車の移動");
			System.out.println("3：給油");
			System.out.println("4：操作の終了");
			do {
				i = stdIn.nextInt();
			} while (i < 1 || i > 4);
			switch (i) {
			case 1:
				myCar.printData();
				break;
			case 2:
				myCar.moveOperation();
				break;
			case 3:
				myCar.refuel();
				break;
			case 4:
				System.out.println("終了します。");
				break;
			default:
				System.out.println("終了します。");
				break;
			}
		} while (i != 4);
		stdIn.close();
	}
}
