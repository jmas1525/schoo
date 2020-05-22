import java.util.Scanner;

class ex_4_7 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("âΩå¬ï\é¶ÇµÇ‹Ç∑Ç©ÅF");
		int n = stdIn.nextInt();
		
		int i = 0;
		while (i < n) {
			System.out.print('*');
			i++;
			
			if(i == n) {
				System.out.println();
				break;
			}
			
			System.out.print('+');
			i++;
			
			if(i == n)
				System.out.println();
		}
	}
}