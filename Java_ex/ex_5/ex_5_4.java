import java.util.Scanner;

class ex_5_4 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数x,y,zの合計と平均値を求めます。");
		
		System.out.print("xの値：");
		int x = stdIn.nextInt();
		
		System.out.print("yの値：");
		int y = stdIn.nextInt();
		
		System.out.print("zの値：");
		int z = stdIn.nextInt();

		System.out.println("合計は" + (x + y + z) + "です。");
		System.out.println("平均は" + (x + y + z) / 3.0 + "です。");
	}
}