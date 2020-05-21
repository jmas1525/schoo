// 最小値を求める
import java.util.Scanner;

class ex_7_30 {
	
	static Scanner stdIn = new Scanner(System.in);
	
	static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	static int min(int a, int b, int c) {
		int min = a;
		if(min > b)		min = b;
		if(min > c)		min = c;
		return min;
	}
	
	static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if(min > a[i])		min = a[i];
		}
		return min;
	}
	
	static int[] makeArray() {
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("[" + i + "]：");
			a[i] = stdIn.nextInt();
		}
		return a;
	}
	
	static void printArray(int[] a) {
		System.out.print("{");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(", ");
		}
		
		System.out.println("}");
	}
	
	public static void main(String[] args) {
		
		System.out.println("配列aを作成します。");
		int[] a = makeArray();
		
		System.out.print("a = ");
		printArray(a);
		
		System.out.println("配列aの要素の最小値は" + min(a) +"です。");
		
		System.out.println("整数値b,c,dを入力してください。");
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		System.out.print("整数c：");
		int c = stdIn.nextInt();
		System.out.print("整数d：");
		int d = stdIn.nextInt();
		
		System.out.println("整数b,cの最小値は" + min(b, c) +"です。");
		System.out.println("整数b,c,dの最小値は" + min(b, c, d) +"です。");
	}
}