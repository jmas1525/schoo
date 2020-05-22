import java.util.Scanner;

class ex_4_9 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do{
			System.out.print("nの値：");
			n = stdIn.nextInt();
			
			if(n < 1)  System.out.println("正の整数値を入力してください。");
		} while (n < 1);
		
		int product = 1;
		int t = n;
		
		while(t > 0){
			product *= t;
			t--;
		}
		
		System.out.println("1から" + n + "までの積は" + product + "です。");
	}
}