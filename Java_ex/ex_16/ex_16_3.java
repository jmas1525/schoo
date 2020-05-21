// 配列の要素に値を読み込んで並びを反転する（バグあり：reverseで例外を捕捉）

import java.util.Scanner;

public class ex_16_3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int num = stdIn.nextInt();

		int[] x = new int[num];


		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}
		stdIn.close();
		reverse(x);

		System.out.println("要素の並びを反転しました。");
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}

	}

	// 配列aの要素を交換
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 配列aの並びを反転（誤り）
	static void reverse(int[] a) {
		try {
			for (int i = 0; i < a.length / 2; i++)
				swap(a, i, a.length - i);		// (第3引数)正しくは、a.length - i - 1
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(1);
		}

	}

}
