import java.util.Scanner;

class ex_7_17 {
	
	static int linearSearchR(int[] a, int key) {
		for (int i = a.length - 1; i >= 0; i--)
		if (a[i] == key)
			return i;
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("a = {");
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i != n -1)
				System.out.print(", ");
		}
		
		System.out.println("}");
		
		System.out.print("�T���l�F");
		int key = stdIn.nextInt();
		
		int idx = linearSearchR(a, key);
		
		if (idx == -1)
			System.out.println("���̒l�̗v�f�͑��݂��܂���B");
		else
		System.out.println("���̒l��a[" + idx + "]�ɂ���܂��B");
	}
}