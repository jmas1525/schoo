import java.util.Scanner;

class ex_7_1 {
	
	static int signOf(int n) {
		if(n < 0)		return -1;
		else if(n > 0)	return 1;
		else			return 0;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���͂��ꂽ�����l�ɂ���āA�l��ԋp���܂��B");
		System.out.println("�� �� -1");
		System.out.println("0 �� 0");
		System.out.println("�� �� 1\n");
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		System.out.println(signOf(n));
	}
}
		