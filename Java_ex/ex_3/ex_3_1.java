import java.util.Scanner;

class ex_3_1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����l�F");
		int n = stdIn.nextInt();
		
		if(n < 0)
			n = -n;
		
		System.out.println("���̐�Βl��" + n + "�ł��B");
	}
}