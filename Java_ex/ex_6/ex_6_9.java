import java.util.Scanner;
import java.util.Random;

class ex_6_9 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;
		
		do {
			System.out.print("�z��̗v�f��(0�ŏI��)�F");
			n = stdIn.nextInt();
			if (n == 0)		System.exit(0);
			if (n < 0)		System.out.println("���̒l����͂��Ă��������B");
		} while (n < 0);
		
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10) + 1;
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}