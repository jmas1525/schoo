// �ǂݍ��񂾐����l�̕����i���^���^�O�j�𔻒肵�ĕ\��

import java.util.Scanner;

class ex_3_9 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		double a = stdIn.nextDouble();
		
		System.out.print("�����l�F");
		double b = stdIn.nextDouble();
		
		System.out.println("�傫���ق��̒l��" + (a > b ? a : b) + "�ł��B");
	}
}