import java.util.Scanner;

class ex_7_1 {
	
	static int signOf(int n) {
		if(n < 0)		return -1;
		else if(n > 0)	return 1;
		else			return 0;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("入力された整数値によって、値を返却します。");
		System.out.println("負 → -1");
		System.out.println("0 → 0");
		System.out.println("正 → 1\n");
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		System.out.println(signOf(n));
	}
}
		