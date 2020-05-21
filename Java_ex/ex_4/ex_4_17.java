import java.util.Scanner;

class ex_4_17 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do{
			System.out.print("®”’lF");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		int count = 0;
		
		for(int i = 1; i <= n; i++){
			
			if(n % i == 0){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("–ñ”‚Í" + count + "ŒÂ‚Å‚·B");
	}
}