// 自動車クラス
import java.util.Scanner;

class Car {
	Scanner stdIn = new Scanner(System.in);
	private String name;		// 名前
	private int width;			// 幅
	private int height;		// 高さ
	private int length;		// 長さ
	private double x;			// 現在位置X座標
	private double y;			// 現在位置Y座標
	private double fuel;		// 残り燃料
	private double fuelEco;	// 燃費

	//--- コンストラクタ ---//
	Car(String name, int width, int height, int length, double fuel, double fuelEco){
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.fuelEco = fuelEco;
		x = y = 0.0;
	}

	double getX() { return x; }		// 現在位置X座標を取得
	double getY() { return y; }		// 現在位置Y座標を取得
	double getFuel() { return fuel; }	// 残り燃料を取得

	//--- スペック表示 ---//
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅" + width + "mm");
		System.out.println("車高" + height + "mm");
		System.out.println("車長" + length + "mm");
	}

	//--- 現在地等を含めた情報の表示 ---//
	void printData() {
		System.out.println("名前：" + name);
		System.out.println("車幅" + width + "mm");
		System.out.println("車高" + height + "mm");
		System.out.println("車長" + length + "mm");
		System.out.println("現在地(" + getX() + ", " + getY() + ")");
		System.out.println("残り燃料 " + getFuel());
		System.out.println();
	}

	//--- 給油 ---//
	void refuel() {
		double f = 0;
		do {
			System.out.println("給油する燃料の量(0以上)：");
			f = stdIn.nextDouble();
		} while(f < 0);
		fuel += f;

		System.out.println("給油が完了しました。");
		System.out.println("残り燃料は" + fuel + "です。\n");
	}

	//--- X方向にdx・Y方向にdy移動 ---//
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);		// 移動距離

		if (dist > fuel)
			return false;			// 移動できない …燃料不足
		else {
			fuel -= dist * fuelEco / 100.0;			// 移動距離の分だけ燃料が減る
			x += dx;
			y += dy;
			return true;			// 移動完了
		}
	}

	//--- 車の移動操作 ---//
	void moveOperation() {
		while(true) {
			int n = -1;
			System.out.println("現在地(" + getX() + ", " + getY() + ")・残り燃料 " + getFuel());
			do {
				System.out.print("移動しますか[0…No／1…Yes]：");
				n = stdIn.nextInt();
			} while (n < 0 || n > 1);
			if (n == 0)		break;

			System.out.print("X方向の移動距離：");
			double dx = stdIn.nextDouble();
			System.out.print("Y方向の移動距離：");
			double dy = stdIn.nextDouble();
			System.out.println();

			if (!move(dx, dy))
				System.out.println("燃料が足りません！\n");
		}
	}

}
