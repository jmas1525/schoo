import java.util.Scanner;

class ex_5_3 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数xはboolean型です。");
		
		System.out.print("x：");
		boolean x = stdIn.nextBoolean();

		System.out.println("x = " + x);
	}
}