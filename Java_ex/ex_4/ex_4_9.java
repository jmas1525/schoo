import java.util.Scanner;

class ex_4_9 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do{
			System.out.print("n�̒l�F");
			n = stdIn.nextInt();
			
			if(n < 1)  System.out.println("���̐����l����͂��Ă��������B");
		} while (n < 1);
		
		int product = 1;
		int t = n;
		
		while(t > 0){
			product *= t;
			t--;
		}
		
		System.out.println("1����" + n + "�܂ł̐ς�" + product + "�ł��B");
	}
}