// ����\���p�P��̊w�K�v���O����

import java.util.Random;
import java.util.Scanner;

class ex_6_14 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
			"January", "February", "March", "April", "May", "June", "July", 
			"August", "September", "October", "November", "December"
		};
		
		System.out.println("�p��̌�������͂��Ă��������B");
		System.out.println("�Ȃ��A�擪�͑啶���ŁA2�����ڈȍ~�͏������Ƃ��܂��B");
		
		int retry = 1;
		int pre = 12;
		int month = 0;
		String eng = "";
		
		while (retry == 1) {
			
			do {
				month = rand.nextInt(12);
			} while (pre == month);
			pre = month;
			
			while (!(eng.equals(monthString[month]))) {
				System.out.print((month + 1) + "���F");
				eng = stdIn.next();
				
				if (!(eng.equals(monthString[month])))
					System.out.println("�Ⴂ�܂��B");
			}
			
			System.out.print("�����ł��B������x�H 1�cYes�^0�cNo�F");
			retry = stdIn.nextInt();
		}
	}
}
		