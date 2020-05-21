// 二つの変数xとyの合計と平均を表示

class ex_2_2 {
	
	public static void main(String args[]) {
		int x;
		int y;
		int z;
		
		x = 12;
		y = 34;
		z = 56;
		
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("zの値は" + z + "です。");
		System.out.println("合計は" + ( x + y + z ) + "です。");
		System.out.println("平均は" + ( x + y + z ) / 3 + "です。");
	}
}