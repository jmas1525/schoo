import java.util.Scanner;

class ex_4_13 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.print("1����n�܂ł̘a�����߂܂��B");
		do{
			System.out.print("n�̒l�F");
			n = stdIn.nextInt();
		} while (n < 1);
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++)
			sum += i;
		
		System.out.println("1����" + n + "�܂ł̘a��" + sum + "�ł��B");
	}
}