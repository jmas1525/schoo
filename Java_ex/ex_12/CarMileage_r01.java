// Car_r1クラスから派生 //

/* 5/14修正（修正箇所：CarMileageクラス内のmoveメソッド）
 * superクラスのmoveメソッドを使用することで、セッターを用いないように修正。*/

public class CarMileage_r01 extends Car_r01 {
	private double totalMileage = 0;		// 総走行距離

	CarMileage_r01(String name, int width, int height, int length
			, double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
		this.totalMileage = 0;
	}

	public double getTotalMileage() {		// 総走行距離の取得
		return totalMileage;
	}

	//--- X方向にdx・Y方向にdy移動 ---//
	@Override public boolean move(double dx, double dy) {
		if(super.move(dx, dy)) {
			double dist = Math.sqrt(dx * dx + dy * dy);		// 移動距離
			totalMileage += dist;		// 移動完了
			return true;
		}
		else return false;
	}
}