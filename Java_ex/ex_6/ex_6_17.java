import java.util.Scanner;

class ex_6_17 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[][] score = new int[2][6];
		String[] kamoku = {"国語","数学"};
		
		System.out.println("6人の2科目（国語・数学）の点数を読み込みます。");
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(i + 1 + "人目の" + kamoku[j] + "の点数：");
				score[j][i] = stdIn.nextInt();
			}
		}
		
		double[] kamokuAve = new double[2];
		double[] indivAve = new double[6];
		
		// 平均点を求める
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				kamokuAve[j] += score[j][i];
				indivAve[i] += score[j][i];
			}
		}
		
		for (int i = 0; i < 2; i++)		kamokuAve[i] /= indivAve.length;
		for (int i = 0; i < 6; i++)		indivAve[i] /= kamokuAve.length;
		
		
		System.out.println("科目ごとの平均点を表示します。");
		for (int i = 0; i < 2; i++) {
			System.out.println(kamoku[i] + "の平均点は" + kamokuAve[i] + "点です。");
		}
		
		System.out.println("生徒ごとの平均点を表示します。");
		for (int i = 0; i < 6; i++) {
			System.out.println(i + 1 + "人目の平均点は" + indivAve[i] + "点です。");
		}
	}
}