// �ǂݍ��񂾐����l�̕����i���^���^�O�j�𔻒肵�ĕ\��

import java.util.Scanner;

class ex_3_10 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int a = stdIn.nextInt();
		
		System.out.print("�����l�F");
		int b = stdIn.nextInt();
		
		System.out.println("�����̒l�̍���" + (a > b ? a - b : b - a) + "�ł��B");
	}
}