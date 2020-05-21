// �z��̕\��
import java.util.Scanner;

class ex_7_33 {
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("1�����z��a���쐬���܂��B");
		int[] a = makeArray();
		
		System.out.println("2�����z��b���쐬���܂��B");
		int[][] b = makeMatrix();
		
		System.out.println("�쐬�����z���\�����܂��B");
		System.out.println("�z��a");	printArray(a);
		System.out.println("�z��b");	printArray(b);
	}
	
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(" ");
		}
		System.out.println();
	}
	
	// 2�����z��̕\��
	static void printArray(int[][] a) {
		int[] maxDigit;			// �e��̗v�f�̍ő包��
		int maxRowNum = 0;		// �z��̍ő��
		
		// �z��̍ő�񐔂��擾
		for (int i = 0; i < a.length; i++)
			if(a[i].length > maxRowNum)		maxRowNum = a[i].length;
		
		maxDigit = new int[maxRowNum];
		
		// �e��̗v�f�̍ő包�����擾
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				if (String.valueOf(a[i][j]).length() > maxDigit[j])
					maxDigit[j] = String.valueOf(a[i][j]).length();
		
		// printf�p�̃t�H�[�}�b�g���쐬
		String[] format = new String[maxRowNum];
		for (int i = 0; i < maxRowNum; i++)
			format[i] = "%-" + maxDigit[i] + "d";
		
		// �z��̕\��
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf(format[j],a[i][j]);
				if (j != a[i].length - 1)	System.out.print(" ");
			}
			System.out.println();
		}
	}
		
		
	static int[] makeArray() {
		
		System.out.print("�z��̗v�f���F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("[" + i + "]�F");
			a[i] = stdIn.nextInt();
		}
		return a;
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
}