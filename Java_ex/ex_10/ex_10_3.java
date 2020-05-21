// MinMaxクラスを利用
import java.util.Scanner;

public class ex_10_3 {
	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("配列aを作成します。");
		int[] a = makeArray();

		System.out.print("a = ");
		printArray(a);

		System.out.println("配列aの要素の最小値は" + MinMax.min(a) + "です。");
		System.out.println("配列aの要素の最大値は" + MinMax.max(a) + "です。");

		System.out.println("整数値b,c,dを入力してください。");
		System.out.print("整数b：");
		int b = stdIn.nextInt();
		System.out.print("整数c：");
		int c = stdIn.nextInt();
		System.out.print("整数d：");
		int d = stdIn.nextInt();

		System.out.println("整数b,cの最小値は" + MinMax.min(b, c) + "です。");
		System.out.println("整数b,cの最大値は" + MinMax.max(b, c) + "です。");
		System.out.println("整数b,c,dの最小値は" + MinMax.min(b, c, d) + "です。");
		System.out.println("整数b,c,dの最大値は" + MinMax.max(b, c, d) + "です。");
	}

	static int[] makeArray() {
		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("[" + i + "]：");
			a[i] = stdIn.nextInt();
		}
		return a;
	}

	static void printArray(int[] a) {
		System.out.print("{");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(", ");
		}

		System.out.println("}");
	}
}

//二値, 三値, 配列の最小値, 最大値を求めるメソッドを集めたユーティリティ

class MinMax {
	//--- 二値の最小値を求める ---//
	public static int min(int a, int b) {
		return a < b ? a : b;
	}

	public static float min(float a, float b) {
		return a < b ? a : b;
	}

	public static double min(double a, double b) {
		return a < b ? a : b;
	}

	public static short min(short a, short b) {
		return a < b ? a : b;
	}

	public static long min(long a, long b) {
		return a < b ? a : b;
	}

	public static byte min(byte a, byte b) {
		return a < b ? a : b;
	}

	//--- 三値の最小値を求める ---//
	public static int min(int a, int b, int c) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	public static double min(double a, double b, double c) {
		double min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	public static float min(float a, float b, float c) {
		float min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	public static short min(short a, short b, short c) {
		short min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	public static long min(long a, long b, long c) {
		long min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	public static byte min(byte a, byte b, byte c) {
		byte min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	//--- 配列の要素の最小値を求める ---//
	public static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		return min;
	}

	public static float min(float[] a) {
		float min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		return min;
	}

	public static double min(double[] a) {
		double min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		return min;
	}

	public static short min(short[] a) {
		short min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		return min;
	}

	public static long min(long[] a) {
		long min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		return min;
	}

	public static byte min(byte[] a) {
		byte min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		return min;
	}

	//--- 二値の最大値を求める ---//
	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static float max(float a, float b) {
		return a > b ? a : b;
	}

	public static double max(double a, double b) {
		return a > b ? a : b;
	}

	public static short max(short a, short b) {
		return a > b ? a : b;
	}

	public static long max(long a, long b) {
		return a > b ? a : b;
	}

	public static byte max(byte a, byte b) {
		return a > b ? a : b;
	}

	//--- 三値の最大値を求める ---//
	public static int max(int a, int b, int c) {
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}

	public static double max(double a, double b, double c) {
		double max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}

	public static float max(float a, float b, float c) {
		float max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}

	public static short max(short a, short b, short c) {
		short max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}

	public static long max(long a, long b, long c) {
		long max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}

	public static byte max(byte a, byte b, byte c) {
		byte max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}

	//--- 配列の要素の最大値を求める ---//
	public static int max(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}

	public static float max(float[] a) {
		float max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}

	public static double max(double[] a) {
		double max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}

	public static short max(short[] a) {
		short max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}

	public static long max(long[] a) {
		long max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}

	public static byte max(byte[] a) {
		byte max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}
}