import java.util.Scanner;

class ex_7_9 {
	
	static int readPlusInt() {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("���̐����l�F");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		return n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("���̐����l����͂��Ă��������B");
		
		int n = readPlusInt();
		
		System.out.println(n + "����͂��܂����ˁB");
	}
}