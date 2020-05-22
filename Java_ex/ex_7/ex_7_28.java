// ��̍s��̘a�����߂�

class ex_7_28 {
	
	// �s��x��y�̘a��sum�ɑ�����ĕԋp//
	static int[][] addMatrix(int[][] x, int[][] y) {
		int[][] sum = new int[x.length][];
		for (int i = 0; i < x.length; i++)
			sum[i] = new int[x[i].length];
		
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				sum[i][j] = x[i][j] + y[i][j];
		return sum;
	}
	
	// �z��m�̑S�v�f��\��
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
		int[][] c = addMatrix(a, b);
		
		System.out.println("�s��a");	printMatrix(a);
		System.out.println("�s��b");	printMatrix(b);
		System.out.println("�s��c");	printMatrix(c);
	}
}