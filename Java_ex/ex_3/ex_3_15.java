import java.util.Scanner;

class ex_3_15 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数値b：");
		int b = stdIn.nextInt();
		
		if(a < b) {
			int t = a;
			a = b;
			b = t;
		}
		
		System.out.println("a≧bとなるようにソートしました。");
		System.out.println("変数aは" + a + "です。");
		System.out.println("変数bは" + b + "です。");
	}
}