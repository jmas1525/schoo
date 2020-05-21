import java.util.Scanner;
import java.util.Random;

class ex_7_8 {
	
	static int random(int a, int b) {
		Random rand = new Random();
		
		if(b < a)	return a;
		
		int area = b - a + 1;
		
		int abrand = rand.nextInt(area) + a;
		
		return abrand;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数a以上b以下の乱数を生成して、その値を返却します。");
		System.out.println("bの値がaより小さい場合には、aの値をそのまま返却します。");
		
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		
		System.out.println(random(a, b));
	}
}