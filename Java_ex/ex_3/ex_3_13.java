// �ǂݍ��񂾐����l�̕����i���^���^�O�j�𔻒肵�ĕ\��

import java.util.Scanner;

class ex_3_13 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int A = stdIn.nextInt();
		
		System.out.print("�����l�F");
		int B = stdIn.nextInt();
		
		System.out.print("�����l�F");
		int C = stdIn.nextInt();
		
		int med = 0;
		
		if(B <= A && A <= C)    med = A;
		if(C <= A && A <= B)    med = A;
		if(A <= B && B <= C)    med = B;
		if(C <= B && B <= A)    med = B;
		if(A <= C && C <= B)    med = C;
		if(B <= C && C <= A)    med = C;
		
		System.out.println("�����l��" + med + "�ł��B");
	}
}