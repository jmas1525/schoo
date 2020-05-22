import java.util.Scanner;

class ex_7_24 {
	
	static Scanner stdIn = new Scanner(System.in);
	
	static int[] arrayRmvOf(int[] a, int idx) {
		int[] rmv = new int[a.length - 1];
		
		for (int i = 0; i < rmv.length; i++) {
			if(i < idx)	rmv[i] = a[i];
			else		rmv[i] = a[i + 1];
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
		System.out.println("配列aから要素a[idx]を削除した配列bを作成します。");
		do {
			System.out.print("削除するインデックスidx：");
			idx = stdIn.nextInt();
			if(idx < 0 || idx >= a.length)	System.out.println("a[" + idx + "]は存在しません。");
		} while (idx < 0 || idx >= a.length);
		
		int[] b = arrayRmvOf(a, idx);
		
		System.out.print("b = ");
		printArray(b);
	}
}