import java.util.Scanner;

class ex_4_21_�E�����p {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�E�����p�̎O�p�`��\�����܂��B");
		System.out.print("�i���́F");
		int n = stdIn.nextInt();
		
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				
				if (j <= i - 1)  System.out.print(" ");
				else         System.out.print('*');
			}
			System.out.println();
		}
	}
}