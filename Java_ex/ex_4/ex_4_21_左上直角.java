import java.util.Scanner;

class ex_4_21_���㒼�p {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���㒼�p�̎O�p�`��\�����܂��B");
		System.out.print("�i���́F");
		int n = stdIn.nextInt();
		
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}