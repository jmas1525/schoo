import java.util.Scanner;

class ex_6_17 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[][] score = new int[2][6];
		String[] kamoku = {"����","���w"};
		
		System.out.println("6�l��2�Ȗځi����E���w�j�̓_����ǂݍ��݂܂��B");
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(i + 1 + "�l�ڂ�" + kamoku[j] + "�̓_���F");
				score[j][i] = stdIn.nextInt();
			}
		}
		
		double[] kamokuAve = new double[2];
		double[] indivAve = new double[6];
		
		// ���ϓ_�����߂�
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				kamokuAve[j] += score[j][i];
				indivAve[i] += score[j][i];
			}
		}
		
		for (int i = 0; i < 2; i++)		kamokuAve[i] /= indivAve.length;
		for (int i = 0; i < 6; i++)		indivAve[i] /= kamokuAve.length;
		
		
		System.out.println("�Ȗڂ��Ƃ̕��ϓ_��\�����܂��B");
		for (int i = 0; i < 2; i++) {
			System.out.println(kamoku[i] + "�̕��ϓ_��" + kamokuAve[i] + "�_�ł��B");
		}
		
		System.out.println("���k���Ƃ̕��ϓ_��\�����܂��B");
		for (int i = 0; i < 6; i++) {
			System.out.println(i + 1 + "�l�ڂ̕��ϓ_��" + indivAve[i] + "�_�ł��B");
		}
	}
}