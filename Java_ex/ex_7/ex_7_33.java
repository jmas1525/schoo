// 配列の表示
import java.util.Scanner;

class ex_7_33 {
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("1次元配列aを作成します。");
		int[] a = makeArray();
		
		System.out.println("2次元配列bを作成します。");
		int[][] b = makeMatrix();
		
		System.out.println("作成した配列を表示します。");
		System.out.println("配列a");	printArray(a);
		System.out.println("配列b");	printArray(b);
	}
	
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(" ");
		}
		System.out.println();
	}
	
	// 2次元配列の表示
	static void printArray(int[][] a) {
		int[] maxDigit;			// 各列の要素の最大桁数
		int maxRowNum = 0;		// 配列の最大列数
		
		// 配列の最大列数を取得
		for (int i = 0; i < a.length; i++)
			if(a[i].length > maxRowNum)		maxRowNum = a[i].length;
		
		maxDigit = new int[maxRowNum];
		
		// 各列の要素の最大桁数を取得
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				if (String.valueOf(a[i][j]).length() > maxDigit[j])
					maxDigit[j] = String.valueOf(a[i][j]).length();
		
		// printf用のフォーマットを作成
		String[] format = new String[maxRowNum];
		for (int i = 0; i < maxRowNum; i++)
			format[i] = "%-" + maxDigit[i] + "d";
		
		// 配列の表示
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf(format[j],a[i][j]);
				if (j != a[i].length - 1)	System.out.print(" ");
			}
			System.out.println();
		}
	}
		
		
	static int[] makeArray() {
		
		System.out.print("配列の要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("[" + i + "]：");
			a[i] = stdIn.nextInt();
		}
		return a;
	}
	
	static int[][] makeMatrix() {
		Scanner stdIn = new Scanner(System.in);
		
		int[][] c;
		int row;
		
		do {
			System.out.print("配列の行数：");
			row = stdIn.nextInt();
		} while (row < 0);
		
		int[] column = new int[row];
		
		for (int i = 0; i < row; i ++) {
			do {
				System.out.print(i + 1 + "行目の列数：");
				column[i] = stdIn.nextInt();
			} while (column[i] < 0);
		}
		
		c = new int[row][];
		
		System.out.println("各要素の値を入力してください。");
		for (int i = 0; i < row; i++) {
			c[i] = new int[column[i]];
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf("[%d][%d]：", i, j);
				c[i][j] = stdIn.nextInt();
			}
		}
		return c;
	}
}