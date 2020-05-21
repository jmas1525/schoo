import java.util.Scanner;

class ex_4_6_List4_7 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("‰½ŒÂ*‚ğ•\¦‚µ‚Ü‚·‚©F");
		int n = stdIn.nextInt();
		
		int i = 0;
		while (i < n) {
			System.out.print('*');
			i++;
			if(i == n)
				System.out.println();
		}
	}
}