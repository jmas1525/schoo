// ���`�T��

import java.util.Random;
import java.util.Scanner;

class ex_6_7 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int n = 12;
		int[] a = new int[n];
		
		for (int j = 0; j < n; j++) 
			a[j] = rand.nextInt(10);
		
		System.out.print("�z��a�̑S�v�f�̒l\n{ ");
		for (int j = 0; j < n; j++)
			System.out.print(a[j] + " ");
		System.out.println("}");
		
		System.out.print("�T�����l�F");
		int key = stdIn.nextInt();
		
		int i;
		for (i = n - 1; i >= 0; i--)
			if (a[i] == key)
				break;
		
		if (i >= 0)										//�T������
			System.out.println("�����a[" + i + "]�ɂ���܂��B");
		else											//�T�����s
			System.out.println("����͂���܂���B");
	}
}