// DVDPlayerクラスを利用
import java.util.Scanner;

public class ex_14_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int select = 0;
		int preSelect = 0;

		DVDPlayer dvd = new DVDPlayer();
		System.out.println("DVDプレーヤを起動しました。");

		do {
			System.out.println("操作を選択してください。");
			System.out.println("1：再生");
			System.out.println("2：停止");
			System.out.println("3：スロー再生");
			System.out.println("4：終了");

			do {
				select = stdIn.nextInt();
			} while (select < 1 || select > 4);

			switch (select) {
			case 1:	if(preSelect == 1) break;
					else {dvd.play(); break;}
			case 2:	if(preSelect == 2) break;
					else {dvd.stop(); break;}
			case 3:	if(preSelect == 3) break;
					else {dvd.slow(); break;}
			case 4: System.out.println("終了します。"); break;
			default: break;
			}
			preSelect = select;
		} while (select != 4);

		stdIn.close();
	}

}
