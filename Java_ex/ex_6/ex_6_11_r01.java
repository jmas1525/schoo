// 1�`10�̒l�������_���ȏ��ɓ���ւ���B�Ƃ����̂�ex6-11�ł��̂ŁA���̖��͂���ȊO�̕��@��

import java.util.Scanner;
import java.util.Random;

class ex_6_11_r01 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int n;
		
		do {
			System.out.print("10�ȉ��̔z��̗v�f��(0�ŏI��)�F");
			n = stdIn.nextInt();
			if (n == 0)		System.exit(0);
			if (n < 0 || n > 10)		System.out.println("10�ȉ��̐��̒l����͂��Ă��������B");
		} while (n < 0 || n > 10);
		
		int[] a = new int[n];
		int j;
		int check;			//�ȑO�̗v�f�ɔ�肪���邩�̔���B��肠�� = 0�A�Ȃ� = 1

		for (int i = 0; i < n; i++) {
			
			do {
				a[i] = rand.nextInt(10) + 1;	// �z��Ƀ����_���Ȓl��������B
				check = 1;
				j = 0;
				//�@���`�F�b�N�̃��[�v�B��肠��̏ꍇ��check = 0�ɍX�V�B
				while (j < i) {
					if (a[j] == a[i]) {
						check = 0;
						break;
					}
					j++;
				}
				
			} while (check == 0);	// ��肪�Ȃ��Ȃ�܂ŌJ��Ԃ��B�i�v�f������������10�����炱��Ȃ��Ƃ��ł���j
			
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}