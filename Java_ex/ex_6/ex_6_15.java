// ����\���p�P��̊w�K�v���O����

import java.util.Random;
import java.util.Scanner;

class ex_6_15 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] DOTW = {"��", "��", "��", "��", "��", "�y", "��"};		// Day of The Week �� DOTW
		String[] engString = {
			"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"
		};
		
		System.out.println("�p��̗j��������͂��Ă��������B");
		
		int retry = 1;
		int pre = 7;
		int day = 0;
		String eng = "";
		
		while (retry == 1) {
			
			do {
				day = rand.nextInt(7);
			} while (pre == day);
			pre = day;
			
			while (!(eng.equals(engString[day]))) {
				System.out.print(DOTW[day] + "�j���F");
				eng = stdIn.next();
				
				if (!(eng.equals(engString[day])))
					System.out.println("�Ⴂ�܂��B");
			}
			
			System.out.print("�����ł��B������x�H 1�cYes�^0�cNo�F");
			retry = stdIn.nextInt();
		}
	}
}
		