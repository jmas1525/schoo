// �z��̑S�v�f�ɗ����������ĉ������̖_�O���t�ŕ\��

import java.util.Random;
import java.util.Scanner;

class ex_6_4 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++)
			a[i] = 1 + rand.nextInt(10);
		
		for (int i = 10; i > 0; i--) {
			for (int j = 0; j < n; j++) {
				if (a[j] >= i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < n; i++)		System.out.print("--");
		System.out.println();
		for (int i = 0; i < n; i++)		System.out.printf("%-2d",i % 10);
		System.out.println();
	}
}