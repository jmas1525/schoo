import java.util.Scanner;

class ex_3_16 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a�F");
		int a = stdIn.nextInt();
		
		System.out.print("����b�F");
		int b = stdIn.nextInt();
		
		System.out.print("����c�F");
		int c = stdIn.nextInt();
		
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		if(a > c) {
			int t = a;
			a = c;
			c = t;
		}
		
		if(b > c) {
			int t = b;
			b = c;
			c = t;
		}
		
		System.out.println("a��b��c�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("�ϐ�a��" + a + "�ł��B");
		System.out.println("�ϐ�b��" + b + "�ł��B");
		System.out.println("�ϐ�c��" + c + "�ł��B");
	}
}