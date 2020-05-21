import java.util.Scanner;

class ex_7_20 {
	
	static void aryIns(int[] a, int idx, int x) {
		for (int i = a.length - 1; i > idx; i--) {
			a[i] = a[i - 1];
		}
		a[idx] = x;
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
		
		System.out.println("配列aの要素a[idx]にxを挿入します。");
		
		int idx;
		do {
			System.out.print("挿入するインデックスidx：");
			idx = stdIn.nextInt();
		} while (idx < 0 || idx >= a.length);
		
		System.out.print("挿入する値x：");
		int x = stdIn.nextInt();
		
		aryIns(a, idx, x);
		
		System.out.println("挿入後の配列aを表示します。");
		System.out.print("a = {");
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i != n -1)
				System.out.print(", ");
		}
		
		System.out.println("}");
		
	}
}