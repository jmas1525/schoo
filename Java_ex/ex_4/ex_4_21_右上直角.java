import java.util.Scanner;

class ex_4_21_�E�㒼�p {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�E�㒼�p�̎O�p�`��\�����܂��B");
		System.out.print("�i���́F");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				
				if (j <= i - 1)  System.out.print(" ");
				else         System.out.print('*');
			}
			System.out.println();
		}
	}
}