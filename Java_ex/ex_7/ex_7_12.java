// n�r�b�g��]

import java.util.Scanner;

class ex_7_12 {
	
	static int rRotate(int x, int n) {
		int a = x >>> n;
		int xr = (x << 32 - n);
		return a | xr;
	}
	
	static int lRotate(int x, int n) {
		int a = x << n;
		int xl = (x >>> 32 - n);
		return a | xl;
	}
	
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����x��n�r�b�g��]�����l�ƁA���̃r�b�g�\����ԋp���܂��B");
		System.out.print("����x�F");
		int x = stdIn.nextInt();
		int n;
		
		do {
			System.out.print("��]��(���̒l)�F");
			n = stdIn.nextInt();
		} while (n < 0);
		
		System.out.println("����x = " + x);
		System.out.print("����x�̃r�b�g�\�� = ");
		printBits(x);
		System.out.println();
		
		System.out.println("�E��" + n + "�r�b�g��]�����l = " + rRotate(x, n));
		System.out.print("���̒l�̃r�b�g�\�� = ");
		printBits(rRotate(x, n));
		System.out.println();
		
		System.out.println("����" + n + "�r�b�g��]�����l = " + lRotate(x, n));
		System.out.print("���̒l�̃r�b�g�\�� = ");
		printBits(lRotate(x, n));
		System.out.println();
	}
}