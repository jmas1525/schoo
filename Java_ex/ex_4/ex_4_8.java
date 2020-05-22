import java.util.Scanner;

class ex_4_8 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do{
			System.out.print("整数値：");
			n = stdIn.nextInt();
			
			if(n < 1)  System.out.println("正の整数値を入力してください。");
		} while (n < 1);
		
		int digit = 0;
		
		while(n > 0){
			digit++;
			n /= 10;
		}
		
		System.out.println("その値は" + digit + "桁です。");
	}
}