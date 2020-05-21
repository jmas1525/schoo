import java.util.Scanner;

class ex_3_8 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("点数：");	
		int score = stdIn.nextInt();
		
		if(score < 0 || score > 100)
			System.out.println("点数には0から100の値を入力してください。");
		else if(score >= 0 && score < 60)
			System.out.println("不可");
		else if(score >= 60 && score < 70)
			System.out.println("可");
		else if(score >= 70 && score < 80)
			System.out.println("良");
		else
			System.out.println("優");
	}
}