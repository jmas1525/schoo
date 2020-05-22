// 3つの値の中央値を求める。（ex3-13とは別の方法で！）

import java.util.Scanner;

class ex_7_4 {
	
	static int sumUp(int a) {
		int sum = 0;
		int max = 1;
		int min = a;
		
		if(max < min) {
			int t = max;
			max = min;
			min = t;
		}
		
		for (int i = min; i <= max; i++)	sum += i;
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1からnまでの全整数の和を返却します。");
		
		System.out.print("整数n：");
		int n = stdIn.nextInt();
		
		System.out.println("\n1から" + n + "までの和：" + sumUp(n));
	}
}
		