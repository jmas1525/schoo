import java.util.Scanner;

class ex_7_9 {
	
	static int readPlusInt() {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("正の整数値：");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		return n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("正の整数値を入力してください。");
		
		int n = readPlusInt();
		
		System.out.println(n + "を入力しましたね。");
	}
}