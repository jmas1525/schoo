import java.util.Scanner;

class ex_4_26 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����F");
		int n = stdIn.nextInt();	// ���Z�����
		
		int sum = 0;
		int count = 0;		// ���ۂɉ��Z�����l�̌�
		
		for (int i = 0; i < n; i++) {
			System.out.print("�����F");
			int t = stdIn.nextInt();
			if (t < 0) {
				System.out.println("���̐��͉��Z���܂���B");
				continue;
			}
			sum += t;
			count++;
		}
		System.out.println("���v��" + sum + "�ł��B");
		if (sum == 0)	System.out.println("���ς�0�ł��B");
		else			System.out.println("���ς�" + (sum / count) + "�ł��B");
	}
}