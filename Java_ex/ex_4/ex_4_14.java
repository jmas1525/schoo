import java.util.Scanner;

class ex_4_14 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.print("1からnまでの和を求めます。");
		do{
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n < 1);
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(i + " ");
			
			if(i < n)  System.out.print("+ ");
		}
		
		System.out.println("= " + sum);
	}
}