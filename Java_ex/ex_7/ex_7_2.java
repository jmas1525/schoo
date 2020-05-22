import java.util.Scanner;

class ex_7_2 {
	
	static int min(int a, int b, int c) {
		int min = a;
		if (min > b)	min = b;
		if (min > c)	min = c;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("3つの整数値の最小値を返却します。");
		
		int[] n = new int[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print("整数値：");
			n[i] = stdIn.nextInt();
		}
		
		System.out.println("\n最小値：" + min(n[0], n[1], n[2]));
	}
}
		