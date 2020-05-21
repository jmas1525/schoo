// nビット回転

import java.util.Scanner;

class ex_7_12 {
	
	static int rRotate(int x, int n) {
		int a = x >>> n;
		int xr = (x << 32 - n);
		return a | xr;
	}
	
	static int lRotate(int x, int n) {
		int a = x << n;
		int xl = (x >>> 32 - n);
		return a | xl;
	}
	
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数xをnビット回転した値と、そのビット構成を返却します。");
		System.out.print("整数x：");
		int x = stdIn.nextInt();
		int n;
		
		do {
			System.out.print("回転数(正の値)：");
			n = stdIn.nextInt();
		} while (n < 0);
		
		System.out.println("整数x = " + x);
		System.out.print("整数xのビット構成 = ");
		printBits(x);
		System.out.println();
		
		System.out.println("右に" + n + "ビット回転した値 = " + rRotate(x, n));
		System.out.print("その値のビット構成 = ");
		printBits(rRotate(x, n));
		System.out.println();
		
		System.out.println("左に" + n + "ビット回転した値 = " + lRotate(x, n));
		System.out.print("その値のビット構成 = ");
		printBits(lRotate(x, n));
		System.out.println();
	}
}