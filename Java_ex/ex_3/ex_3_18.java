import java.util.Scanner;

class ex_3_18 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("季節を求めます。\n何月ですか：");
		int month = stdIn.nextInt();
		
		switch(month) {
		case 12 :
		case 1 :
		case 2 : System.out.println("それは冬です。"); break;
		case 3 :
		case 4 :
		case 5 : System.out.println("それは春です。"); break;
		case 6 :
		case 7 :
		case 8 : System.out.println("それは夏です。"); break;
		case 9 :
		case 10 :
		case 11 : System.out.println("それは秋です。"); break;
		
		default : System.out.println("月には1～12の値を入力してください。"); break;
		}
	}
}