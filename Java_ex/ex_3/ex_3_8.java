import java.util.Scanner;

class ex_3_8 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�_���F");	
		int score = stdIn.nextInt();
		
		if(score < 0 || score > 100)
			System.out.println("�_���ɂ�0����100�̒l����͂��Ă��������B");
		else if(score >= 0 && score < 60)
			System.out.println("�s��");
		else if(score >= 60 && score < 70)
			System.out.println("��");
		else if(score >= 70 && score < 80)
			System.out.println("��");
		else
			System.out.println("�D");
	}
}