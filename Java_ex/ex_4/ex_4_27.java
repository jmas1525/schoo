import java.util.Random;
import java.util.Scanner;

class ex_4_27 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);
		int limit;
		
		do {
			System.out.print("�i�����ăQ�[���j�����񐔁F");
			limit = stdIn.nextInt();
		} while (limit <= 0);
		
		
		System.out.println("�����ăQ�[���J�n!!");
		System.out.println("0�`99�̐��𓖂ĂĂ��������B");
		System.out.println("�񐔐�����" + limit + "��ł��B");
		
		int x;
		
		do {
			System.out.print("�������ȁF");
			x = stdIn.nextInt();
			limit--;
			
			if(x > no)
				System.out.println("�����Ə����Ȑ�����B");
			else if(x < no)
				System.out.println("�����Ƒ傫�Ȑ�����B");
			else
				System.out.println("�����ł��B");
			
			if (limit > 0)
				System.out.println("����" + limit + "��");
			else {
				System.out.println("�I���I\n������" + no + "�ł��B");
				break;
			}
		} while (x != no);
	}
}