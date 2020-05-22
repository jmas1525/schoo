// 月を表す英単語の学習プログラム

import java.util.Random;
import java.util.Scanner;

class ex_6_14 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
			"January", "February", "March", "April", "May", "June", "July", 
			"August", "September", "October", "November", "December"
		};
		
		System.out.println("英語の月名を入力してください。");
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");
		
		int retry = 1;
		int pre = 12;
		int month = 0;
		String eng = "";
		
		while (retry == 1) {
			
			do {
				month = rand.nextInt(12);
			} while (pre == month);
			pre = month;
			
			while (!(eng.equals(monthString[month]))) {
				System.out.print((month + 1) + "月：");
				eng = stdIn.next();
				
				if (!(eng.equals(monthString[month])))
					System.out.println("違います。");
			}
			
			System.out.print("正解です。もう一度？ 1…Yes／0…No：");
			retry = stdIn.nextInt();
		}
	}
}
		