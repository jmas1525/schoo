//値を入力、2の掛け算と2の割り算の値とビット構成を表示

import java.util.Scanner;

class ex_7_11 {
	
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("入力された値について、以下を表示します。");
		System.out.println("・その値のビット構成");
		System.out.println("・その値に2を乗算した値と、そのビット構成");
		System.out.println("・その値に2を除算した値と、そのビット構成");
		
		System.out.print("整数n：");
		int n = stdIn.nextInt();
		
		System.out.print("整数nのビット構成：");
		printBits(n);
		System.out.println();
		
		System.out.println("nを2倍した値：" + n * 2);
		System.out.print("ビット構成：");
		printBits(n * 2);
		System.out.println();
		
		int div = n / 2;
		System.out.println("nを2で割った値：" + div);
		System.out.print("ビット構成：");
		printBits(div);
		System.out.println();
		
	}
}
		