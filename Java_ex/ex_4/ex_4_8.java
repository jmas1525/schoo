import java.util.Scanner;

class ex_4_8 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do{
			System.out.print("�����l�F");
			n = stdIn.nextInt();
			
			if(n < 1)  System.out.println("���̐����l����͂��Ă��������B");
		} while (n < 1);
		
		int digit = 0;
		
		while(n > 0){
			digit++;
			n /= 10;
		}
		
		System.out.println("���̒l��" + digit + "���ł��B");
	}
}