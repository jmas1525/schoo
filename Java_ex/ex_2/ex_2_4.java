import java.util.Scanner;

class ex_2_4 {
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");			// x�̒l�̓��͂𑣂�
		int x = stdIn.nextInt();			// x�ɐ����l��ǂݍ���
		
		System.out.println("10���������l��" + (x + 10) + "�ł��B");
		System.out.println("10���������l��" + (x - 10) + "�ł��B");
	}
}