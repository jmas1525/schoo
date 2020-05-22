// 二つの行列の和を求める

class ex_7_27 {
	
	// 行列xとyの和をzに代入 //
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		if (x.length != y.length || x.length != z.length)	return false;
		for (int i = 0; i < x.length; i++)
			if (x[i].length != y[i].length || x[i].length != z[i].length)	return false;
		
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				z[i][j] = x[i][j] + y[i][j];
		return true;
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
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int[][] b = { {6, 3, 4}, {5, 1, 2} };
		int[][] c = new int[2][3];
		
		boolean canAdd = addMatrix(a, b, c);
		
		if(canAdd == false)
			System.out.println("配列の行数、および列数が同一でないため、加算できませんでした。");
		System.out.println("行列a");	printMatrix(a);
		System.out.println("行列b");	printMatrix(b);
		System.out.println("行列c");	printMatrix(c);
	}
}