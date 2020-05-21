import java.util.Scanner;

class ex_7_25 {
	
	static Scanner stdIn = new Scanner(System.in);
	
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		int[] rmv = new int[a.length - n];
		
		for (int i = 0; i < rmv.length; i++) {
			if(i < idx)	rmv[i] = a[i];
			else		rmv[i] = a[i + n];
		}
		return rmv;
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
	
	public static void main(String[] args) {
		
		System.out.println("配列aを作成します。");
		int[] a = makeArray();
		
		System.out.print("a = ");
		printArray(a);
		
		int idx;
		System.out.println("配列aから要素a[idx]を先頭とするn個の要素を削除した配列bを作成します。");
		do {
			System.out.print("削除するインデックスidx：");
			idx = stdIn.nextInt();
			if(idx < 0 || idx >= a.length)	System.out.println("a[" + idx + "]は存在しません。");
		} while (idx < 0 || idx >= a.length);
		
		int n;
		do {
			System.out.print("削除する要素の個数n：");
			n = stdIn.nextInt();
			if (n + idx > a.length)
				System.out.println("n + idx が配列aの要素数以下となるようにしてください。");
		} while (n < 0 || n + idx > a.length);
		
		int[] b = arrayRmvOfN(a, idx, n);
		
		System.out.print("b = ");
		printArray(b);
	}
}