// 浮動小数点数値xを、小数点以下の部分をp桁で、
// 全体を少なくともw桁で表示するメソッドと、そのテストプログラム

import java.util.Scanner;

public class ex_15_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("浮動小数点数値：");
		double d = stdIn.nextDouble();

		System.out.println("小数点以下を5桁で、全体を少なくとも8桁で表示します。");
		printDouble(d, 5, 8);

		stdIn.close();
	}

	static void printDouble(double x, int p, int w) {
		String format = String.format("%%%d.%df", w, p);
		System.out.printf(format, x);
	}
}