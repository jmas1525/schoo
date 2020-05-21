import java.util.Scanner;

class ex_7_18 {
	
	static void aryRmv(int[] a, int idx) {
		for (int i = idx; i < a.length - 1; i++) {
			a[i] = a[i + 1];
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
		
		System.out.println("配列aから要素a[idx]を削除します。");
		
		int idx;
		do {
			System.out.print("削除するインデックスidx：");
			idx = stdIn.nextInt();
		} while (idx < 0 || idx >= a.length);
		System.out.println();
		
		aryRmv(a, idx);
		
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