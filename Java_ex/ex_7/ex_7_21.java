// �z��̗v�f������
import java.util.Scanner;

class ex_7_21 {
	
	static void aryExchng (int[] a, int[] b) {
		
		int lng = a.length;
		if(lng > b.length)		lng = b.length;
		
		for (int i = 0; i < lng; i++) {
			int t = a[i];
			a[i] = b[i];
			b[i] = t;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		char[] name = {'a', 'b'};
		int[][] a = new int[2][];
		System.out.println("2�̔z��a,b�̑S�v�f�̒l���������܂��B");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("�z��" + name[i] +"�̗v�f���F");
			int n = stdIn.nextInt();
			a[i] = new int[n];
			
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(name[i] + "[" + j + "] = ");
				a[i][j] = stdIn.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(name[i] + " = {");
			
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				if (j != a[i].length -1)
					System.out.print(", ");
			}
			
			System.out.println("}");
		}
		
		aryExchng(a[0], a[1]);
		
		System.out.println("�S�v�f������̔z��a,b��\�����܂��B");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(name[i] + " = {");
			
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				if (j != a[i].length -1)
					System.out.print(", ");
			}
			
			System.out.println("}");
		}
	}
}
		
