// �ÎZ�̓g���[�j���O

import java.util.Scanner;
import java.util.Random;

class ex_7_10 {
	
	static Scanner stdIn = new Scanner(System.in);
	
	//--- ���s�̊m�F ---//
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("������x�H<Yes�c1�^No�c0>�F");
			cont = stdIn.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("�ÎZ�̓g���[�j���O!!");
		do {
			int x = rand.nextInt(900) + 100;	// 3���̐�
			int y = rand.nextInt(900) + 100;	// 3���̐�
			int z = rand.nextInt(900) + 100;	// 3���̐�
			int a = rand.nextInt(4);			// ���̎��
			
				switch (a) {
					case 0:
						while (true) {
							System.out.print(x + " + " + y + " + " + z + " = ");
							int k = stdIn.nextInt();
							if (k == x + y + z)
								break;
							System.out.println("�Ⴂ�܂���!!");
						}
					break;
					
					case 1:
						while (true) {
							System.out.print(x + " + " + y + " - " + z + " = ");
							int k = stdIn.nextInt();
							if (k == x + y - z)
								break;
							System.out.println("�Ⴂ�܂���!!");
						}
					break;
					
					case 2:
						while (true) {
							System.out.print(x + " - " + y + " + " + z + " = ");
							int k = stdIn.nextInt();
							if (k == x - y + z)
								break;
							System.out.println("�Ⴂ�܂���!!");
						}
					break;
					
					case 3:
						while (true) {
							System.out.print(x + " - " + y + " - " + z + " = ");
							int k = stdIn.nextInt();
							if (k == x - y - z)
								break;
							System.out.println("�Ⴂ�܂���!!");
						}
					break;
				}
		} while (confirmRetry());
	}
}