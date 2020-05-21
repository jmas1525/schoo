import java.util.Scanner;

class ex_3_14 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数値b：");
		int b = stdIn.nextInt();
		
		if(a == b)
			System.out.println("二つの値は同じです。");
		else
			System.out.println("小さいほうの値は" + (a < b ? a : b) + "です。\n" + 
			"大きいほうの値は" + (a > b ? a : b) + "です。");
	}
}