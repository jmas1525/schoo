import java.util.Scanner;

class ex_3_18 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�G�߂����߂܂��B\n�����ł����F");
		int month = stdIn.nextInt();
		
		switch(month) {
		case 12 :
		case 1 :
		case 2 : System.out.println("����͓~�ł��B"); break;
		case 3 :
		case 4 :
		case 5 : System.out.println("����͏t�ł��B"); break;
		case 6 :
		case 7 :
		case 8 : System.out.println("����͉Ăł��B"); break;
		case 9 :
		case 10 :
		case 11 : System.out.println("����͏H�ł��B"); break;
		
		default : System.out.println("���ɂ�1�`12�̒l����͂��Ă��������B"); break;
		}
	}
}