import java.util.Scanner;

class ex_4_24 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("�f��������s���܂��B");
		
		do {
			System.out.print("���̐����l�F");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int divisor = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				divisor++;
		}
		
		if (divisor == 2)  System.out.println("���̒l�͑f���ł��B");
		else               System.out.println("���̒l�͑f���ł͂���܂���B");
	}
}