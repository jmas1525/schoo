import java.util.Scanner;

class ex_5_2 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数xはfloat型で、変数yはdouble型です。");
		
		System.out.print("x：");
		float x = stdIn.nextFloat();
		
		System.out.print("y：");
		double y = stdIn.nextDouble();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}