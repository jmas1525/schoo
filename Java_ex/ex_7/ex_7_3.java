// 3つの値の中央値を求める。（ex3-13とは別の方法で！）

import java.util.Scanner;

class ex_7_3 {
	
	static int med(int a, int b, int c) {
		int[] desc = {a, b, c};
		for (int i = desc.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(desc[j] < desc[j + 1]) {
					int t = desc[j];
					desc[j] = desc[j + 1];
					desc[j + 1] = t;
					
					//System.out.println(desc[0] + " " + desc[1] +" " + desc[2]);
				}
			}
		}
		return desc[1];
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("3つの整数値の中央値を返却します。");
		
		int[] n = new int[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print("整数値：");
			n[i] = stdIn.nextInt();
		}
		
		System.out.println("\n中央値：" + med(n[0], n[1], n[2]));
	}
}
		