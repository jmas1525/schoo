import java.util.Scanner;

class ex_7_17 {
	
	static int linearSearchR(int[] a, int key) {
		for (int i = a.length - 1; i >= 0; i--)
		if (a[i] == key)
			return i;
		return -1;
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
		
		System.out.print("探す値：");
		int key = stdIn.nextInt();
		
		int idx = linearSearchR(a, key);
		
		if (idx == -1)
			System.out.println("その値の要素は存在しません。");
		else
		System.out.println("その値はa[" + idx + "]にあります。");
	}
}