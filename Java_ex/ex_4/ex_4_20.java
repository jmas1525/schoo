import java.util.Scanner;

class ex_4_20 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("�����`�����܂��B");
		
		do {
			System.out.print("�i���F");
			n = stdIn.nextInt();
			
			if (n <= 0)
				System.out.println("���̐�������͂��Ă��������B");
		} while (n <= 0);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)  System.out.print("*");
			System.out.println();
		}
	}
}
		