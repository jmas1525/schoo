import java.util.Scanner;

class ex_7_19 {
	
	static void aryRmvN(int[] a, int idx, int n) {
		for (int i = idx; i < a.length - n; i++) {
			a[i] = a[i + n];
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("a = {");
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i != n -1)
				System.out.print(", ");
		}
		
		System.out.println("}");
		
		System.out.println("配列aから要素a[idx]を先頭とするN個の要素を削除します。");
		
		int idx;
		int N;
		do {
			System.out.print("削除するインデックスidx：");
			idx = stdIn.nextInt();
		} while (idx < 0 || idx >= a.length);
		
		do {
			System.out.print("正の整数N：");
			N = stdIn.nextInt();
			if(N + idx > a.length)		System.out.println("N + idx が配列aの要素数以下になるようにしてください。");
		} while (N < 0 || N + idx > a.length);
		
		aryRmvN(a, idx, N);
		
		System.out.println("削除後の配列aを表示します。");
		System.out.print("a = {");
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i != n -1)
				System.out.print(", ");
		}
		
		System.out.println("}");
		
	}
}