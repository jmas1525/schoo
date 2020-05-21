import java.util.Scanner;

class ex_7_22 {
	
	static int[] arrayClone(int[] a) {
		int[] copy = new int[a.length];
		for (int i = 0; i < a.length; i++)
			copy[i] = a[i];
		return copy;
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
		
		int[] b = arrayClone(a);
		
		System.out.println("配列aと同じ要素数、同じ要素をもつ配列bを生成しました。");
		
		System.out.print("b = {");
		
		for (int i = 0; i < n; i++) {
			System.out.print(b[i]);
			if (i != n -1)
				System.out.print(", ");
		}
		
		System.out.println("}");
	}
}