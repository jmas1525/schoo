// ���ʂȓ񎟌��z��

import java.util.Scanner;

class ex_6_19 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[][] c;
		int row;
		
		do {
			System.out.print("�N���X���F");
			row = stdIn.nextInt();
		} while (row < 0);
		
		int[] num = new int[row];
		System.out.println();
		int ninzu = 0;
		
		for (int i = 0; i < row; i ++) {
			do {
				System.out.print(i + 1 + "�g�̐l���F");
				num[i] = stdIn.nextInt();
			} while (num[i] < 0);
			ninzu += num[i];
		}
		
		c = new int[row][];
		System.out.println();
		int[] score = new int[row];
		int all = 0;
		
		for (int i = 0; i < row; i++) {
			c[i] = new int[num[i]];
			for (int j = 0; j < c[i].length; j++) {
				System.out.printf("%d�g%d�Ԃ̓_���F", i + 1, j + 1);
				c[i][j] = stdIn.nextInt();
				score[i] += c[i][j];
				all += c[i][j];
			}
			System.out.println();
		}
		
		double[] scoreAve = new double[row];
		for (int i = 0; i < row; i++)	scoreAve[i] = (double)score[i] / c[i].length;
		
		double allAve = (double)all / ninzu;
		
		System.out.println("  �g |   ���v   ���� ");
		System.out.println("-----+---------------");
		
		for (int i = 0; i < row; i++) {
			System.out.printf("%2d�g |%7d%7.1f \n", i + 1, score[i], scoreAve[i]);
		}
		System.out.println("-----+---------------");
		System.out.printf("  �v |%7d%7.1f \n", all, allAve);
	}
}