//�l����́A2�̊|���Z��2�̊���Z�̒l�ƃr�b�g�\����\��

import java.util.Scanner;

class ex_7_11 {
	
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���͂��ꂽ�l�ɂ��āA�ȉ���\�����܂��B");
		System.out.println("�E���̒l�̃r�b�g�\��");
		System.out.println("�E���̒l��2����Z�����l�ƁA���̃r�b�g�\��");
		System.out.println("�E���̒l��2�����Z�����l�ƁA���̃r�b�g�\��");
		
		System.out.print("����n�F");
		int n = stdIn.nextInt();
		
		System.out.print("����n�̃r�b�g�\���F");
		printBits(n);
		System.out.println();
		
		System.out.println("n��2�{�����l�F" + n * 2);
		System.out.print("�r�b�g�\���F");
		printBits(n * 2);
		System.out.println();
		
		int div = n / 2;
		System.out.println("n��2�Ŋ������l�F" + div);
		System.out.print("�r�b�g�\���F");
		printBits(div);
		System.out.println();
		
	}
}
		