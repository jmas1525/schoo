import java.util.Scanner;

class ex_2_5 {
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("x�̒l�F");			// x�̒l�̓��͂𑣂�
		double x = stdIn.nextDouble();			// x�Ɏ����l��ǂݍ���
		
		System.out.print("y�̒l�F");			// y�̒l�̓��͂𑣂�
		double y = stdIn.nextDouble();			// y�Ɏ����l��ǂݍ���
		
		System.out.println("���v��" + (x + y) + "�ł��B");
		System.out.println("���ς�" + (x + y) / 2 + "�ł��B");
	}
}