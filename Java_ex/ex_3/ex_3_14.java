import java.util.Scanner;

class ex_3_14 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����la�F");
		int a = stdIn.nextInt();
		
		System.out.print("�����lb�F");
		int b = stdIn.nextInt();
		
		if(a == b)
			System.out.println("��̒l�͓����ł��B");
		else
			System.out.println("�������ق��̒l��" + (a < b ? a : b) + "�ł��B\n" + 
			"�傫���ق��̒l��" + (a > b ? a : b) + "�ł��B");
	}
}