// �z��̑S�v�f���t���ɃR�s�[���ĕ\��

import java.util.Scanner;

class ex_6_13 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		//  �z��̗v�f���̓���
		do {
			System.out.print("�z��̗v�f��(0�ŏI��)�F");
			n = stdIn.nextInt();
			if (n == 0)		System.exit(0);
			if (n < 0)		System.out.println("���̒l����͂��Ă��������B");
		} while (n < 0);
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		System.out.println("�e�v�f�̒l(����)����͂��Ă��������B");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i +"] = ");
			a[i] = stdIn.nextInt();
		}
		
		for (int i = 0; i < n; i++)
			b[n - i - 1] = a[i];
		
		System.out.println("\na�̑S�v�f��b�ɋt���ŃR�s�[���܂����B");
		
		for (int i = 0; i < n; i++)
			System.out.println("b[" + i +"] = " + b[i]);
	}
}