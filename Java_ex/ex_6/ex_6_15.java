// 月を表す英単語の学習プログラム

import java.util.Random;
import java.util.Scanner;

class ex_6_15 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] DOTW = {"月", "火", "水", "木", "金", "土", "日"};		// Day of The Week → DOTW
		String[] engString = {
			"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"
		};
		
		System.out.println("英語の曜日名を入力してください。");
		
		int retry = 1;
		int pre = 7;
		int day = 0;
		String eng = "";
		
		while (retry == 1) {
			
			do {
				day = rand.nextInt(7);
			} while (pre == day);
			pre = day;
			
			while (!(eng.equals(engString[day]))) {
				System.out.print(DOTW[day] + "曜日：");
				eng = stdIn.next();
				
				if (!(eng.equals(engString[day])))
					System.out.println("違います。");
			}
			
			System.out.print("正解です。もう一度？ 1…Yes／0…No：");
			retry = stdIn.nextInt();
		}
	}
}
		