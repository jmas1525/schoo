import java.util.Scanner;

class ex_4_7 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("何個表示しますか：");
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