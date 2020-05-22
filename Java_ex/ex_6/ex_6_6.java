import java.util.Scanner;

class ex_6_6 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int ninzu;
		
		do {
			System.out.print("人数(0でキャンセル)：");
			ninzu = stdIn.nextInt();
			if (ninzu == 0)		System.exit(0);
		} while (ninzu <= 0);
		
			int[] tensu = new int[ninzu];
		
		System.out.println(ninzu + "人の点数を入力せよ。");
		
		for (int i = 0; i < ninzu; i++) {
			do {
				System.out.print((i + 1) + "番の点数：");
				tensu[i] = stdIn.nextInt();
			} while (tensu[i] < 0);
		}
		
		int max = tensu[0];
		int min = tensu[0];
		int sum = tensu[0];
		
		for (int i = 1; i < tensu.length; i++) {
			if (tensu[i] > max)		max = tensu[i];
			if (tensu[i] < min)		min = tensu[i];
			sum += tensu[i];
		}
		
		System.out.println("合計点は" + sum + "点です。");
		System.out.println("平均点は" + (sum / ninzu) + "点です。");
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
	}
}
			
			