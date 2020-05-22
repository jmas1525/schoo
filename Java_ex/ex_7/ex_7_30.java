// �ŏ��l�����߂�
import java.util.Scanner;

class ex_7_30 {
	
	static Scanner stdIn = new Scanner(System.in);
	
	static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	static int min(int a, int b, int c) {
		int min = a;
		if(min > b)		min = b;
		if(min > c)		min = c;
		return min;
	}
	
	static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if(min > a[i])		min = a[i];
		}
		return min;
	}
	
	static int[] makeArray() {
		System.out.print("�v�f���F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("[" + i + "]�F");
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
	
	public static void main(String[] args) {
		
		System.out.println("�z��a���쐬���܂��B");
		int[] a = makeArray();
		
		System.out.print("a = ");
		printArray(a);
		
		System.out.println("�z��a�̗v�f�̍ŏ��l��" + min(a) +"�ł��B");
		
		System.out.println("�����lb,c,d����͂��Ă��������B");
		System.out.print("����b�F");
		int b = stdIn.nextInt();
		System.out.print("����c�F");
		int c = stdIn.nextInt();
		System.out.print("����d�F");
		int d = stdIn.nextInt();
		
		System.out.println("����b,c�̍ŏ��l��" + min(b, c) +"�ł��B");
		System.out.println("����b,c,d�̍ŏ��l��" + min(b, c, d) +"�ł��B");
	}
}