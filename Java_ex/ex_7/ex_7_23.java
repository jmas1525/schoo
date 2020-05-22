import java.util.Scanner;

class ex_7_23 {
	
	static int[] arraySrchIdx(int[] a, int x) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == x)		count++;
		}
		
		int[] srch = new int[count];
		count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == x){
				srch[count] = i;
				count++;
			}
		}
		
		return srch;
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
		
		System.out.println("配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列bを作成します。");
		System.out.print("検索する値x：");
		int x = stdIn.nextInt();
		
		int[] b = arraySrchIdx(a, x);
		
		System.out.println("");
		
		System.out.print("b = {");
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			if (i != b.length -1)
				System.out.print(", ");
		}
		
		System.out.println("}");
	}
}