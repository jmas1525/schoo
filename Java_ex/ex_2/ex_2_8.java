import java.util.Random;
import java.util.Scanner;


class ex_2_8 {
	
	public static void main(String args[]) {
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("�����l�F");
		int x = stdIn.nextInt();			// x�ɐ����l��ǂݍ���
		
		int y = rand.nextInt(11) + -5;		// -5�`5�̒l�𐶐�
		
		System.out.println("���̒l�́}5�̗����𐶐����܂����B�����" + (x + y) + "�ł��B");

	}
}