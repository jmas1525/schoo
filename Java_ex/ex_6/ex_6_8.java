import java.util.Scanner;

class ex_6_8 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("�z��̗v�f��(0�ŏI��)�F");
			n = stdIn.nextInt();
			if (n == 0)		System.exit(0);
			if (n < 0)		System.out.println("���̒l����͂��Ă��������B");
		} while (n < 0);
		
		System.out.println("�e�v�f�̒l(����)����͂��Ă��������B");
		double[] a = new double[n];
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextDouble();
			sum += a[i];
		}
		
		System.out.println("�S�v�f�̍��v�l��" + sum + "�ł��B");
		System.out.println("�S�v�f�̕��ϒl��" + (sum / n) + "�ł��B");
	}
}