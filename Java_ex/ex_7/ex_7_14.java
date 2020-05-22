import java.util.Scanner;

class ex_7_14 {
	
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
	
	static int setN(int x, int pos , int n) {
		for (int i = pos; i < pos + n; i++) 	x = set(x, i);
		return x;
	}
	
	static int resetN(int x, int pos , int n) {
		for (int i = pos; i < pos + n; i++) 	x = reset(x, i);
		return x;
	}
	
	static int inverseN(int x, int pos , int n) {
		for (int i = pos; i < pos + n; i++) 	x = inverse(x, i);
		return x;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数xとpos、nについて、以下を表示します。");
		System.out.println("・整数xの値と、そのビット構成");
		System.out.println("・整数xのposビット目を最下位として連続するn個のビットを1にした値と、そのビット構成");
		System.out.println("・整数xのposビット目を最下位として連続するn個のビットを0にした値と、そのビット構成");
		System.out.println("・整数xのposビット目を最下位として連続するn個のビットを反転した値と、そのビット構成");
		System.out.println("(ビット目は最下位から0, 1, 2と数えます。)");
		
		System.out.println();
		System.out.print("整数x：");
		int x = stdIn.nextInt();
		int pos;
		int n;
		
		do {
			System.out.print("0～31の正の整数pos：");
			pos = stdIn.nextInt();
		} while (pos < 0 || pos > 31);
		
		do {
			System.out.print("正の整数n：");
			n = stdIn.nextInt();
			if(n + pos > 31)		System.out.println("n + pos <= 32 になるようにしてください。");
		} while (n < 0 || n + pos > 32);
		
		System.out.println("x = " + x);
		System.out.print("xのビット構成 = ");
		printBits(x);
		System.out.println();
		
		System.out.println("xのposビット目を最下位として連続するn個のビットを1にした値 = " + setN(x, pos, n));
		System.out.print("そのビット構成 = ");
		printBits(setN(x, pos, n));
		System.out.println();
		
		System.out.println("xのposビット目を最下位として連続するn個のビットを0にした値 = " + resetN(x, pos, n));
		System.out.print("そのビット構成 = ");
		printBits(resetN(x, pos, n));
		System.out.println();
		
		System.out.println("xのposビット目を最下位として連続するn個のビットを反転した値 = " + inverseN(x, pos, n));
		System.out.print("そのビット構成 = ");
		printBits(inverseN(x, pos, n));
		System.out.println();
	}
}