// ���͂��ꂽ���̋G�߂�\��

import java.util.Scanner;

class ex_4_19 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		int month;
		
		do {
			do {
				System.out.print("�G�߂����߂܂��B\n�����ł����F");
				month = stdIn.nextInt();
				
				if (month <= 0 || month >= 13)
					System.out.println("���ɂ�1�`12�̒l����͂��Ă��������B");
			} while (month <= 0 || month >= 13);
			
			if (month >= 3 && month <= 5)
				System.out.println("����͏t�ł��B");
			else if (month >= 6 && month <= 8)
				System.out.println("����͉Ăł��B");
			else if (month >= 9 && month <= 11)
				System.out.println("����͏H�ł��B");
			else if (month == 12 || month == 1 || month == 2)
				System.out.println("����͓~�ł��B");
			
			System.out.print("������x�H 1�cYes�^0�cNo�F");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}