import java.util.Scanner;

class ex_2_10 {
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���F");			// ���̓��͂𑣂�
		String sei = stdIn.next();			// sei�Ɏ����l��ǂݍ���
		
		System.out.print("���F");			// ���̓��͂𑣂�
		String mei = stdIn.next();			// mei�Ɏ����l��ǂݍ���
		
		System.out.println("����ɂ���" + sei + mei + "����B");
	}
}