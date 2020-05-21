// 配列のクローンを作成する
import java.util.Scanner;

class ex_7_29 {
	
	// 2次元配列aのクローンを作成//
	static int[][] aryClone2(int[][] a) {
		int[][] clone = new int[a.length][];
		for (int i = 0; i < a.length; i++)
			clone[i] = new int[a[i].length];
		
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				clone[i][j] = a[i][j];
		return clone;
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
		
	
	// 配列mの全要素を表示
	static void printMatrix(int[][] m) {
		for(int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) 
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("2次元配列aを作成します。");
		
		int[][] a = makeMatrix();
		
		System.out.println("2次元配列a");	printMatrix(a);
		System.out.println();
		
		int[][] b = aryClone2(a);
		System.out.println("2次元配列aのクローンである2次元配列bを作成しました。");
		System.out.println("2次元配列b");	printMatrix(b);
	}
}