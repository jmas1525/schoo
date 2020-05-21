// �z��̃N���[�����쐬����
import java.util.Scanner;

class ex_7_29 {
	
	// 2�����z��a�̃N���[�����쐬//
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
			System.out.print("�z��̍s���F");
			row = stdIn.nextInt();
		} while (row < 0);
		
		int[] column = new int[row];
		
		for (int i = 0; i < row; i ++) {
			do {
				System.out.print(i + 1 + "�s�ڂ̗񐔁F");
				column[i] = stdIn.nextInt();
			} while (column[i] < 0);
		}
		
		c = new int[row][];
		
		System.out.println("�e�v�f�̒l����͂��Ă��������B");
		for (int i = 0; i < row; i++) {
			c[i] = new int[column[i]];
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf("[%d][%d]�F", i, j);
				c[i][j] = stdIn.nextInt();
			}
		}
		return c;
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
		System.out.println("2�����z��a���쐬���܂��B");
		
		int[][] a = makeMatrix();
		
		System.out.println("2�����z��a");	printMatrix(a);
		System.out.println();
		
		int[][] b = aryClone2(a);
		System.out.println("2�����z��a�̃N���[���ł���2�����z��b���쐬���܂����B");
		System.out.println("2�����z��b");	printMatrix(b);
	}
}