// 絶対値を返す
import java.util.Scanner;

class ex_7_31 {
	
	static int absolute(int x) {
		if(x >= 0)		return x;
		else			return (-1) * x;
	}
	
	static long absolute(long x) {
		if(x >= 0)		return x;
		else			return (-1) * x;
	}
	
	static float absolute(float x) {
		if(x >= 0)		return x;
		else			return (-1) * x;
	}
	
		static double absolute(double x) {
		if(x >= 0)		return x;
		else			return (-1) * x;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("int型の変数a：");
		int a = stdIn.nextInt();
		
		System.out.print("long型の変数b：");
		long b = stdIn.nextLong();
		
		System.out.print("float型の変数c：");
		float c = stdIn.nextFloat();
		
		System.out.print("double型の変数d：");
		double d = stdIn.nextDouble();
		
		System.out.println("aの絶対値は" + absolute(a) + "です。");
		System.out.println("bの絶対値は" + absolute(b) + "です。");
		System.out.println("cの絶対値は" + absolute(c) + "です。");
		System.out.println("dの絶対値は" + absolute(d) + "です。");
	}
}