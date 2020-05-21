import java.util.Scanner;

class ex_7_16 {
	
	static int minOf(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		return min;
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
		
		System.out.println("配列aの要素の最小値 = " + minOf(a));
	}
}