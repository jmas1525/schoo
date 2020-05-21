import java.util.Scanner;

class ex_7_13 {
	
	static int pow2(int n) {
		int pow = 1;
		while(n-- > 0)	{ pow *= 2;}
		return pow;
	}
	
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	static int set(int x, int pos) {
		return x | pow2(pos);
	}
	
	static int reset(int x, int pos) {
		return x & (~pow2(pos));
	}
	
	static int inverse(int x, int pos) {
		return x ^ pow2(pos);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数xとposについて、以下を表示します。");
		System.out.println("・整数xの値と、そのビット構成");
		System.out.println("・整数xのposビット目を1にした値と、そのビット構成");
		System.out.println("・整数xのposビット目を0にした値と、そのビット構成");
		System.out.println("・整数xのposビット目を反転した値と、そのビット構成");
		System.out.println("(ビット目は最下位から0, 1, 2と数えます。)");
		
		System.out.println();
		System.out.print("整数x：");
		int x = stdIn.nextInt();
		int pos;
		
		do {
			System.out.print("0～31の正の整数pos：");
			pos = stdIn.nextInt();
		} while (pos < 0 || pos > 31);
		
		System.out.println("x = " + x);
		System.out.print("xのビット構成 = ");
		printBits(x);
		System.out.println();
		
		System.out.println("xのposビット目を1にした値 = " + set(x, pos));
		System.out.print("そのビット構成 = ");
		printBits(set(x, pos));
		System.out.println();
		
		System.out.println("xのposビット目を0にした値 = " + reset(x, pos));
		System.out.print("そのビット構成 = ");
		printBits(reset(x, pos));
		System.out.println();
		
		System.out.println("xのposビット目を反転した値 = " + inverse(x, pos));
		System.out.print("そのビット構成 = ");
		printBits(inverse(x, pos));
		System.out.println();
	}
}