// �ǂݍ��񂾐����l�̕����i���^���^�O�j�𔻒肵�ĕ\��

import java.util.Scanner;

class ex_3_4 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����la�F");
		double a = stdIn.nextDouble();
		
		System.out.print("�����lb�F");
		double b = stdIn.nextDouble();
		
		if(a - b > 0)
			System.out.println("a�̕����傫���ł��B");
		else if(a - b < 0)
			System.out.println("b�̕����傫���ł��B");
		else
			System.out.println("a��b�͓����l�ł��B");
	}
}