import java.util.Scanner;

class ex_6_16 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		
		System.out.println("4行3列の行列aに整数の値を格納します。");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = stdIn.nextInt();
			}
		}
		
		System.out.println("\n3行4列の行列bに整数の値を格納します。");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("b[" + i + "][" + j + "] = ");
				b[i][j] = stdIn.nextInt();
			}
		}
		
		int[][] p = new int[4][4];
		
		// 行列の積を求める
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 3; k++) {
					p[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		System.out.println("行列aとbの積pを表示します。");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("p[%d][%d] = %4d ", i, j, p[i][j]);
			}
			System.out.println();
		}
	}
}
				