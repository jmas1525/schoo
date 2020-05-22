// ��̍s��̘a�����߂�

class ex_7_27 {
	
	// �s��x��y�̘a��z�ɑ�� //
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		if (x.length != y.length || x.length != z.length)	return false;
		for (int i = 0; i < x.length; i++)
			if (x[i].length != y[i].length || x[i].length != z[i].length)	return false;
		
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				z[i][j] = x[i][j] + y[i][j];
		return true;
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
		int[][] c = new int[2][3];
		
		boolean canAdd = addMatrix(a, b, c);
		
		if(canAdd == false)
			System.out.println("�z��̍s���A����ї񐔂�����łȂ����߁A���Z�ł��܂���ł����B");
		System.out.println("�s��a");	printMatrix(a);
		System.out.println("�s��b");	printMatrix(b);
		System.out.println("�s��c");	printMatrix(c);
	}
}