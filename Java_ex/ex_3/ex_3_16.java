import java.util.Scanner;

class ex_3_16 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		
		System.out.print("整数c：");
		int c = stdIn.nextInt();
		
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		if(a > c) {
			int t = a;
			a = c;
			c = t;
		}
		
		if(b > c) {
			int t = b;
			b = c;
			c = t;
		}
		
		System.out.println("a≦b≦cとなるようにソートしました。");
		System.out.println("変数aは" + a + "です。");
		System.out.println("変数bは" + b + "です。");
		System.out.println("変数cは" + c + "です。");
	}
}