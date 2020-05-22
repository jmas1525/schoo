// 自動車クラス (青本p324、第2版)（演習12-1
// Dayクラスを使用

/* 5/14修正(修正箇所：getter、setterの削除)
 * 青本に書いてある、x, y, fuel, purchaseDayのgetterのみを残して他のgetter、setterを削除した。*/
import java.util.Scanner;

public class Car_r01 {
	Scanner stdIn = new Scanner(System.in);
	private String name;		// 名前
	private int width;			// 幅
	private int height;		// 高さ
	private int length;		// 長さ
	private double x;			// 現在位置X座標
	private double y;			// 現在位置Y座標
	private double fuel;		// 残り燃料
	private Day purchaseDay;	// 購入日

	//--- コンストラクタ ---//
	Car_r01(String name, int width, int height, int length, double fuel, Day purchaseDay){
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.purchaseDay = new Day(purchaseDay);
		x = y = 0.0;
	}


	// ゲッター
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getFuel() {
		return fuel;
	}
	public Day getPurchaseDay() {
		return purchaseDay;
	}


	//--- スペック表示 ---//
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅" + width + "mm");
		System.out.println("車高" + height + "mm");
		System.out.println("車長" + length + "mm");
	}

	//--- X方向にdx・Y方向にdy移動 ---//
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);		// 移動距離

		if (dist > fuel)
			return false;			// 移動できない …燃料不足
		else {
			fuel -= dist;			// 移動距離の分だけ燃料が減る
			x += dx;
			y += dy;
			return true;			// 移動完了
		}
	}
}
