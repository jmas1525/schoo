// �ǂݍ��񂾐����l�̕����i���^���^�O�j�𔻒肵�ĕ\��

import java.util.Scanner;

class ex_3_12 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int A = stdIn.nextInt();
		
		System.out.print("�����l�F");
		int B = stdIn.nextInt();
		
		System.out.print("�����l�F");
		int C = stdIn.nextInt();
		
		int min = A;
		if(min > B)    min = B;
		if(min > C)    min = C;
		
		System.out.println("�ŏ��l��" + min + "�ł��B");
	}
}