// 凹凸な二次元配列

import java.util.Scanner;

class ex_6_18 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[][] c;
		int row;
		
		do {
			System.out.print("配列cの行数：");
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
				System.out.printf("c[%d][%d] = ", i, j);
				c[i][j] = stdIn.nextInt();
			}
			System.out.println();
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < c[i].length; j++) 
				System.out.printf("%3d", c[i][j]);
			System.out.println();
		}
	}
}