import java.util.Scanner;

class ex_4_6_List4_8 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();
		
		int i = 1;
		while (i <= n) {
			System.out.print('*');
			i++;
			if(i == n + 1)
				System.out.println();
		}
	}
}