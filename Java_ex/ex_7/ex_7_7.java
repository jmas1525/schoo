import java.util.Scanner;

class ex_7_7 {
	
	static void putChars(char c, int n) {
		while(n-- > 0)
			System.out.print(c);
	}
	
	static void putStars(int n) {
		putChars('*', n);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("‚¢‚­‚Â‚Ì*‚ğo—Í‚µ‚Ü‚·‚©H");
		System.out.print("ŒÂ”F");
		
		int n = stdIn.nextInt();
		
		putStars(n);
	}
}