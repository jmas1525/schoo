import java.util.Scanner;

class ex_3_2 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値A：");		//整数値Aの入力を促す
		int A = stdIn.nextInt();			//整数値Aをキーボードの入力から取得
		
		System.out.print("整数値B：");		//整数値Bの入力を促す
		int B = stdIn.nextInt();			//整数値Bをキーボードの入力から取得
		
		if(A % B == 0)								//AをBで割った余りが0かどうか？で分岐
			System.out.println("BはAの約数です。");
		else
			System.out.println("BはAの約数ではありません。");
	}
}