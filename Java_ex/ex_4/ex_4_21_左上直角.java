import java.util.Scanner;

class ex_4_21_¶ã’¼Šp {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("¶ã’¼Šp‚ÌŽOŠpŒ`‚ð•\Ž¦‚µ‚Ü‚·B");
		System.out.print("’i”‚ÍF");
		int n = stdIn.nextInt();
		
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}