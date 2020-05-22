import java.util.Scanner;

class ex_6_8 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("配列の要素数(0で終了)：");
			n = stdIn.nextInt();
			if (n == 0)		System.exit(0);
			if (n < 0)		System.out.println("正の値を入力してください。");
		} while (n < 0);
		
		System.out.println("各要素の値(小数)を入力してください。");
		double[] a = new double[n];
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextDouble();
			sum += a[i];
		}
		
		System.out.println("全要素の合計値は" + sum + "です。");
		System.out.println("全要素の平均値は" + (sum / n) + "です。");
	}
}