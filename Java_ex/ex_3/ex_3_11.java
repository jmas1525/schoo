// �ǂݍ��񂾐����l�̕����i���^���^�O�j�𔻒肵�ĕ\��

import java.util.Scanner;

class ex_3_11 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����lA�F");
		int A = stdIn.nextInt();
		
		System.out.print("�����lB�F");
		int B = stdIn.nextInt();
		
		int difference = A > B ? A - B : B - A;
		
		System.out.println("�����̒l�̍���" + (difference <= 10 ? "10�ȉ�" : "11�ȏ�") + "�ł��B");
	}
}