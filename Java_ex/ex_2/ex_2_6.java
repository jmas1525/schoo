//�O�p�`�̖ʐς����߂�

import java.util.Scanner;

class ex_2_6 {
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�O�p�`�̖ʐς����߂܂��B");
		
		System.out.print("��ӁF");			// x�̒l�̓��͂𑣂�
		double x = stdIn.nextDouble();			// x�Ɏ����l��ǂݍ���
		
		System.out.print("�����F");			// y�̒l�̓��͂𑣂�
		double y = stdIn.nextDouble();			// y�Ɏ����l��ǂݍ���
		
		System.out.println("�ʐς�" + x * y / 2 + "�ł��B");
	}
}