import java.util.Random;
import java.util.Scanner;

class ex_4_27 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);
		int limit;
		
		do {
			System.out.print("（数当てゲーム）制限回数：");
			limit = stdIn.nextInt();
		} while (limit <= 0);
		
		
		System.out.println("数当てゲーム開始!!");
		System.out.println("0～99の数を当ててください。");
		System.out.println("回数制限は" + limit + "回です。");
		
		int x;
		
		do {
			System.out.print("いくつかな：");
			x = stdIn.nextInt();
			limit--;
			
			if(x > no)
				System.out.println("もっと小さな数だよ。");
			else if(x < no)
				System.out.println("もっと大きな数だよ。");
			else
				System.out.println("正解です。");
			
			if (limit > 0)
				System.out.println("あと" + limit + "回");
			else {
				System.out.println("終了！\n正解は" + no + "です。");
				break;
			}
		} while (x != no);
	}
}