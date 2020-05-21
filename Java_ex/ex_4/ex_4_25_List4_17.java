import java.util.Scanner;

class ex_4_25_List4_17 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか：");
		int n = stdIn.nextInt();	// 加算する個数
		
		int sum = 0;
		int count = 0;		// 実際に加算した値の個数
		
		for (int i = 0; i < n; i++) {
			System.out.print("整数（0で終了）：");
			int t = stdIn.nextInt();
			if (t == 0) break;
			sum += t;
			count++;
		}
		System.out.println("合計は" + sum + "です。");
		if (sum == 0)	System.out.println("平均は0です。");
		else			System.out.println("平均は" + (sum / count) + "です。");
	}
}