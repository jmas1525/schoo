import java.util.Scanner;
import java.util.Random;

class ex_6_12 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;		// �z��̗v�f�� = ����ւ��̉�
		int x;
		int y;
		int t;
		
		do {
			System.out.print("�z��̗v�f��(0�ŏI��)�F");
			n = stdIn.nextInt();
			if (n == 0)		System.exit(0);
			if (n < 0)		System.out.println("���̒l����͂��Ă��������B");
		} while (n < 0);
		
		int[] a = new int[n];
		
		System.out.println("���̔z��");
		for (int i = 0; i < n; i++) {
			a[i] = i;
			System.out.println("a[" + i +"] = " + a[i]);
		}
		
		System.out.println("�V���b�t����̔z��");
		for (int i = 0; i < n; i++) {
			x = rand.nextInt(n);
			do {
			y = rand.nextInt(n);
			} while (y == x);
			
			t = a[x];
			a[x] = a[y];
			a[y] = t;
		}
		
		for (int i = 0; i < n; i++) System.out.println("a[" + i +"] = " + a[i]);
	}
}